<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<% response.setHeader("Pragma","No-cache"); response.setHeader("Cache-Control","No-cache"); response.setDateHeader("Expires", -1); response.setHeader("Cache-Control", "No-store"); %>
<!DOCTYPE html>
<html>
<head>
<c:import url="../import/css/commonCss.jsp" />
<c:import url="../import/css/categoriesCss.jsp" />
<c:import url="../import/js/commonJs.jsp" />
<c:import url="../import/js/categoriesJs.jsp" />
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/styles/member_myCart.css">
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
<script type="text/javascript">

	var selectCnt = 0;
	var selectPrice = 0;

	$(function(){
		
		$(".orderCheckBox").click(function(){
			price = $(this).attr("title");
			if($(this).prop("checked")) {
				selectCnt ++;
				selectPrice = Math.floor(selectPrice * 100 + price * 100) / 100;
			} else {
				selectCnt --;
				$("#all").prop("checked", false);
				selectPrice = Math.floor(selectPrice * 100 - price * 100) / 100;
			}
			$("#selectPrice").html(selectPrice);
		});
		
		$("#all").click(function(){
			if($("#all").prop("checked")) {
				selectCnt = 0;
				$(".orderCheckBox").each(function(){
					$(this).prop("checked", true);
					selectCnt++;
				});
				selectPrice = <fmt:formatNumber type="number" value="${totalPrice}" pattern="0.00" maxFractionDigits="2"/>;
				$("#selectPrice").html(selectPrice);
			} else {
				$(".orderCheckBox").each(function(){
					$(this).prop("checked", false);
				});
				selectCnt = 0;
				selectPrice = 0;
				$("#selectPrice").html(selectPrice);
			}
		});
		
		
	});
	
	function ordersAllPay() {
		var o_num = [];
		var g_num = [];
		$(".orderCheckBox").each(function(){
			var onum = $(this).attr("id");
			var gnum = $(this).val();
			o_num.push(onum);
			g_num.push(gnum);
		});
		if(o_num.length > 0) {
			var check = confirm("결제 하시겠습니까?");
			var ordersOnum = o_num.toString();
			var ordersGnum = g_num.toString();
			if(check) {
				$.post("../orders/ordersPayment", {
					o_num : ordersOnum,
					g_num : ordersGnum
				}, function(data) {
					if(data > 0) {
						check = confirm(data + "개의 게임이 결제되었습니다. 나의 게임으로 이동하시겠습니까?");
						if(check) {
							location.href = "./myGame";							
						} else {
							location.reload();
						}
					} else {
						alert("결제 실패하였습니다.");
					}
				});
			}
		}
	}
	
 	function ordersSelectPay() {
 		if(selectCnt < 1) {
 			alert("구매하실 게임을 최소 한개 선택해 주세요");
 		} else {
			var o_num = [];
			var g_num = [];
			$(".orderCheckBox").each(function(){
				if($(this).prop("checked")) {
					var onum = $(this).attr("id");
					var gnum = $(this).val();
					o_num.push(onum);
					g_num.push(gnum);
				}
			});
			if(o_num.length > 0) {
				var check = confirm("결제 하시겠습니까?");
				var ordersOnum = o_num.toString();
				var ordersGnum = g_num.toString();
				if(check) {
					$.post("../orders/ordersPayment", {
						o_num : ordersOnum,
						g_num : ordersGnum
					}, function(data) {
						if(data > 0) {
							check = confirm(data + "개의 게임이 결제되었습니다. 나의 게임으로 이동하시겠습니까?");
							if(check) {
								location.href = "./myGame";							
							} else {
								location.reload();
							}
						} else {
							alert("결제 실패하였습니다.");
						}
					});
				}
			}
 		}
		
	} 

	function ordersDelete(o_num) {
		var check = confirm("정말 삭제 하겠습니까?");
		if(check) {
			$.post("../orders/deleteFromCart",{
				o_num : o_num	
			}, function(data){
				if(data > 0) {
					alert("장바구니에서 삭제 성공하였습니다.");
					$("#orderDiv" + o_num).remove();
					location.reload();
				} else {
					alert("장바구니에서 삭제 실패하였습니다.");
				}
			});
		}
	}
	
	
</script>
<title>${member.nickname}'s Cart</title>
</head>
<body>
	<!-- header -->
	<c:import url="../common/header.jsp"></c:import>
	<!-- superContainer -->
	<div class="super_container">
		<!-- container single_product_container-->
		<div class="container single_product_container">
			<div class="breadcrumbs d-flex flex-row align-items-center">
				<ul>
					<li><a href="<%=request.getContextPath()%>/">Home</a></li>
					<li><a href="./memberMyPage"><i class="fa fa-angle-right"
							aria-hidden="true"></i>My Page</a></li>
					<li class="active"><a
						href="javascript:window.location.href=window.location.href">
							<i class="fa fa-angle-right" aria-hidden="true"></i>My Cart
					</a></li>
				</ul>
			</div>
			<!-- row -->
			<div class="row">
				<!-- col -->
				<div class="col">
					<h2 class="shoppingCartText">Shopping Cart</h2>
					<!-- oneGameCart -->
					<div class="oneGameCart">
						<div id="TopBox">
							<div class="headText" style="margin-top: 5%;">
							<c:if test="${!empty ordersList }">
								<div class=" col-lg-1 innerCartCheckBox">
									<input type="checkbox" id="all"><label for="all"></label>
								</div>
								<div class=" col-lg-6 innerCartGameImgtitle">Game</div>
								<div class=" col-lg-2 innerCartGamePrice">Price</div>
								<div class=" col-lg-2 innerCartGameBuyDate">Purchase Date</div>
								<div class=" col-lg-1 innerCartGameDelete"></div>
							</c:if>
							</div>
						</div>
						<div class="bodyBox">
							<c:choose>
								<c:when test="${empty ordersList }">
									<div class="notFoundGame"><div class="notFoundGameImg"><img alt="" src="<%=request.getContextPath()%>/resources/images/common/notFoundGame.png"> </div>Sorry, No Select Game</div>
								</c:when>
								<c:otherwise>
									<c:forEach items="${ordersList}" var="order" >
										<div id="orderDiv${order.o_num}" class="bodyText">
											<div class=" col-lg-1 innerCartCheckBox">
												<c:choose>
													<c:when test="${order.saleStatus eq 1}">
														<input type="checkbox" title="<fmt:formatNumber type="number" value="${order.price * (100 - order.sale) / 100}" pattern="0.00" maxFractionDigits="2"/>" class="orderCheckBox" id="${order.o_num}"><label for="${order.o_num}"></label>
													</c:when>
													<c:when test="${order.saleStatus eq 0}">
														<input type="checkbox" title="${order.price}" value="${order.g_num}" class="orderCheckBox" id="${order.o_num}"><label for="${order.o_num}"></label>
													</c:when>
												</c:choose>
											</div>
											<div class=" col-lg-2 innerCartGameImg">
												<a href="<%=request.getContextPath()%>/game/gameView?g_num=${order.g_num}" ><img alt="" src="<%=request.getContextPath()%>/resources/upload/images/game/main/${order.fname}"></a>
											</div>
											<div class=" col-lg-4 innerCartGameName"><a href="<%=request.getContextPath()%>/game/gameView?g_num=${order.g_num}" >${order.g_name}</a></div>
											<div class=" col-lg-2 innerCartGamePrice">
												<c:choose>
													<c:when test="${order.saleStatus eq 1}">
														<div class="original_price">$${order.price}</div>
														<div class="product_price">$<fmt:formatNumber type="number" value="${order.price * (100 - order.sale) / 100}" pattern="0.00" maxFractionDigits="2"/></div>
													</c:when>
													<c:when test="${order.saleStatus eq 0}">
														<div class="product_price">$${order.price}</div>
													</c:when>
												</c:choose>
											</div>
											<div class=" col-lg-2 innerCartGameBuyDate">${order.o_date}</div>
											<div class=" col-lg-1 innerCartGameDelete">
												<i class="fa fa-remove" onclick="ordersDelete(${order.o_num})"></i>
											</div>
										</div>
									</c:forEach>
								</c:otherwise>
							</c:choose>
						</div>

					</div>
					<!-- oneGameCart -->
				</div>
				<!-- col -->
			</div>
			<!-- row -->
			<!-- price Total -->
			<c:if test="${not empty ordersList }">
				<div class="row price_area" style="margin: 0 auto;">
					<div class="col-lg-3 price_text">Select Price</div>
					<div class="col-lg-3 price_text">$<span id="selectPrice">0</span></div>
					<div class="col-lg-3 price_text">Total Price</div>
					<div class="col-lg-3 price_text">$<fmt:formatNumber type="number" value="${totalPrice}" pattern="0.00" maxFractionDigits="2"/></div>
				</div>

				<!-- price Total -->
				<!-- button -->
				<div class="col">
					<div class="gameSelectBtn">
						<button onclick="ordersSelectPay()">Select Buy</button>
						<button onclick="ordersAllPay()">All Buy</button>
					</div>
				</div>
			</c:if>
			<!-- button -->
		</div>
		<!-- container single_product_container-->
	</div>
	<!-- superContainer -->

	<c:import url="../common/footer.jsp"></c:import>
</body>
</html>