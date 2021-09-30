<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<c:import url="./import/css/commonCss.jsp" />
<c:import url="./import/css/indexCss.jsp" />
<c:import url="./import/js/commonJs.jsp" />
<c:import url="./import/js/indexJs.jsp" />
<link rel="stylesheet" type="text/css" href="./resources/css/home/home.css">
<script type="text/javascript">

	var email = "${member.email}";
	
	// 장바구니에 담기
	function addToCart (g_num) {
		if (email == "") {
			alert("로그인이 필요합니다.");
		} else {
			$.post("./orders/ordersInsert",{
				email : email,
				g_num : g_num
			}, function(data){
				alert(data);
			});
		}
	}
	

	$(function(){
		$("#hotGamesBtn").click();
	});
</script>
<title>HOT GS</title>
</head>
<body>
	<div class="super_container">
		<!-- header -->
		<c:import url="./common/header.jsp"></c:import>
		<!-- Slider -->
		<div class="main_slider"
			style="background-image:url(<%=request.getContextPath()%>/resources/images/home/homeImage.jpg)">
			<div class="container fill_height">
				<div class="row align-items-center fill_height">
					<div class="col">
						<div class="main_slider_content">
							<h6>Monster Hunter</h6>
							<h1>Will you join us in The Adventure?</h1>
							<div class="red_button shop_now_button">
								<a href="./game/gameView?g_num=31">shop now</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- Game Genre Banner -->

		<div class="banner">
			<div class="container">
				<div class="row">
					<div class="col-md-3">
						<div class="banner_item align-items-center"
							style="background-image:url(<%=request.getContextPath()%>/resources/images/home/homeAllImg.jpg)">
							<div class="banner_category">
								<a href="./game/gameList">All</a>
							</div>
						</div>
					</div>
					<div class="col-md-3">
						<div class="banner_item align-items-center"
							style="background-image:url(<%=request.getContextPath()%>/resources/images/home/homeActionImg.jpg)">
							<div class="banner_category">
								<a href="./game/gameList?genre=Action">Action</a>
							</div>
						</div>
					</div>
					<div class="col-md-3">
						<div class="banner_item align-items-center"
							style="background-image:url(<%=request.getContextPath()%>/resources/images/home/homeAdventureImg.jpg)">
							<div class="banner_category">
								<a href="./game/gameList?genre=Adventure">Adventure</a>
							</div>
						</div>
					</div>
					<div class="col-md-3">
						<div class="banner_item align-items-center"
							style="background-image:url(<%=request.getContextPath()%>/resources/images/home/homeIndieImg.jpg)">
							<div class="banner_category">
								<a href="./game/gameList?genre=Indie">Indie</a>
							</div>
						</div>
					</div>
					<div class="col-md-3 gameCategories">
						<div class="banner_item align-items-center"
							style="background-image:url(<%=request.getContextPath()%>/resources/images/home/racing.png)">
							<div class="banner_category">
								<a href="./game/gameList?genre=Racing">Racing</a>
							</div>
						</div>
					</div>
					<div class="col-md-3 gameCategories">
						<div class="banner_item align-items-center"
							style="background-image:url(<%=request.getContextPath()%>/resources/images/home/homeSimulationImg.jpg)">
							<div class="banner_category">
								<a href="./game/gameList?genre=Simulation">Simulation</a>
							</div>
						</div>
					</div>
					<div class="col-md-3 gameCategories">
						<div class="banner_item align-items-center"
							style="background-image:url(<%=request.getContextPath()%>/resources/images/home/homeStrategyImg.jpg)">
							<div class="banner_category">
								<a href="./game/gameList?genre=Strategy">Strategy</a>
							</div>
						</div>
					</div>
					<div class="col-md-3 gameCategories">
						<div class="banner_item align-items-center"
							style="background-image:url(<%=request.getContextPath()%>/resources/images/home/homeVRImg.jpg)">
							<div class="banner_category">
								<a href="./game/gameList?genre=VR">Virtual Reality</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Arrivals -->

		<div class="new_arrivals">
			<div class="container">
				<div class="row">
					<div class="col text-center">
						<div class="section_title new_arrivals_title">
							<h2>Games</h2>
						</div>
					</div>
				</div>
				<div class="row align-items-center">
					<div class="col text-center">
						<div class="new_arrivals_sorting">
							<ul class="arrivals_grid_sorting clearfix button-group filters-button-group">
								<li id="hotGamesBtn"
									class="grid_sorting_button button d-flex flex-column justify-content-center align-items-center active is-checked"
									data-filter=".hot">Hot Games</li>
								<li
									class="grid_sorting_button button d-flex flex-column justify-content-center align-items-center"
									data-filter=".new">New Games</li>
								<li
									class="grid_sorting_button button d-flex flex-column justify-content-center align-items-center"
									data-filter=".sale">Sale Games</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<div class="product-grid"
							data-isotope='{ "itemSelector": ".product-item", "layoutMode": "fitRows" }'>

							<!-- Hot Games -->
							<c:forEach items="${hotGameList}" var="game">
								<div class="product-item hot">
									<div class="product discount product_filter" onclick="location.href='./game/gameView?g_num=${game.g_num}'">
										<div class="product_image">
											<a href="./game/gameView?g_num=${game.g_num}"><img src="./resources/upload/images/game/main/${game.fname}"></a>
										</div>
										<c:if test="${game.saleStatus eq 1}">
											<div class="product_bubble product_bubble_right product_bubble_red d-flex flex-column align-items-center">
												<span>${game.sale}%</span>
											</div>
										</c:if>
										<div class="product_info">
											<h6 class="product_name">
												<a href="./game/gameView?g_num=${game.g_num}">${game.g_name}</a>
											</h6>
											<c:choose>
												<c:when test="${game.saleStatus eq 0}">
													<div class="product_price">$${game.price}</div>
												</c:when>
												<c:when test="${game.saleStatus eq 1}">
													<div class="product_price">
														$<fmt:formatNumber type="number"
															value="${game.price * (100 - game.sale) / 100}"
															pattern="0.00" maxFractionDigits="2" />
														<span>$${game.price}</span>
													</div>
												</c:when>
											</c:choose>
										</div>
									</div>
									<div class="red_button add_to_cart_button">
										<a onclick="addToCart(${game.g_num})" >add to cart</a>
									</div>
								</div>
							</c:forEach>
							
							<!-- New Games -->
							<c:forEach items="${newGameList}" var="game">
								<div class="product-item new">
								<div class="product discount product_filter" onclick="location.href='./game/gameView?g_num=${game.g_num}'">
									<div class="product_image">
										<a href="./game/gameView?g_num=${game.g_num}"><img src="./resources/upload/images/game/main/${game.fname}"></a>
									</div>
									<c:if test="${game.saleStatus eq 1}">
										<div class="product_bubble product_bubble_right product_bubble_red d-flex flex-column align-items-center">
											<span>${game.sale}%</span>
										</div>
									</c:if>
									<div class="product_info">
										<h6 class="product_name">
											<a href="./game/gameView?g_num=${game.g_num}">${game.g_name}</a>
										</h6>
										<c:choose>
											<c:when test="${game.saleStatus eq 0}">
												<div class="product_price">$${game.price}</div>
											</c:when>
											<c:when test="${game.saleStatus eq 1}">
												<div class="product_price">
													$<fmt:formatNumber type="number"
														value="${game.price * (100 - game.sale) / 100}"
														pattern="0.00" maxFractionDigits="2" />
													<span>$${game.price}</span>
												</div>
											</c:when>
										</c:choose>
									</div>
								</div>
								<div class="red_button add_to_cart_button">
									<a onclick="addToCart(${game.g_num})" >add to cart</a>
								</div>
							</div>
							</c:forEach>
							
							<!-- Sale Games -->
							<c:forEach items="${saleGameList}" var="game">
								<div class="product-item sale">
								<div class="product discount product_filter" onclick="location.href='./game/gameView?g_num=${game.g_num}'">
									<div class="product_image">
										<a href="./game/gameView?g_num=${game.g_num}"><img src="./resources/upload/images/game/main/${game.fname}"></a>
									</div>
									<c:if test="${game.saleStatus eq 1}">
										<div class="product_bubble product_bubble_right product_bubble_red d-flex flex-column align-items-center">
											<span>${game.sale}%</span>
										</div>
									</c:if>
									<div class="product_info">
										<h6 class="product_name">
											<a href="./game/gameView?g_num=${game.g_num}">${game.g_name}</a>
										</h6>
										<c:choose>
											<c:when test="${game.saleStatus eq 0}">
												<div class="product_price">$${game.price}</div>
											</c:when>
											<c:when test="${game.saleStatus eq 1}">
												<div class="product_price">
													$<fmt:formatNumber type="number"
														value="${game.price * (100 - game.sale) / 100}"
														pattern="0.00" maxFractionDigits="2" />
													<span>$${game.price}</span>
												</div>
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
		</div>

		<!-- Deal of the week -->


		<!-- Best Sellers -->

		<div class="best_sellers">
			<div class="container">
				<div class="row">
					<div class="col text-center">
						<div class="section_title new_arrivals_title">
							<h2>Best Sellers</h2>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<div class="product_slider_container">
							<div class="owl-carousel owl-theme product_slider">

								<!-- Recommend Game -->
								<c:forEach items="${recommendGameList}" var="game">
									<div class="owl-item product_slider_item" onclick="location.href='./game/gameView?g_num=${game.g_num}'">
										<div class="product-item action">
											<div class="product discount">
												<div class="product_image">
													<a href="./game/gameView?g_num=${game.g_num}"><img
														src="./resources/upload/images/game/main/${game.fname}"></a>
												</div>
												<c:if test="${game.saleStatus eq 1}">
													<div class="product_bubble product_bubble_right product_bubble_red d-flex flex-column align-items-center">
														<span>${game.sale}%</span>
													</div>
												</c:if>
												<div class="product_info">
													<h6 class="product_name">
														<a href="./game/gameView?g_num=${game.g_num}">${game.g_name}</a>
													</h6>
													<c:choose>
														<c:when test="${game.saleStatus eq 0}">
															<div class="product_price">$${game.price}</div>
														</c:when>
														<c:when test="${game.saleStatus eq 1}">
															<div class="product_price">
																$<fmt:formatNumber type="number"
																	value="${game.price * (100 - game.sale) / 100}"
																	pattern="0.00" maxFractionDigits="2" />
																<span>$${game.price}</span>
															</div>
														</c:when>
													</c:choose>
												</div>
											</div>
										</div>
									</div>
								</c:forEach>
							</div>

							<!-- Slider Navigation -->

							<div
								class="product_slider_nav_left product_slider_nav d-flex align-items-center justify-content-center flex-column">
								<i class="fa fa-chevron-left" aria-hidden="true"></i>
							</div>
							<div
								class="product_slider_nav_right product_slider_nav d-flex align-items-center justify-content-center flex-column">
								<i class="fa fa-chevron-right" aria-hidden="true"></i>
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

		<!-- Blogs -->

		<div class="blogs">
			<div class="container">
				<div class="row">
					<div class="col text-center">
						<div class="section_title">
							<h2>Notice</h2>
						</div>
					</div>
				</div>
				<div class="row blogs_container">
					<c:if test="${not empty notice0}">
						<div class="col-lg-4 blog_item_col">
							<div class="blog_item">
								<div class="blog_background"
									style="background-image:url(<%=request.getContextPath()%>/resources/images/home/noticeImage1.webp)"></div>
								<div class="blog_content d-flex flex-column align-items-center justify-content-center text-center">
									<h4 class="blog_title">${notice0.title}</h4>
									<span class="blog_meta">${notice0.reg_date}</span>
									<a class="blog_more" href="./notice/noticeView?b_num=${notice0.b_num}">Read more</a>
								</div>
							</div>
						</div>
					</c:if>
					<c:if test="${not empty notice1}">
						<div class="col-lg-4 blog_item_col">
							<div class="blog_item">
								<div class="blog_background"
									style="background-image:url(<%=request.getContextPath()%>/resources/images/home/noticeImage2.jpg)"></div>
								<div
									class="blog_content d-flex flex-column align-items-center justify-content-center text-center">
									<h4 class="blog_title">${notice1.title}</h4>
									<span class="blog_meta">${notice1.reg_date}</span>
									<a class="blog_more" href="./notice/noticeView?b_num=${notice1.b_num}">Read more</a>
								</div>
							</div>
						</div>
					</c:if>
					<c:if test="${not empty notice2}">
						<div class="col-lg-4 blog_item_col">
							<div class="blog_item">
								<div class="blog_background"
									style="background-image:url(<%=request.getContextPath()%>/resources/images/home/noticeImage3.webp)"></div>
								<div
									class="blog_content d-flex flex-column align-items-center justify-content-center text-center">
									<h4 class="blog_title">${notice2.title}</h4>
									<span class="blog_meta">${notice2.reg_date}</span>
									<a class="blog_more" href="./notice/noticeView?b_num=${notice2.b_num}">Read more</a>
								</div>
							</div>
						</div>
					</c:if>
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
		<c:import url="./common/footer.jsp"></c:import>
	</div>
</body>
</html>