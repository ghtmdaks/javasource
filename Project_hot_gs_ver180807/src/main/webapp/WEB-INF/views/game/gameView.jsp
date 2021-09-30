<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<% response.setHeader("Pragma","No-cache"); response.setHeader("Cache-Control","No-cache"); response.setDateHeader("Expires", -1); response.setHeader("Cache-Control", "No-store"); %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>${game.g_name}</title>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"rel="stylesheet">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/styles/single_gamepage.css">
<c:import url="../import/css/commonCss.jsp" />
<c:import url="../import/js/commonJs.jsp" />
<c:import url="../import/css/singleCss.jsp" />
<c:import url="../import/js/singleJs.jsp" />

<script type="text/javascript">
	
	
	// 스크립트 필요 데이터
	var email = '${member.email}';

	// 메시지 alert
	var message = '${message}';
	if (message != '') {
		alert(message);
	}

	// 게임 추천
	function gameRecommend(g_num) {
		$.post("./gameRecommend", {
			g_num : g_num
		}, function(data) {
			alert(data.trim());
			location.reload();
		});
	}
	
	// 게임 추천 취소
	function gameCancelRecommend(g_num) {
		$.post("./gameCancelRecommend", {
			g_num : g_num
		}, function(data) {
			alert(data.trim());
			location.reload();
		});
	}
	
	// 게임 정보 삭제
	function gameDelete(g_num) {
		var check = confirm("정말 삭제 하겠습니까?");
		if (check) {
			$.post("./gameDelete",{
				g_num : g_num
			}, function(data){
				if(data > 0) {
					alert("게임이 삭제되였습니다.");
					location.href="./gameList";
				} else {
					alert("게임이 삭제되지 못 하였습니다.");
				}
			});
		}
	}
	
	// 게임 세일 체크
	function gameSaleCheck (sale, saleStartDate, saleEndDate) {
		var check = false;
		var curDate = new Date().getTime();
		var ssdCh = new Date(saleStartDate.replace(/-/g,"/")).getTime();
		var sedCh = new Date(saleEndDate.replace(/-/g,"/")).getTime();
		
		if(sale == "" || sale < 1 || sale > 100) {
			alert("정확한 세일값을 입력해 주세요.");
		} else if (ssdCh > sedCh) {
			alert("세일 종료시간이 세일 시작시간보다 일찍할 수 없습니다.");
		} else if (curDate > sedCh) {
			alert("세일 종료시간이 현재시간보다 일찍할 수 없습니다.")
		} else {
			check = true;
		}
		
		return check;
	}
	
	// 게임 세일
	function gameSale() {
		var g_num = "${game.g_num}"; // 게임 Primary Key
		var sale = $("#sale").val(); // 세일 (%)
		var saleStartDate = $("#saleStartD").val() + " " + $("#saleStartH").val()+ ":"
						  + $("#saleStartM").val() + ":00"; // 세일 시작 날짜
		var saleEndDate =  $("#saleEndD").val() + " " + $("#saleEndH").val() + ":"
						 + $("#saleEndM").val() + ":00"; // 세일 종료 날짜
		if(gameSaleCheck(sale, saleStartDate, saleEndDate)) {
			$.post("./gameSale", { // request 주소
				g_num : g_num, // 데이터 전송
				sale : sale,
				saleStartDate : saleStartDate,
				saleEndDate : saleEndDate
			}, function(data) {
				if(data > 0) { // 결과 메시지 alert
					alert(saleStartDate + " 에 세일 시작.");
					location.reload();
				} else {
					alert("세일 실패");
				}
			});
		}
	}
	
	// 게임 세일 취소
	function gameCancelSale(g_num) {
		$.post("./gameCancelSale", {
			g_num : '${game.g_num}',
		}, function(data) {
			alert(data);
			location.reload();
		});
	}
	
	
	//리뷰 수정 데이터 넘기기
	function reviewUpdateText(i){
		var r_num = i;
		var g_num = ${game.g_num};
		var contents= $("#contentsUpdateData"+i).val();
			$.post("./reviewUpdate",{
			r_num:r_num,
			g_num:g_num,
			email:email,
			contents:contents
		},function(data){
				if(data>0){
				alert("수정되었습니다.");
				window.location.reload();
				} else {
					alert("댓글 수정 실패하였습니다.");
				}
		});
	}
	
	//리뷰 수정 페이지
	function reviewText(i){
		$("#reviewViewOne"+i).hide();
		$("#afterUpdateBtn"+i).show();
		$("#afterCancelBtn"+i).show();
		$("#beforeUpdateBtn"+i).hide();
		$("#beforeDeleteBtn"+i).hide();
		$("#reviewTextUpdate"+i).show();
		$("#beforeReplyBtn"+i).hide();
	}
	
	//리뷰 수정시 취소버튼
	function reviewCancelText(i){
		$("#reviewViewOne"+i).show();
		$("#afterUpdateBtn"+i).hide();
		$("#afterCancelBtn"+i).hide();
		$("#beforeUpdateBtn"+i).show();
		$("#beforeDeleteBtn"+i).show();
		$("#reviewTextUpdate"+i).hide();
		$("#beforeReplyBtn"+i).show();
		window.location.reload();
	}
	
	//리뷰 삭제
	function reviewDelete(i){
		var check=confirm("댓글을 삭제하시겠습니까?");
		if(check){
			var r_num = i;
			var g_num = ${game.g_num};
			var contents="삭제된 댓글입니다.";
			$.post("./reviewDelete",{
				r_num:r_num,
				g_num:g_num,
				email:email,
				contents:contents
			},function(data){
				if(data>0){
					alert("댓글이 삭제되었습니다.");
				}else{
					alert("댓글 삭제에 실패하였습니다.");
				}
					window.location.reload();
			});
		}
	}
	
	//댓글의 덧글 달기
	function reviewReplyText(i){
		$("#reviewReplyArea"+i).show();
	}
	function reviewReplyWriteText(i){
	var reviewReply = $("#reviewReplyContents"+i).val();
	var g_num = ${game.g_num};
	$.post("./reviewReply", {
	g_num : g_num,
	email : email,
	r_num : i,
	contents : reviewReply
	}, function(data) {
		if(data>0){
			alert("댓글이 등록되었습니다.")
		location.reload();
		}
		});
	}

$(function() {
	
    $('[data-toggle="tooltip"]').tooltip();   
	
	// 타이머
	var now = new Date();
	var saleStartDate = new Date('${game.saleStartDate}');
	var saleEndDate = new Date('${game.saleEndDate}');
	
	if(now < saleEndDate) {
		saleTimer();
	}
	
	function saleTimer() {
		
			var curDate = new Date(); // 현재 시간
			var time;
			var timerFont = "";
 			if(curDate < saleStartDate) { 
				time = Math.floor(saleStartDate - curDate);
				timerFont += "Sale Start: ";
			} else if (curDate < saleEndDate) {
				time = Math.floor(saleEndDate - curDate);
				timerFont += "Sale End: ";
			}
 			$("#timerFont").html(timerFont);
 			var timerTime = "";
			if (time >= 1000) {
				var day = time / 1000 / 60 / 60;
				var hour = Math.floor(time / 1000 / 60 / 60 % 24);
				var min = Math.floor(time / 1000 / 60 % 60);
				var sec = Math.floor(time / 1000 % 60);
				if (day > 24) {
					timerTime += Math.floor(day / 24) + "day ";
				} 
				timerTime += hour + ":" + min + ":" + sec;
				$("#timerTime").html(timerTime);
				setTimeout(saleTimer, 1000)
			} else {
				setTimeout(htmlReload, time);
			}
		}
	
	function htmlReload() {
		location.reload();
	}
	
	// 장바구니에서 삭제
	$("#ordersDeleteBtn").click(function(){
		if(email != ""){
			$.post("../orders/ordersDelete",{
				g_num : '${game.g_num}',
				email : email
			}, function(data){
				alert(data);
				location.reload();
			});
		} else {
			alert("로그인이 필요합니다.");
		}
	});
	
	// 장바구니에 담기
	$("#ordersInsertBtn").click(function(){
		if(email != ""){
			$.post("../orders/ordersInsert",{
				g_num : '${game.g_num}',
				email : email
			}, function(data){
				alert(data);
				location.reload();
			});
		} else {
			alert("로그인이 필요합니다.");
		}
	});
	
	
	// 리뷰 쓰기
	$("#reviewWriteBtn").click(function() {
		var contentsData = $("#contentsData").val();
		var g_num = ${game.g_num};
		$.post("./reviewWrite", {
			g_num : g_num,
			email : email,
			contents : contentsData
		}, function(data) {
			if (data > 0) {
				alert("댓글이 등록되었습니다.");
				location.reload();
			} else {
				alert("댓글 등록에 실패하였습니다.");
			}
		});
	});
});
	


</script>
</head>

<body>

	   <!-- The Modal -->
   <div class="modal" id="myModalLogin" style = "margin-top: 200px;">
      <div class="modal-dialog">
         <div class="modal-content" style="text-align: center;">
            <!-- Modal body -->
            <div class="loginTitle"
               style="text-align: center; font-size: 30px; margin-top: 30px; color: #fe4c50;">Login
               Form</div>
            <div class="input-group"
               style="margin: 25px auto 25px auto; width: 80%">
               <span class="input-group-addon" style = "margin-top:23px; height:  54.1px;"><i
                  class="glyphicon glyphicon-user"></i></span> <input id="email2" type="text" class="form-control" name="email2" placeholder="Email@email.com" style = "height: 54.1px"> 
            </div>
            <div class="input-group" style="margin: 0 auto; width: 80%">
               <span class="input-group-addon" style = "margin-top:23px; height:  54.1px;"><i
                  class="glyphicon glyphicon-lock"></i></span> <input id="pw2"
                  type="password" class="form-control" name="pw2"
                  placeholder="Password" style = "height: 54.1px">
            </div>
            <div class="input-group"
               style="font-size: 10px; text-align: center; margin: 25px auto 25px auto; width: 80%;">
               <button onclick="login()" class="btn btn-default btn-block"
                  style="width: 30%; background-color: #fe4c50; border: 1px solid #fe4c50; color: white;">Login</button>
               <button type="button" class="btn btn-danger" data-dismiss="modal"
                  style="width: 30%; margin-left: 200px; background-color: white; border: 1px solid #fe4c50; color: #fe4c50; font: bold;">Close</button> 
            </div>
         </div>
      </div>
   </div>
<script type="text/javascript">
         function login() {
            var email = $("#email2").val();
            var pw = $("#pw2").val();
            $.post("<%=request.getContextPath()%>/member/memberLogin",{
               email : email,
               pw : pw
            },function(data){
               if (data > 0) {
                  alert("로그인 성공");
                  location.reload();
               } else {
                  alert("이메일 혹은 비밀번호를 확인하세요.");
               }
            });
         }
      </script>
   
   <!-- /LoginModal -->

	<!-- header -->
	<c:import url="../common/header2.jsp"></c:import>
	<div class="super_container">
		<div class="container single_product_container">
			<div class="row">
				<div class="col">
					<!-- Breadcrumbs -->
					<div class="breadcrumbs d-flex flex-row align-items-center">
						<ul>
							<li><a href="/gs">Home</a></li>
							<li><a href="./gameList"><i class="fa fa-angle-right"
									aria-hidden="true"></i>Game</a></li>
							<li class="active"><a
								href="javascript:window.location.href=window.location.href">
									<i class="fa fa-angle-right" aria-hidden="true"></i>${game.g_name}
							</a></li>
						</ul>
					</div>

				</div>
			</div>

			<div>
				<div style="font-size: 1.1rem; font-family: 'Poppins', sans-serif; -webkit-font-smoothing: antialiased; margin-bottom: 1%;">
					<span id="timerFont"></span> &nbsp;&nbsp;&nbsp; <span id="timerTime" class="timeSale"></span>
				<c:if test="${member.kind eq 'admin'}">
				<!-- 게임관리 드롭다운 -->
				<div class="dropdown">
					<button type="button" class="btn btn-link dropdown-toggle" data-toggle="dropdown">게임 관리</button>
					<div class="dropdown-menu">
						<button class="dropdown-item" onclick="location.href='./gameInfoUpdate?g_num=${game.g_num}'">
							수정</button>
						<button class="dropdown-item" onclick="location.href='./gameImgUpdate?g_num=${game.g_num}'">
							이미지관리</button>
						<button class="dropdown-item" onclick="gameDelete(${game.g_num})">
							삭제</button>
						<c:choose>
							<c:when test="${game.recommend eq 0}">
								<button class="dropdown-item" onclick="gameRecommend(${game.g_num})">
									게임 추천</button>
							</c:when>
							<c:when test="${game.recommend eq 1}">
								<button class="dropdown-item" onclick="gameCancelRecommend(${game.g_num})">
									게임 추천 취소</button>
							</c:when>
						</c:choose>
						<c:choose>
							<c:when test="${game.sale gt 0}">
								<button class="dropdown-item" type="button" class="btn btn-primary" data-toggle="modal" data-target="#gameSaleModal">
									세일 수정</button>
								<button class="dropdown-item" onclick="gameCancelSale(${game.g_num})" >
									세일 취소</button>
								
							</c:when>
							<c:when test="${empty game.sale}">
								<button class="dropdown-item" type="button" class="btn btn-primary" data-toggle="modal" data-target="#gameSaleModal">
								세일</button>
							</c:when>
						</c:choose>
					</div>
				</div>
				</c:if>
				<!-- 게임관리 드롭다운  끝 -->
				</div>
				<h2>${game.g_name}</h2>
				<!-- 게임 세일 설정 모달 -->
				<div class="modal fade" id="gameSaleModal">
					<div class="modal-dialog">
						<div class="modal-content">
							<!-- Modal Header -->
							<div class="modal-header">
								<h6 class="modal-title">Sale Form</h6>
								<button type="button" class="close" data-dismiss="modal">&times;</button>
							</div>
							<!-- Modal body -->
							<div class="modal-body">
								<div class="form-group">
									<label for="sale">Discount (%)</label>
									<input type="number" min="0" max="100" name="sale" class="saleData form-control" id="sale" placeholder="100%로 가실?">
								</div>
								<div class="form-group">
									<label for="saleStartDate">Sale Start</label>
									<div class="row">
										<div class="col">
											<input id="saleStartD" class="saleData form-control" type="date" />
										</div>
										<div class="col">
											<div class="row">
												<div class="col">
													<select id="saleStartH" class="saleData form-control">
														<c:forEach begin="0" end="23" var="h">
															<c:choose>
																<c:when test="${h < 10}">
																	<option value="0${h}">${h}H</option>
																</c:when>
																<c:otherwise>
																	<option value="${h}">${h}H</option>
																</c:otherwise>
															</c:choose>
														</c:forEach>
													</select>
												</div>
												<div class="col">
													<select id="saleStartM" class="saleData form-control">
														<c:forEach begin="0" end="59" var="m">
															<c:choose>
																<c:when test="${m < 10}">
																	<option value="0${m}">${m}M</option>
																</c:when>
																<c:otherwise>
																	<option value="${m}">${m}M</option>
																</c:otherwise>
															</c:choose>
														</c:forEach>
													</select>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="form-group">
									<label for="saleEndDate">Sale End</label>
									<div class="row">
										<div class="col">
											<input id="saleEndD" class="saleData form-control" type="date" />
										</div>
										<div class="col">
											<div class="row">
												<div class="col">
													<select id="saleEndH" class="saleData form-control">
														<c:forEach begin="0" end="23" var="h">
															<c:choose>
																<c:when test="${h < 10}">
																	<option value="0${h}">${h}H</option>
																</c:when>
																<c:otherwise>
																	<option value="${h}">${h}H</option>
																</c:otherwise>
															</c:choose>
														</c:forEach>
													</select>
												</div>
												<div class="col">
													<select id="saleEndM" class="saleData form-control">
														<c:forEach begin="0" end="59" var="m">
															<c:choose>
																<c:when test="${m < 10}">
																	<option value="0${m}">${m}M</option>
																</c:when>
																<c:otherwise>
																	<option value="${m}">${m}M</option>
																</c:otherwise>
															</c:choose>
														</c:forEach>
													</select>
												</div>
											</div>
										</div>
									</div>
								</div>
								<input onclick="gameSale()" type="button" class="btn btn-link" style="width: 100%" 
								value="Submit">
							</div>
							<!-- Modal footer -->
<!-- 							<div class="modal-footer">
								<button type="button" class="btn btn-link"
									data-dismiss="modal">Cancel</button>
							</div> -->
						</div>
					</div>
				</div>
				<!-- 게임 세일 설정 모달 끝 -->
			</div>
			<div class="row">
				<div class="col-lg-8">
					<div class="single_product_pics">
						<c:if test="${subImgCnt gt 0}">
							<div id="demo" class="carousel slide" data-ride="carousel">
								<!-- Indicators -->
								<ul class="carousel-indicators">
									<c:forEach begin="0" end="${subImgCnt - 1}" var="index">
										<c:choose>
											<c:when test="${index eq 0}">
												<li data-target="#demo" data-slide-to="${index}"
													class="active"></li>
											</c:when>
											<c:otherwise>
												<li data-target="#demo" data-slide-to="${index}"></li>
											</c:otherwise>
										</c:choose>
									</c:forEach>
								</ul>
								<!-- The slideshow -->
								<div class="carousel-inner">
									<c:forEach items="${subImgs}" var="subImg" varStatus="status">
										<c:choose>
											<c:when test="${status.index eq 0}">
												<div class="carousel-item active">
													<img
														src="../resources/upload/images/game/sub/${subImg.fname}"
														alt="${subImg.oname}">
													<div class="carousel-caption"></div>
												</div>
											</c:when>
											<c:otherwise>
												<div class="carousel-item">
													<img
														src="../resources/upload/images/game/sub/${subImg.fname}"
														alt="${subImg.oname}">
													<div class="carousel-caption"></div>
												</div>
											</c:otherwise>
										</c:choose>
									</c:forEach>
								</div>
								<!-- Left and right controls -->
								<a class="carousel-control-prev" href="#demo" data-slide="prev">
									<span class="carousel-control-prev-icon"></span>
								</a> <a class="carousel-control-next" href="#demo" data-slide="next">
									<span class="carousel-control-next-icon"></span>
								</a>
							</div>
						</c:if>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="product_details">
						<img id="titleImg" alt=""
							src="../resources/upload/images/game/main/${mainImg.fname}">
						<div class="subtitleBox">
							<c:if test="${not empty steamReview}">
								<c:if test="${not empty steamReview.recentReviews && not empty steamReview.recentTooltip }">
									<div class="tooltipBox" data-toggle="tooltip" title="${steamReview.recentTooltip }">
										<div class="subtitle">RECENT REVIEWS :&nbsp;</div><div class="subvalue">${steamReview.recentReviews}</div>
									</div>
								</c:if>
								<c:if test="${not empty steamReview.allReviews && not empty steamReview.allTooltip }">
									<div class="tooltipBox" data-toggle="tooltip" data-placement="bottom" title="${steamReview.allTooltip}">
										<div class="subtitle">ALL REVIEWS :&nbsp;</div><div class="subvalue">${steamReview.allReviews}</div>
									</div>
								</c:if>
							</c:if>
							<div>Down: ${game.downcnt }</div>
						</div>
						<c:choose>
							<c:when test="${game.saleStatus eq 1}">
								<div class="original_price">$${game.price}</div>
								<div class="product_price">
									$
									<fmt:formatNumber type="number"
										value="${game.price * (100 - game.sale) / 100}" pattern="0.00"
										maxFractionDigits="2" />
								</div>
							</c:when>
							<c:when test="${game.saleStatus eq 0}">
								<div class="product_price">$${game.price}</div>
							</c:when>
						</c:choose>
						<div
							class="quantity d-flex flex-column flex-sm-row align-items-sm-center">
							<div class="red_button add_to_cart_button">
								<c:choose>
									<c:when test="${empty orders}">
										<a id="ordersInsertBtn">add to cart</a>
									</c:when>
									<c:otherwise>
										<c:if test="${orders.status eq 0}">
											<a id="ordersDeleteBtn">remove from cart</a>
										</c:if>
										<c:if test="${orders.status eq 1}">
											<a>이미 구매한 게임 입니다.</a>
										</c:if>
									</c:otherwise>
								</c:choose>
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>

		<!-- Tabs -->

		<div class="tabs_section_container">

			<div class="container">
				<div class="row">
					<div class="col">
						<div class="tabs_container">
							<ul
								class="tabs d-flex flex-sm-row flex-column align-items-left align-items-md-center justify-content-center">
								<li class="tab active"><span>Description</span></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col">

						<!-- Tab Description -->

						<div id="tab_1" class="tab_container active">
							<div class="row descriptionBox">
								<div class="col-md-6 descriptionMainBox">
								<div class="col-sm-4 descriptionName">Genre</div>
								<div class="col-sm-8 descriptionContents">${game.genre}</div>
								</div>
								<div class="col-md-6 descriptionMainBox">
								<div class="col-sm-4 descriptionName">Company</div>
								<div class="col-sm-8 descriptionContents">${game.publisher}</div>
								</div>
								<div class="col-md-6 descriptionMainBox">
								<div class="col-sm-4 descriptionName">Release</div>
								<div class="col-sm-8 descriptionContents">${game.g_date}</div>
								</div>
								<div class="col-md-6 descriptionMainBox">
								<div class="col-sm-4 descriptionName">Developer</div>
								<div class="col-sm-8 descriptionContents">${game.developer}</div>
								</div>
							</div>
							<div class="infoContents">${game.g_info}</div>
						</div>

						<div class="row">
							<!-- Add Review -->
							<div class="add_review_col">
								<div class="add_review">
										<!-- 리뷰 작성 -->
										<c:choose>
										<c:when test="${!empty member.email }">
									<div id="review_form">
										<div>
											<textarea id="contentsData" class="form-control" name="contents" placeholder="Your Review" rows="4"></textarea>
										</div>
										<div class="text-left text-sm-right">
											<button id="reviewWriteBtn" class="red_button review_submit_btn trans_300">Write</button>
										</div>
									</div>
									</c:when>
									<c:otherwise>
									<div id="review_form">
										<div>
											<textarea class="form-control" name="contents" placeholder="Your Review" rows="4" onclick="whatthe()"></textarea>
										</div>
										<div class="text-left text-sm-right">
											<button id="" class="red_button review_submit_btn trans_300" onclick="whatthe()">Write</button>
										</div>
									</div>
									</c:otherwise>
									</c:choose>
									<!-- 리뷰 작성 끝 -->
								</div>
							</div>
							<!-- User Reviews -->
							<div class="reviews_col">
								<div class="tab_title reviews_title">
									<h4>Reviews(${reviewCnt})</h4>
								</div>
								<!-- User Review -->
							<input type="hidden" value="0" id="hiddenMore" name="hiddenMore">
							<div id="reviewMorePage">
							<script type="text/javascript">
							window.onload=function(){
								more();
							}
							</script>
							</div>
						</div>
					</div>

				</div>
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
					<form action="post">
						<div
							class="newsletter_form d-flex flex-md-row flex-column flex-xs-column align-items-center justify-content-lg-end justify-content-center">
							<input id="newsletter_email" type="email"
								placeholder="Your email" required="required"
								data-error="Valid email is required.">
							<button id="newsletter_submit" type="submit"
								class="newsletter_submit_btn trans_300" value="Submit">subscribe</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>

	<!-- Footer -->
	<c:import url="../common/footer.jsp"></c:import>
	<script type="text/javascript">
	function more(){
		var g_num=${game.g_num}
		var page=Number($("#hiddenMore").val());
		$("#hiddenMore").val(page+1);
		page=$("#hiddenMore").val();
		close();
		$.post('./reviewList',{curPage:page,g_num:g_num},function(data){
			$("#reviewMorePage").append(data);
		})
	}
	
	function close(){
		$("#reviewMoreBtn").remove();
	}
	
	function whatthe(){
		$("#zzz").click();
	}
	</script>
</body>
</html>