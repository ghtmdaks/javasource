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
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/notice/noticeView.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/common/vnsCommon.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript">
	var message = "${message}";
	if (message != "") {
		alert(message);
	}
	
	function noticeDelete(b_num) {
		var check = confirm("정말 삭제 하겠습니까?");
		if(check) {
			$.post("./noticeDelete",{
				b_num : b_num
			}, function(data){
				if(data > 0) {
					alert("Notice Delete Success");
					location.href = "./noticeList";
				} else {
					alert("Notice Delete Fail");
				}
			});
		}
	}
	
	var showFileFlag = false;
	function showFile() {
		if(showFileFlag){
			$(".boardFilesDiv").hide();
			showFileFlag = !showFileFlag;
		} else {
			$(".boardFilesDiv").show();
			showFileFlag = !showFileFlag;
		}
	}
	
</script>
<title>${board.title}</title>
</head>
<body>
	<c:import url="../common/header.jsp" />
	<section class="container">
		<div class="vnsEmpty"></div>
		<div class="breadcrumbs d-flex flex-row align-items-center">
			<ul style="text-align: right;">
				<li><a href="../">Home</a></li>
				<li><a href="./noticeList"><i class="fa fa-angle-right" aria-hidden="false"></i>Notice</a></li>
				<li class="active"><a href="./noticeList">
					<i class="fa fa-angle-right" aria-hidden="true"></i>${board.title}</a>
				</li>
			</ul>
		</div>
		<div class="boardTitleDiv">
			<a>${board.title}</a>
		</div>
		<div class="boardInfoDiv">
			<span class="boardHit">hit: <span>${board.hit}</span></span><span class="boardRegdate">${board.reg_date}</span>
			<c:if test="${member.kind eq 'admin' }">
				<button class="boardBtn btn btn-link" onclick="noticeDelete(${board.b_num})">삭제</button>
				<button class="boardBtn btn btn-link" onclick='location.href="./noticeUpdate?b_num=${board.b_num}"'>수정</button>
			</c:if>
			<button class="boardBtn btn btn-link" onclick="showFile()">첨부파일 <i class="fa fa-paperclip"></i></button>
		</div>
		<div class="boardFilesDiv">
			<c:choose>
				<c:when test="${fileCnt eq 0}">
					<div><span>첨부파일이 없습니다.</span></div>
				</c:when>
				<c:otherwise>
					<div class="row">
						<c:forEach items="${files}" var="file">
							<a class="boardFiles col-sm-6" href="./fileDownload?fname=${file.fname}&oname=${file.oname}">${file.oname}</a>
						</c:forEach>
					</div>
				</c:otherwise>
			</c:choose>
		</div>
		<div class="boardContentsDiv">${board.contents}</div>
		
	</section>
	<c:import url="../common/footer.jsp" />
</body>
</html>