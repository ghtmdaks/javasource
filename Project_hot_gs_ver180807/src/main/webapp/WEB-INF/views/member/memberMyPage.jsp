<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% response.setHeader("Pragma","No-cache"); response.setHeader("Cache-Control","No-cache"); response.setDateHeader("Expires", -1); response.setHeader("Cache-Control", "No-store"); %>
<!DOCTYPE html>
<html>
<head>
<c:import url="../import/css/commonCss.jsp" />
<c:import url="../import/css/indexCss.jsp" />
<c:import url="../import/css/categoriesCss.jsp" />
<c:import url="../import/js/commonJs.jsp" />
<c:import url="../import/js/indexJs.jsp" />
<c:import url="../import/js/categoriesJs.jsp" />
<script type="text/javascript">

$(function(){
   $("#kk").click(function(){
      var opw = $("#opw").val();
      var npw = $("#npw").val();
      var msg = '${message}';
      $.post("./pwUpdate",{
         opw : opw,
         npw : npw
      },function(data){
         if(data > 0) {
            alert("비밀번호 수정 성공");
            location.reload();
         } else {
            alert(msg);
         }
      })
   });
});
$(function(){
   $("#nickchk2").click(function(){
      var pattern3 = /(^[a-zA-Z0-9])/;
      var nickname2 = $("#nickname2").val();
      if(!pattern3.test(nickname2)){
         alert("닉네임은 영문과 숫자로만 가능합니다.")
         $("#nickname2").val("");
         return false;
      } else {
         $.post("./nickchk", {nickname:nickname2}, function(data){
            if(data == 1){
               alert("중복된 닉네임 입니다.");
               $("#nickname2").val("");
            } else {
               if(data == 0){
                  var check = confirm("사용가능한 닉네임 입니다. 사용하시겠습니까?");
                  if(check) {
                     $.post("./nicknameUpdate",{
                        email : '${member.email}',
                        nickname : nickname2
                     },function(data){
                        if(data > 0) {
                           alert("닉네임 수정 성공");
                           location.reload();
                        } else {
                           alert("닉네임 수정 실패, 다시 시도 혹은 운영자 문의");
                        }
                     });
                     alert(nickname2+" 을 사용 합니다.");
                  } else {
                     $("#nickname2").val("");}
                  }
               }
            });
      }
   });
});

function myGame(){
   location.href = "./myGamepage";
}
var message = "${message}";
if (message != "") {
   alert(message);
}
$(function() {
   var msg='${msg}';
   if(msg !=''){
      alert(msg);
   }
});
$(function(){
   $("#image").click(function(){
      $("#file").click();
   });
});
$(function() {
   $("#file").change(function() {
      var file = $("#file").val();
      if (file != "") {
         $("#imgUpdateBtn").click();
      } else {
         $("#imgUpdateBtn").hide();
      }
   });
});

function memberDelete() {
   var check = confirm("정말 삭제 하겠습니까?");
   if(check){
   var email = $("#email3").val();
   var pw = $("#pw3").val();
   $.post("./memberDelete",{
      email : email,
      pw : pw
   }, function(data){
         if (data > 0) {
            alert("회원탈퇴 성공");
            location.href = "../";
         } else {
            alert("이메일 혹은 비밀번호를 확인하세요.");
         }
      });
   }
}


</script>
<title>msg</title>
</head>
<body>

   <c:import url="../common/header.jsp"></c:import>
   <div style="height: 150px"></div>
   <div class="container breadcrumbs d-flex flex-row align-items-center">
		<ul>
			<li><a href="<%=request.getContextPath()%>/">Home</a></li>
			<li class="active"><a
				href="javascript:window.location.href=window.location.href">
					<i class="fa fa-angle-right" aria-hidden="true"></i>My Page
			</a></li>
		</ul>
	</div>


   <form action = "./imgUpdate" id = "imgUpdate" method = "POST" enctype="multipart/form-data" style = "display: none">
      <input type = "hidden" name = "email" value = "${member.email}" readonly="readonly">
      <input id="file" type = "file" name = "file">
      <button id="imgUpdateBtn" style="display: none;">수정</button>
   </form>
   <div class = "container" style= "margin: 7% auto 0 auto;">
   <div style = "text-align: center;"><img id = "image" src="../resources/upload/images/member/${member.fname}"
    class="rounded-circle" alt="Cinque Terre" width="270" height="250"></div>
   <BR>
   <br>     
   <div class = "mypageBtn" style = "text-align: center; color:black;">
      <button type ="button" class="btn btn-outline-dark" data-toggle="modal" data-target="#myModalUpdate" style = "background-color: white; border: 1px solid #fe4c50; color: #fe4c50;">Update</button>
      <c:if test="${member.kind ne 'admin'}">
	      <button id = "gameList" type = "button" onclick = "location.href='./myGame'" class="btn btn-outline-dark" style = "background-color: white; border: 1px solid #fe4c50; color: #fe4c50; margin-left: 10px; margin-right: 10px; ">myGame</button>
	      <button id = "myCart" type = "button" onclick = "location.href='./myCart'" class="btn btn-outline-dark" style = "background-color: white; border: 1px solid #fe4c50; color: #fe4c50;">myCart</button>
      </c:if>
   </div>
   </div>
   
   
  <!-- The Modal -->
  <div class="modal" id="myModalUpdate">
    <div class="modal-dialog">
      <div class="modal-content" style = "margin-top: 100px;">
      
       
       <div id="demo" class="carousel slide" data-ride="">
   
         <ul class="carousel-indicators" style = "border: none; color: #fe4c50; padding: 15px; margin-top: 50px;">
             <li data-target="#demo" data-slide-to="0" class="active" style = "background-color: #fe4c50; width: 5px; height: 5px; border-radius: 10px;"></li>
             <li data-target="#demo" data-slide-to="1" style = "background-color: #fe4c50; width: 5px; height: 5px; margin: 0 40px 0 40px; border-radius: 10px;"></li>
             <li data-target="#demo" data-slide-to="2" style = "background-color: #fe4c50; width: 5px; height: 5px; border-radius: 10px;"></li>
             <c:if test="${member.kind ne 'admin'}">
	             <li data-target="#demo" data-slide-to="3" style = "background-color: #fe4c50; width: 5px; height: 5px; margin: 0 0 0 40px; border-radius: 10px;"></li>
             </c:if>
         </ul>
 
  
  <!-- My Information -->
  <div class="carousel-inner">
    <div class="carousel-item active" style = "width: 500px; height: 450px;">
      
       <!-- Modal Header -->
        <div class="modal-header"  style = "width:100%; text-align: center;"> <span style = "font-size: 30px; margin-left: 130px; color: #fe4c50;">my Information</span>
        </div>
        
        <!-- Modal body -->
        <br/>
      <input type = "hidden" name = "kind" value = "nomal" style = "margin-top: 50px;">
      <div><span style = "width:80%; margin: 0 0 0 50px; color: #fe4c50;">User E-mail</span><input type = "email" name = "email" 
      style = "text-align: center; width:80%; margin: 0 0 20px 50px; padding: 15px; display: inline-block; border: none; background: #f1f1f1; border-radius: 5px 5px 5px 5px; float: left;" value = "${member.email}" readonly="readonly"></div>
        <span style = "width:80%; margin: 0 0 50px 50px; color: #fe4c50;">Nick Name</span><div class= 
        "input-group"  style = "text-align: center; margin: 0 0 90px 50px;">
        <input type = "text" style = "text-align: center; width: 80%; padding: 15px; display: inline-block; border: none; background: #f1f1f1; border-radius: 5px 5px 5px 5px; float: left;" value = "${member.nickname}" readonly="readonly"/>
        </div>
       
        <button type="button" class="btn btn-outline-secondary" data-dismiss="modal" style = "text-align: center; width:80%; margin-left: 50px; background-color: white; border: 1px solid #fe4c50; color: #fe4c50;">Close</button>
    </div>
    
    <!-- My PassWord -->
    <div class="carousel-item" style = "width: 500px; height: 450px;">
           <!-- Modal body -->
           <div class="modal-header"  style = "width:100%; text-align: center;">
              <span style = "font-size: 30px; margin-left: 135px; color: #fe4c50;">my Password</span>
           </div>
              <br/>
         
            <p style = "color: #fe4c50;"><span style = "width:80%; margin: 0 0 0 50px;">Current Password</span>
            <input type="password" id = "opw" style = "text-align: center; width:80%; margin: 0 0 25px 50px; padding: 10px; display: inline-block; border: none; background: #f1f1f1; border-radius: 5px 5px 5px 5px; float: left;"></p>
         
            
            <p style = "color: #fe4c50;"><span style = "width:80%; margin: 0 0 0 50px;">Password to replace</span>
            <input type="password" id = "npw" style = "text-align: center; width:80%; margin: 0 0 25px 50px; padding: 10px; display: inline-block; border: none; background: #f1f1f1; border-radius: 5px 5px 5px 5px; float: left;"><p>
         
            <span style = "width:80%; margin: 0 0 0 50px; color: #fe4c50;">Confirm Password</span>
            <input type="password" style = "text-align: center; width:80%; margin: 0 0 0 50px; padding: 10px; display: inline-block; border: none; background: #f1f1f1; border-radius: 5px 5px 5px 5px; float: left;">
      
            
            <div class = "input-group" style = "width: 80%; margin-top: 25px;">   
                <button type="button" class="btn btn-outline-secondary" id = "kk" style = "text-align: center; width:40%; margin: 25px 0 25px 50px;    background-color: #fe4c50; border: 1px solid #fe4c50; color: white">Submit</button>
                 <button type="button" class="btn btn-outline-secondary" data-dismiss="modal" style = "text-align: center; width:40%; margin-left: 209px; margin-top:25px; height: 50px; background-color: white; border: 1px solid #fe4c50; color: #fe4c50;" id = "kill">Close</button>
              </div>
             
    </div>
  
    <div class="carousel-item" style = "width: 500px; height: 450px;">
      <div class="modal-header"  style = "width:100%; text-align: center;">
        <span style = "font-size: 30px; margin-left: 130px; color: #fe4c50;">new Nickname</span>
      </div>
      <br/>
         <input type = "hidden" name = "kind" value = "nomal">
      <div><span style = "width:80%; margin: 10px 0 0 50px; color: #fe4c50;">User E-mail</span><input type = "email" name = "email" id ="email"
      style = "text-align: center; width:80%; margin: 0 0 20px 50px; padding: 15px; display: inline-block; border: none; background: #f1f1f1; border-radius: 5px 5px 5px 5px; float: left;" value = "${member.email}" readonly="readonly"></div>
         <input type = "hidden" name = "pw" id = "pw" value = "${member.pw}">
        <span style = "width:80%; margin: 0 0 0 50px; color: #fe4c50;">Nick Name</span>
        <div class= "input-group"  style = "text-align: center; margin: 5px 0 30px 50px;">
        <input type = "text" id ="nickname2" name = "nickname2" 
        style = "text-align: center; width: 55%; padding: 15px; display: inline-block; border: none; background: #f1f1f1; border-radius: 5px 5px 5px 5px; float: left;" value = "${member.nickname}"/>
        <button class="btn btn-dark" type="button" style= "width: 20%; margin-left: 25px; background-color: white; border: 1px solid #fe4c50; color: #fe4c50;" name = "nickchk2" id = "nickchk2">Click</button></div>
        <button type="button" class="btn btn-outline-secondary" data-dismiss="modal" style = "text-align: center; width:80%; margin: 60px 0 0 50px; background-color: white; border: 1px solid #fe4c50; color: #fe4c50;">Close</button>
        </div>
     <c:if test="${member.kind ne 'admin'}">
     <div class="carousel-item" style = "width: 500px; height: 450px;">
          <!-- Modal Header -->
        <div class="modal-header"  style = "width:100%; text-align: center;"> <span style = "font-size: 25px; margin-left: 90px; color: #fe4c50;">Membership Withdrawal</span>
        </div>
        
        <!-- Modal body -->
        <br/>
      <input type = "hidden" name = "kind" value = "nomal" style = "margin-top: 50px;">
      <div><span style = "width:80%; margin: 0 0 0 50px; color: #fe4c50;">User E-mail</span><input type = "email" name = "email3" id = "email3"
      style = "text-align: center; width:80%; margin: 20px 0 40px 50px; padding: 15px; display: inline-block; border: none; background: #f1f1f1; border-radius: 5px 5px 5px 5px; float: left;"></div>
        <span style = "width:80%; margin: 0 0 50px 50px; color: #fe4c50;">Password</span><div class= 
        "input-group"  style = "text-align: center; margin: 0 0 40px 50px;">
        <input type = "password" id = "pw3" name = "pw3" style = "text-align: center; width: 80%; padding: 15px; display: inline-block; border: none; background: #f1f1f1; border-radius: 5px 5px 5px 5px; float: left;"/>
        </div>
                <div class = "input-group" style = "width: 80%; margin-top: 5px;">   
                 <button type="button" class="btn btn-outline-secondary" onclick = "memberDelete()" style = "text-align: center; width:40%; margin: 25px 0 25px 50px;    background-color: #fe4c50; border: 1px solid #fe4c50; color: white">Submit</button>
                 <button type="button" class="btn btn-outline-secondary" data-dismiss="modal" style = "text-align: center; width:40%; margin-left: 209px; margin-top:25px; height: 50px; background-color: white; border: 1px solid #fe4c50; color: #fe4c50;" id = "kill">Close</button>
              </div>
        </div>
     </c:if>
  </div>
    </div>
</div>
      </div>
    </div>
      <c:import url="../common/footer.jsp"></c:import>
</body>

</html>