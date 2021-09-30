<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<% response.setHeader("Pragma","No-cache"); response.setHeader("Cache-Control","No-cache"); response.setDateHeader("Expires", -1); response.setHeader("Cache-Control", "No-store"); %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Games</title>
<c:import url="../import/css/commonCss.jsp" />
<c:import url="../import/css/categoriesCss.jsp" />
<c:import url="../import/js/commonJs.jsp" />
<c:import url="../import/js/categoriesJs.jsp" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/game/gameList.css">
<script type="text/javascript">

	var email = "${member.email}";
	
	// 장바구니에 담기
	function addToCart (g_num) {
		if (email == "") {
			alert("로그인이 필요합니다.");
		} else {
			$.post("../orders/ordersInsert",{
				email : email,
				g_num : g_num
			}, function(data){
				alert(data);
			});
		}
	}

	function pageLink(page){
		var curPage = page;
		$("#gameCurPage").val(page);
		$("#gamePageLink").submit();
	}
</script>
</head>
<body>

	<c:import url="../common/header.jsp" />
	<div class="super_container">

		<!-- page -->
		<form id="gamePageLink" action="./gameList" style="display: none">
			<input id="gameCurPage" type="hidden" name="curPage" />
			<input type="hidden" name="genre" value="${searchInfo.genre}" />
			<input type="hidden" name="kind" value="${searchInfo.kind}" />
			<input type="hidden" name="search" value="${searchInfo.search}" />
		</form>

		<div class="container product_section_container">
			<div class="row">
				<div class="col product_section clearfix">

					<!-- Breadcrumbs -->

					<div class="breadcrumbs d-flex flex-row align-items-center">
						<ul>
							<li><a href="<%=request.getContextPath()%>/">Home</a></li>
							<li class="active"><a href="<%=request.getContextPath()%>/game/gameList"><i
									class="fa fa-angle-right" aria-hidden="true"></i>Game</a></li>
						</ul>
					</div>

					<!-- Sidebar -->

					<div class="sidebar">
						<div class="sidebar_section">
							<div class="sidebar_title">
								<h5>Games Category</h5>
							</div>
							<ul class="sidebar_categories" id="genre_Btn">
								<li><a href="./gameList">All Games</a></li>
								<li><a href="./gameList?genre=RPG">RPG</a></li>
								<li><a href="./gameList?genre=VR">Virtual Reality</a></li>
								<li><a href="./gameList?genre=Indie">Indie</a></li>
								<li><a href="./gameList?genre=Sports">Sports</a></li>
								<li><a href="./gameList?genre=Multiplayer">Multiplayer</a></li>
								<li><a href="./gameList?genre=Simulation">Simulation</a></li>
								<li><a href="./gameList?genre=Stealth">Stealth</a></li>
								<li><a href="./gameList?genre=Strategy">Strategy</a></li>
								<li><a href="./gameList?genre=Adventure">Adventure</a></li>
								<li><a href="./gameList?genre=FPS">FPS</a></li>
								<li><a href="./gameList?genre=Action">Action</a></li>
								<li><a href="./gameList?genre=Tabletop">Tabletop</a></li>
								<li><a href="./gameList?genre=Software">Software</a></li>
								<li><a href="./gameList?genre=Racing">Racing</a></li>
								<li><a href="./gameList?genre=Puzzle">Puzzle</a></li>
								<li><a href="./gameList?genre=Retro">Retro</a></li>
							</ul>
						</div>

					</div>

					<!-- Main Content -->

					<div class="main_content">

						<!-- Products -->
						<div class="products_iso">
							<div class="row">
								<div class="col">
									<c:if test="${member.kind eq 'admin'}">
										<div class="gameInsertbtndiv">
											<a href="./gameInsert" class="gameInsertbtn">INSERT</a>
										</div>
									</c:if>
									<!-- Product Grid -->
									<div class="product-grid">
										<c:choose>
											<c:when test="${pager.totalRow eq 0 }">
												<div class="noGame" style="text-align: center; margin-top: 12%;"><h4>해당 게임이 없습니다.</h4></div>
											</c:when>
											<c:otherwise>
											</c:otherwise>
										</c:choose>
									
										<c:forEach items="${games}" var="game">
											<div class="product-item" >
												<div class="product discount product_filter" onclick="location.href='./gameView?g_num=${game.g_num}'">
													<div class="product_image">
														<img src="../resources/upload/images/game/main/${game.fname}">
													</div>
													<div class="product_info">
														<h6 class="product_name">
															<a href="./gameView?g_num=${game.g_num}">${game.g_name}</a>
														</h6>
														<c:choose>
															<c:when test="${game.saleStatus eq 1}">
																<div class="product_price">
																	$<fmt:formatNumber type="number" value="${game.price * (100 - game.sale) / 100}" pattern="0.00" maxFractionDigits="2"/>
																	<span>$${game.price}</span>
																</div>
															</c:when>
															<c:when test="${game.saleStatus eq 0}">
																<div class="product_price">$${game.price}</div>
															</c:when>
														</c:choose>
													</div>
												</div>
												<div class="red_button add_to_cart_button">
													<a onclick="addToCart(${game.g_num})" >add to cart</a>
												</div>
											</div>
										</c:forEach>
										
									</div>
								</div>
							</div>
						</div>
						<c:if test="${pager.totalPage gt 1}">
				<div>
					<ul class="pagination">
						<%--현재 블럭이 1보다 클 때 Prev 나타남 --%>
						<c:if test="${pager.curBlock gt 1}">
							<li class="page-item">
							<button class="page page-link" onclick="pageLink(${pager.startPage - 1})">Prev</button></li>
						</c:if>
						<%-- 현재 블럭의 페이지 리스트 --%>
						<c:forEach begin="${pager.startPage}" end="${pager.endPage}" var="page">
							<c:choose>
								<%-- 현재 페이지를 활성화 상태로 표시 --%>
								<c:when test="${pager.curPage eq page}">
									<li class="page-item active"><button class="page page-link">${page}</button></li>
								</c:when>
								<%-- 현재 페이지가 아닐때 --%>
								<c:otherwise>
									<li class="page-item"><button class="page page-link" onclick="pageLink(${page})">${page}</button></li>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						<%--현재 블럭이 블럭의 총 갯수보다 작을 때 Next 나타남 --%>
						<c:if test="${pager.curBlock lt pager.totalBlock }">
							<li class="page-item"><button class="page page-link" onclick="pageLink(${pager.endPage + 1})">Next</button></li>
						</c:if>
					</ul>
				</div>
			</c:if>
					</div>
				</div>
			</div>

			<!-- Benefit -->

			<div class="benefit">
				<div class="container">
					<div class="row benefit_row">
						<div class="col-lg-3 benefit_col">
							<div class="benefit_item d-flex flex-row align-items-center">
								<div class="benefit_icon">
									<i class="fa fa-truck" aria-hidden="true"></i>
								</div>
								<div class="benefit_content">
									<h6>free shipping</h6>
									<p>We have no delivery!</p>
								</div>
							</div>
						</div>
						<div class="col-lg-3 benefit_col">
							<div class="benefit_item d-flex flex-row align-items-center">
								<div class="benefit_icon">
									<i class="fa fa-money" aria-hidden="true"></i>
								</div>
								<div class="benefit_content">
									<h6>cach on delivery</h6>
									<p>Please check your email after purchasing the game</p>
								</div>
							</div>
						</div>
						<div class="col-lg-3 benefit_col">
							<div class="benefit_item d-flex flex-row align-items-center">
								<div class="benefit_icon">
									<i class="fa fa-undo" aria-hidden="true"></i>
								</div>
								<div class="benefit_content">
									<h6>no return</h6>
									<p>Unable to withdraw subscription</p>
								</div>
							</div>
						</div>
						<div class="col-lg-3 benefit_col">
							<div class="benefit_item d-flex flex-row align-items-center">
								<div class="benefit_icon">
									<i class="fa fa-clock-o" aria-hidden="true"></i>
								</div>
								<div class="benefit_content">
									<h6>open</h6>
									<p>All week All day</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- Newsletter -->

			<div class="newsletter">
				<div class="container">
					<div class="row">
						<div class="col-lg-6">
							<div
								class="newsletter_text d-flex flex-column justify-content-center align-items-lg-start align-items-md-center text-center">
								<h4>Newsletter</h4>
								<p>Subscribe to our newsletter and get 20% off your first
									purchase</p>
							</div>
						</div>
						<div class="col-lg-6">
							<div
								class="newsletter_form d-flex flex-md-row flex-column flex-xs-column align-items-center justify-content-lg-end justify-content-center">
								<input id="newsletter_email" type="email"
									placeholder="Your email" required="required"
									data-error="Valid email is required.">
								<button id="newsletter_submit" type="submit"
									class="newsletter_submit_btn trans_300" value="Submit">subscribe</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Footer -->
		<c:import url="../common/footer.jsp" />

	</div>
</body>

</html>
