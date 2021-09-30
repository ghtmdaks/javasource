<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% response.setHeader("Pragma","No-cache"); response.setHeader("Cache-Control","No-cache"); response.setDateHeader("Expires", -1); response.setHeader("Cache-Control", "No-store"); %>
<!DOCTYPE html>
<html>
<head>
<c:import url="../import/css/commonCss.jsp" />
<c:import url="../import/css/categoriesCss.jsp" />
<c:import url="../import/js/commonJs.jsp" />
<c:import url="../import/js/categoriesJs.jsp" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/notice/noticeList.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/common/vnsCommon.css">
<script type="text/javascript">
	function pageMove(page) {
		var curPage = page;
		$("#curPage").val(curPage);
		$("#kind").val('${searchInfo.kind}');
		$("#search").val('${searchInfo.search}');
		$("#frm").submit();
	}
</script>
<title>Notice</title>
</head>

<!-- Login ModaL -->
<div class="container" >
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
               <span class="input-group-addon"><i
                  class="glyphicon glyphicon-user"></i></span> <input id="email2" type="text" class="form-control" name="email2" placeholder="Email@email.com"> 
            </div>
            <div class="input-group" style="margin: 0 auto; width: 80%">
               <span class="input-group-addon"><i
                  class="glyphicon glyphicon-lock"></i></span> <input id="pw2"
                  type="password" class="form-control" name="pw2"
                  placeholder="Password">
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
<!-- //LoginModaL -->
   <!-- /LoginModal --><!-- The Modal -->
<div class="modal" id="myModalJoin" style = "margin-top: 10px;">
   <div class="modal-dialog">
      <div class="modal-content">
         <!-- Modal Header -->
         <div class="modal-header">
            <h4 style="margin-left: 190px; color: #fe4c50;">Sign Up!!</h4><button type="button" class="close" data-dismiss="modal">&times;</button>
         </div>
         <!-- Modal body -->
         <div class="container"  style = "width: 95%; text-align: left;">
            <label for="email" style = "color: #fe4c50;"><b>Email</b></label> <br> <input
               type="hidden" id="emailall" />
            <div class="input-group">
               <input type="email" placeholder="Enter Email" name="email" required
                  id="email"
                  style="width: 70%; padding: 15px; margin: 0; display: inline-block; border: none; background: #f1f1f1; border-radius: 5px 5px 5px 5px; float: left;">
               <button class="btn btn-dark" id="emailchk" type="button"
                  style="width: 30%; margin-left: 20px; background-color: #fe4c50; border: 1px solid #fe4c50; color: white; font-weight: bold;">Check me</button>
            </div>
            <div id="emailresult" class="ft"
               style="border: medium; border-color: red; font-weight: bold; color: red;"></div>
                <label for="NickName" style = "color: #fe4c50;"><b>NickName</b></label> <br> <input
               type="hidden" id="nickall" />
            <div class="input-group">
               <input type="text" placeholder="Enter NickName" name="nickname"
                  required id="nickname"
                  style="width: 70%; padding: 15px; margin: 0; display: inline-block; border: none; background: #f1f1f1; border-radius: 5px 5px 5px 5px; float: left;">
               <button class="btn btn-dark" type="button"
                  style="width: 30%; margin-left: 20px; background-color: #fe4c50; border: 1px solid #fe4c50; color: white; font-weight: bold;" id="nickchk">Check me</button>
            </div>
            <div id="nicknameresult" class="ft"
               style="border: medium; border-color: red; font-weight: bold; color: red;"></div>
             <label for="psw" style = "color: #fe4c50;"><b>Password</b></label> <input
               type="password" placeholder="Enter Password" name="psw" required
               id="pw"
               style="width: 100%; padding: 15px; margin: 0px auto 20px auto; display: inline-block; border: none; background: #f1f1f1; border-radius: 5px 5px 5px 5px;"><label
               for="psw-repeat" style = "color: #fe4c50;"><b>Repeat Password</b></label> <input
               type="password" placeholder="Repeat Password" name="psw-repeat"
               required id="pw1"
               style="width: 100%; padding: 15px; margin: 0px auto 20px auto; display: inline-block; border: none; background: #f1f1f1; border-radius: 5px 5px 5px 5px;">
            <div id="pwresult" class="ft" style="border: medium; border-color: red; font-weight: bold; color: red;"></div>
         <div>
            <div style = "color: #fe4c50;"><input type="checkbox" name="remember" style="margin-bottom: 15px" id = "cbox"> Remember me <p  id = "ccbox" class = "ft" style = "border: medium; border-color: red; font-weight: bold; color: red;"></p>            
             </div> 
         </div>   
         <div style = "font-size: 10px; margin-top: -15px;">
            Notify me about Hot GS promotions. (You may unsubscribe from the newsletter at any time)
            I understand and agree to this website's Terms and Privacy Policy.
         </div>
            <div class="clearfix" style="margin-bottom: 15px;">
               <input type="button" name="gogo" id="gogo" value="Sign Up!"
                  style="background-color: white; border: 1px solid #fe4c50; color: #fe4c50; padding: 14px 20px; margin: 8px 0 0 0; border-radius:5px 5px 5px 5px; cursor: pointer; width: 100%;">
            </div>
         </div>
      </div>
   </div>
</div>
<script type="text/javascript">
                                       
$(function(){
   
	$("#emailchk").click(function(){
		alert("왜 클릭이 안되니?");
	});

   //이메일//
   $("#email").click(function(){
      emailall = false;
   });
   $("#nickname").click(function(){
      nickall = false;
   });
   
   $("#email").keyup(function(){
      var email = document.getElementById("email").value;
      var emailall = document.getElementById("emailall").value;
      var nickall = document.getElementById("nickall").value;
      var pt = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
      
      
      if(email == ""){
         $("#emailresult").html("아이디를 입력 하세요.");
      } else if(email.match(pt) == null){
         $("#emailresult").html("이메일 형식이 맞지 않습니다.");
      } else if(email.length < 14 || email.length > 25) {
         $("#emailresult").html("이메일 길이가 적절하지 않습니다.");
      } else {
         $("#emailresult").html("멋진 아이디 입니다.");
         emailall = true;
      }
   });
   
   
   
   $("#emailchk").click(function(){
      var email = $("#email").val();
      var emailchk = document.getElementById("emailchk").value;
      var pt = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
         $.post("<%=request.getContextPath()%>/member/chk", {email:email}, function(data){
            if(data == 1){
               alert("중복하는 e-mail 입니다.");
               $("#email").val("");
            } else {
               if(data == 0){
                  if(email == ""){
                     $("#emailresult").html("아이디를 입력 하세요.");
                  } else if (email.match(pt) == null){
                     $("#emailresult").html("이메일 형식이 맞지 않습니다.");
                     $("#email").val("");
                  } else {
                     var check = confirm("사용가능한 아이디 입니다. 사용하시겠습니까?");
                  }
                  if(check) {
                     emailall = true;
                  } else {
                     $("#email").val("");
                  }}}});});

   // email 최종;; //
      $("#nickname").keyup(function(){
            var nickname = document.getElementById("nickname").value;
            var pt2 = /(^[a-zA-Z0-9])/;         
            var nickname = $.trim($('input[name=nickname]').val()); // jQuery를 이용해 아이디값 가져오기
            
            if(nickname == ""){
               $("#nicknameresult").html("닉네임을 입력 하세요.");
            } else if(nickname.match(pt2) == null){
               $("#nicknameresult").html("닉네임 형식이 맞지 않습니다.");
            } else if(nickname.length < 5 || nickname.length > 10) {
               $("#nicknameresult").html("닉네임 길이가 적절하지 않습니다.");
            } else {
               $("#nicknameresult").html("멋진 닉네임 입니다.");
            }
      });   

   
      $("#nickchk").click(function(){
         var nickname = $("#nickname").val();
         var nickchk = document.getElementById("nickchk").value;
         var pt2 = /(^[a-zA-Z0-9])/;
         
         
          $.post("../member/nickchk", {nickname:nickname}, function(data){
               if(data == 1){
                  alert("중복하는 닉네임 입니다.");
                  $("#nickname").val("");
               } else {
                  if(data == 0){
                     if(nickname == "") {
                        $("#nicknameresult").html("닉네임을 입력하세요.");
                     } else if (nickname.match(pt2) == null) {
                        $("#nicknameresult").html("닉네임 형식이 맞지 않습니다.");
                        $("#nickname").val("");
                     } else {
                        var check = confirm("사용가능한 닉네임 입니다. 사용하시겠습니까?");
                     }
                     if(check) {
                        nickall = true;
                     } else {
                        $("#nickname").val("");}
                     }
                  }
               });
          });


      $("#pw").keyup(function(){
         var pw1 = document.getElementById("pw1").value;
         var pw = document.getElementById("pw").value;
         if(pw1 != pw){
            $("#pwresult").html("비밀번호가 같지 않습니다.");
         } else if (pw.length < 6 || pw.length > 10 || pw1.length < 6 || pw1.length > 10) {
            $("#pwresult").html("비밀번호 길이는 6자이상 10자 이하로 해야 합니다.");
         } else {
            $("#pwresult").html("멋진 비밀번호 입니다.");
         }
      });
      
      $("#pw1").keyup(function(){
         var pw1 = document.getElementById("pw1").value;
         var pw = document.getElementById("pw").value;
         if(pw1 != pw) {
            $("#pwresult").html("비밀번호가 같지 않습니다.");
         } else if (pw1.length < 6 || pw1.length > 10 || pw.length < 6 || pw.length > 10){
            $("#pwresult").html("비밀번호 길이는 6자이상 10자 이하로 해야 합니다.");
         } else {
            $("#pwresult").html("멋진 비밀번호 입니다.");
         }
      });
      
$("#gogo").click(function(){
         var cbox = $("#cbox").prop("checked");
         if(!cbox) {
            $("#ccbox").html("약관에 동의해주세요.");
         } else if(emailall && cbox && nickall) {
            var email = $("#email").val();
            var pw = $("#pw").val();
            var nickname = $("#nickname").val();
            $.post("./member/memberJoin",{
               email : email,
               pw : pw,
               nickname : nickname,
            },function(data){
               if(data > 0) {
                  alert("회원가입 성공");
                  location.reload();                     
               } else {
                  alert("회원가입 실패, 다시 시도 혹은 운영자 문의");
               }
            });
         } else if(!emailall){
            alert("이메일 중복확인은 필수 입니다.");
         } else if(!nickall) {
            alert("닉네임 중복확인은 필수 입니다.");
         } else {
            alert("중복확인은 필수 입니다.");
         }
   });
 });
</script>
   <!-- /JoinModal -->



<body>
	<c:import url="../common/header3.jsp" />
	<section class="container">
		<div class="vnsEmpty"></div>
		<div class="breadcrumbs d-flex flex-row align-items-center">
			<ul style="text-align: right;">
				<li><a href="../">Home</a></li>
				<li class="active"><a href="./noticeList">
					<i class="fa fa-angle-right" aria-hidden="true"></i>Notice</a>
				</li>
			</ul>
		</div>
		<div class="header-div"><a class="notice-Header">Notice</a>
		</div>
		<c:choose>
		<c:when test="${member.kind eq 'admin' }">
			<a href="./noticeWrite" class="noticeWriteAtag">Write</a>
			</c:when>
			<c:otherwise>
				<a class="noticeWriteAtag-1">Write</a>
			</c:otherwise>
			</c:choose>
		<div class="noticeList list-group">
			<c:choose>
				<c:when test="${pager.totalRow eq 0 }">
					<div class="noNotice">
					<img alt="" src="<%=request.getContextPath()%>/resources/images/common/sorry.png">
					<h4 >Sorry, no write notice</h4></div>
				</c:when>
				<c:otherwise>
					<c:forEach items="${noticeList}" var="notice">
							<a href="./noticeView?b_num=${notice.b_num}" class="noticeRow list-group-item list-group-item-action">
								${notice.title}<span class="noticeRegdate">${notice.reg_date}</span></a>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</div>
		<div>
			<c:if test="${pager.totalPage gt 1}">
				<ul class="pagination justify-content-center">
						<%--현재 블럭이 1보다 클 때 Prev 나타남 --%>
						<c:if test="${pager.curBlock gt 1}">
							<li class="page-item"><a class="page-link" href="./noticeList?curPage=${pager.startPage - 1}&kind=${searchInfo.kind}&search=${searchInfo.search}">Prev</a></li>
						</c:if>
						<%-- 현재 블럭의 페이지 리스트 --%>
						<c:forEach begin="${pager.startPage}" end="${pager.endPage}" var="page">
							<c:choose>
								<%-- 현재 페이지를 활성화 상태로 --%>
								<c:when test="${pager.curPage eq page}">
									<li class="page-item active">
										<a class="page-link" href="./noticeList?curPage=${page}&kind=${searchInfo.kind}&search=${searchInfo.search}">${page}</a>
									</li>
								</c:when>
								<%-- 현재 페이지가 아닐때 --%>
								<c:otherwise>
									<li class="page-item">
										<a class="page-link" href="./noticeList?curPage=${page}&kind=${searchInfo.kind}&search=${searchInfo.search}">${page}</a>
									</li>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						<%--현재 블럭이 블럭의 총 갯수보다 작을 때 --%>
						<c:if test="${pager.curBlock lt pager.totalBlock }">
							<li class="page-item">
							<a class="page-link" href="./noticeList?curPage=${pager.endPage + 1}&kind=${searchInfo.kind}&search=${searchInfo.search}">Next</a></li>
						</c:if>
				</ul>
			</c:if>
		</div>
	</section>
	<c:import url="../common/footer.jsp" />
</body>
</html>