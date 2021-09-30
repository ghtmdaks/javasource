<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% response.setHeader("Pragma","No-cache"); response.setHeader("Cache-Control","No-cache"); response.setDateHeader("Expires", -1); response.setHeader("Cache-Control", "No-store"); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script> 
<script type="text/javascript">
	function memberDelete() {
		var check = confirm("정말 삭제 하겠습니까?");
		if(check){
		var email = $("#email").val();
		var pw = $("#pw").val();
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
<title>Insert title here</title>
</head>
<body>
	<h1>Member Delete</h1>
	
	<div>
		<p> email : <input id="email" type = "email" name = email></p>
		<p> pw : <input id="pw" type = "password" name = "pw"></p>
		<button onclick="memberDelete()" type = "button">delete</button>
	</div>
	
	
</body>
</html>