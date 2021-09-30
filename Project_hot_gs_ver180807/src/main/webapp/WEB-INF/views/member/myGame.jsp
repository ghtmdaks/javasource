<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% response.setHeader("Pragma","No-cache"); response.setHeader("Cache-Control","No-cache"); response.setDateHeader("Expires", -1); response.setHeader("Cache-Control", "No-store"); %>
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/styles/member_myGame.css">
<c:import url="../import/css/commonCss.jsp" />
<c:import url="../import/css/indexCss.jsp" />
<c:import url="../import/css/categoriesCss.jsp" />
<c:import url="../import/js/commonJs.jsp" />
<c:import url="../import/js/indexJs.jsp" />
<c:import url="../import/js/categoriesJs.jsp" />
<title>${member.nickname}'s Game</title>
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
						<i class="fa fa-angle-right" aria-hidden="true"></i>My Game
				</a></li>
			</ul>
		</div>
         <!-- row -->
         <div class="row">
            <!-- col -->
            <div class="col">
               <h2 class="shoppingCartText" style="margin-top: 0px;">myGame List</h2>
               <!-- oneGameCart -->
               <div class="oneGameCart">
                  <div id="TopBox">
                     <div class="headText" style="margin-top: 5%;">
                        <div class=" col-lg-2 innerCartCheckBox">
<!--                            <input type="checkbox" id="all"><label for="all"></label> -->
                        </div>
                        <div class=" col-lg-6 innerCartGameImgtitle">Game</div>
                        <div class=" col-lg-2 innerCartGameBuyDate">Purchase Date</div>
                        <div class=" col-lg-2 innerCartGameDelete"></div>
                     </div>
                  </div>
                  <c:forEach items = "${gameList}" var = "game">
                  <div class="bodyBox">
                              <div class="bodyText">
                                 <div class=" col-lg-2 innerCartCheckBox">
                                 </div>
                                 <div class=" col-lg-2 innerCartGameImg">
                                    <a href="../game/gameView?g_num=${game.g_num}"><img alt=""
                                       src="<%=request.getContextPath()%>/resources/upload/images/game/main/${game.fname}"></a>
                                 </div>
                                 <div class=" col-lg-4 innerCartGameName"><a href="../game/gameView?g_num=${game.g_num}">${game.g_name}</a></div>
                                 <div class=" col-lg-2 innerCartGameBuyDate">${game.o_date}</div>
                                 <div class=" col-lg-2 innerCartGameDelete">
                                 </div>
                              </div>
                  </div>
                  </c:forEach>
               </div>
               <!-- oneGameCart -->
            </div>
            <!-- col -->
         </div>
         <!-- row -->
         <!-- price Total -->
<%--          <c:if test="${!empty game }"> --%>
<!--             <div class="row price_area" style="margin: 0 auto;"> -->
<!--                <div class="col-lg-3 price_text">Total Price</div> -->
<!--                <div class="col-lg-3 price_text">$150.00</div> -->
<!--                <div class="col-lg-3 price_text">Select Price</div> -->
<!--                <div class="col-lg-3 price_text">$119.96</div> -->
<!--             </div> -->

            <!-- price Total -->
            <!-- button -->
<!--             <div class="col"> -->
<!--                <div class="gameSelectBtn"> -->
<!--                   <button>전체주문</button> -->
<!--                   <button>선택주문</button> -->
<!--                </div> -->
<!--             </div> -->
<%--          </c:if> --%>
         <!-- button -->
      </div>
      <!-- container single_product_container-->
   </div>
   <!-- superContainer -->

   <c:import url="../common/footer.jsp"></c:import>
</body>
</html>