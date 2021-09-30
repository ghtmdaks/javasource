<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<header class="header trans_300">

   <!-- Top Navigation -->

   <div class="top_nav">
      <div class="container">
         <div class="row">
            <div class="col-md-6">
               <c:choose>
                  <c:when test="${!empty member}">
                     <div class="top_nav_left"
                        style="font-weight: bold; color: white; text-align: left;">${member.nickname}님
                        환영합니다.</div>
                  </c:when>
                  <c:otherwise>
                     <div class="top_nav_left">로그인 하세요 ^^</div>
                  </c:otherwise>
               </c:choose>
            </div>
            <div class="col-md-6 text-right">
               <div class="top_nav_right">
                  <ul class="top_nav_menu">
                     <!-- Currency / Language / My Account -->
                     <li class="account"><a href="#"> My Account <i
                           class="fa fa-angle-down"></i>
                     </a>
                        <ul class="account_selection">
                           <c:choose>
                              <c:when test="${!empty member}">
                                 <li><a
                                    href="<%=request.getContextPath()%>/member/memberMyPage"><i
                                       class="fa fa-user-plus" aria-hidden="true"></i>My Page</a></li>
                                 <li><a
                                    href="<%=request.getContextPath()%>/member/memberLogout"><i
                                       class="fa fa-user-plus" aria-hidden="true"></i>LogOut</a></li>
                              </c:when>
                              <c:otherwise>
                                 <li><a id="zzz" href="#" data-toggle="modal"
                                    data-target="#myModalLogin"><i class="fa fa-sign-in"
                                       aria-hidden="true"></i>Sign In</a></li>
                                 <li><a href="#" data-toggle="modal"
                                    data-target="#myModalJoin"><i class="fa fa-user-plus"
                                       aria-hidden="true"></i>Register</a></li>
                              </c:otherwise>
                           </c:choose>

                        </ul></li>
                  </ul>
               </div>
            </div>
         </div>
      </div>
   </div>
   <!-- Main Navigation -->
   <div class="main_nav_container">
      <div class="container">
         <div class="row">
            <div class="col-lg-12 text-right">
               <div class="logo_container">
                  <a  class = "font-italic text" href="<%=request.getContextPath()%>/"><span>Hot</span>&nbsp;&nbsp;GS</a>
               </div>
               <nav class="navbar">
                  <ul class="navbar_menu">
                     <li><a href="<%=request.getContextPath()%>/">home</a></li>
                     <li class="modal-title"><a href="<%=request.getContextPath()%>/notice/noticeList">Noitce</a></li>
                     <li><a href="<%=request.getContextPath()%>/game/gameList">Game</a></li>
                     <li><a href="#">Contact</a></li>
                  </ul>
                  <ul class="navbar_user">
                     <li onclick="search()"><a href="#"><i class="fa fa-search"
                           aria-hidden="true"></i></a></li>
                  <c:choose>
                     <c:when test="${!empty member}">
                        <li><a href="<%=request.getContextPath()%>/member/memberMyPage"><i class="fa fa-user" aria-hidden="true"></i></a></li>
                     </c:when>
                     <c:otherwise>
                        <li><a href="#" data-toggle="modal" data-target="#myModalLogin"><i class="fa fa-user" aria-hidden="true"></i></a></li>
                     </c:otherwise>
                  </c:choose>
                  <c:choose>
                     <c:when test = "${!empty member}">
                        <li class="checkout"><a href="<%=request.getContextPath()%>/member/myCart"> <i class="fa fa-shopping-cart" aria-hidden="true"></i></a></li>
                     </c:when>
                     <c:otherwise>
                        <li class="checkout"><a href="#" data-toggle="modal" data-target="#myModalLogin"> <i class="fa fa-shopping-cart" aria-hidden="true"></i></a></li>
                     </c:otherwise>
                  </c:choose>
                  </ul>
                  <div class="hamburger_container">
                     <i class="fa fa-bars" aria-hidden="true"></i>
                  </div>
               </nav>
            </div>
         </div>
      </div>
   </div>

</header>

<div class="fs_menu_overlay"></div>

<!-- Hamburger Menu -->

<div class="hamburger_menu">
   <div class="hamburger_close">
      <i class="fa fa-times" aria-hidden="true"></i>
   </div>
   <div class="hamburger_menu_content text-right">
      <ul class="menu_top_nav">
         <li class="menu_item has-children"></li>
         <li class="menu_item has-children"></li>
         <li class="menu_item has-children"><a href="#"> My Account <i
               class="fa fa-angle-down"></i>
         </a>
            <ul class="menu_selection">
               <c:choose>
                  <c:when test="${!empty member}">
                     <li><a
                        href="<%=request.getContextPath()%>/member/memberMyPage"><i
                           class="fa fa-user-plus" aria-hidden="true"></i>My Page</a></li>
                     <li><a
                        href="<%=request.getContextPath()%>/member/memberLogout"><i
                           class="fa fa-user-plus" aria-hidden="true"></i>LogOut</a></li>
                  </c:when>
                  <c:otherwise>
                     <li><a href="#" data-toggle="modal"
                        data-target="#myModalLogin"><i class="fa fa-sign-in"
                           aria-hidden="true"></i>Sign In</a></li>
                     <li><a href="#" data-toggle="modal"
                        data-target="#myModalJoin"><i class="fa fa-user-plus"
                           aria-hidden="true"></i>Register</a></li>
                  </c:otherwise>
               </c:choose>
            </ul></li>
         <li class="menu_item"><a href="<%=request.getContextPath()%>/">home</a></li>
         <li class="modal-title"><a href="<%=request.getContextPath()%>/notice/noticeList">Noitce</a></li>
         <li><a href="<%=request.getContextPath()%>/game/gameList">Game</a></li>
      </ul>
   </div>
</div>



<!-- JoinModal -->

<!-- The Modal -->
<div class="modal" id="myModalJoin" style = "margin-top: 10px;">
   <div class="modal-dialog">
      <div class="modal-content">
         <!-- Modal Header -->
         <div class="modal-header">
            <h4 style="margin-left: 190px; color: #fe4c50;">Sign Up!!</h4><button type="button" class="close" data-dismiss="modal">&times;</button>
         </div>
         <!-- Modal body -->
         <div class="container">
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
         $.post("./member/chk", {email:email}, function(data){
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
         
         
          $.post("./member/nickchk", {nickname:nickname}, function(data){
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
                        alert(nickname+" 을 사용 합니다.");
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
<!-- searchModal Start -->
<!-- Button to Open the Modal -->
<button type="button" id="searchModalBtn" class="btn btn-primary" data-toggle="modal" data-target="#searchModal" style="display: none;">
  Open modal
</button>
<!-- The Modal -->
<div class="modal" id="searchModal">
  <div class="modal-dialog">
    <div class="modal-content">

      <!-- Modal Header -->
      <div class="modal-header">
      	<h4 class="modal-title">Search</h4>
        <button type="button" class="close" data-dismiss="modal">&times;</button>
      </div>

      <!-- Modal body -->
      <div class="modal-body">
		<div class="form-group">
			<select id="searchFrom" class="form-control">
				<option value="game" >Game Search</option>
				<option value="notice" >Notice Search</option>
			</select>
		</div>
      	<form id="gameSearchForm" action="<%=request.getContextPath()%>/game/gameList">
      		<div class="form-group">
        		<select name="kind" class="form-control">
        			<option value="g_name">Name</option>
        			<option value="developer" >Developer</option>
        			<option value="publisher" >Publisher</option>
        		</select>
      		</div>
	        <div class="form-group"><input name="search" class="form-control" placeholder="Keyword" /></div>
	       	<div class="form-group"><button class="btn btn-link searchBtn" >Search</button></div>
      	</form>
      	<form id="noticeSearchForm" action="<%=request.getContextPath()%>/notice/noticeList" style="display: none;">
      		<div class="form-group">
        		<select name="kind" class="form-control">
        			<option value="title">Title</option>
        			<option value="Contents" >Contents</option>
        		</select>
      		</div>
	        <div class="form-group"><input name="search" class="form-control" placeholder="Keyword" /></div>
	       	<div class="form-group"><button class="btn btn-link searchBtn" >Search</button></div>
      	</form>
      </div>

      <!-- Modal footer -->
<!--       <div class="modal-footer">
        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
      </div> -->

    </div>
  </div>
</div>

<script type="text/javascript">

	function search() {
		$("#searchModalBtn").click();
	}
	
	$(function(){
		$("#searchFrom").change(function(){
			var searchKind = $("#searchFrom").val();
			if (searchKind == "game") {
				$("#gameSearchForm").show();
				$("#noticeSearchForm").hide();
			} else {
				$("#noticeSearchForm").show();
				$("#gameSearchForm").hide();
			}
		});
	});
	
</script>
<!-- searchModal End -->