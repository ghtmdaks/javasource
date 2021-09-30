<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1>1:1 문의 하기</h1>
	<form name="contact-form" class="form" action="sendMail" method = "post">
    <div class="col-xs-12">
    	<p><input type = "email" name = "email" value = "${member.email}" readonly="readonly"></p>
        <label>
            <span>제목:</span>
            <input type="text" name="subject" value="" placeholder="제목" required>
        </label>
    </div>
    <div class="col-xs-12">
        <label>
            <span>내용:</span>
            <textarea name="message" rows="4" placeholder="메시지" required></textarea>
        </label>
        <button type="submit" class="button">
            <span class="default">Send <i class="icon fa fa-paper-plane"></i></span>
        </button>
    </div>
</form>
</body>
</html>