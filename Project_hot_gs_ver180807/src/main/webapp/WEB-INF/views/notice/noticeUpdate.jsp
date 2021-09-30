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
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/common/vnsCommon.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/notice/noticeCommon.css">
<script src="../resources/SE2/js/HuskyEZCreator.js"></script>
<script type="text/javascript">
	var message = "${message}";
	if (message != "") {
		alert(message);
	}
	
	var email = "${member.email}";
	var kind = "${member.kind}";
	
	var fileCnt = ${fileCnt};
	function fileAdd() {
		if(fileCnt < 10){
			fileCnt++;
			$("#fileUploadDiv").append('<div id="file'+fileCnt+'" class="col-6 form-group"><img onclick="fileReduce('+fileCnt+')" class="fileDeleteIcon" width="18px" height="18px" src="../resources/images/common/removeIcon.png" /><input class="noticeFile" type="file" name="files" /></div>');
		} else {
			alert("첨부파일은 10개까지만 추가 가능합니다.");
		}
	}
	
	function fileReduce(divNum) {
		$("#file" + divNum).remove();
		fileCnt--;
	}
	
	function fileDelete(fname, divId) {
		var check = confirm("정말 삭제 하겠습니까?");
		if(check){
			 $.post("./fileDeleteWithFname", {
				fname : fname
			}, function(data){
				if(data > 0){
					alert("파일이 삭제되었습니다.");
					$("#file" + divId).remove();
				} else {
					alert("파일를 삭제하지 못 하였습니다. 다시 시도하거나 운영자에게 문의하세요.");
				}
			});
		}
	}
	
	$(function() {
		//SmartEditor start 
		var editor_object = [];

		nhn.husky.EZCreator.createInIFrame({
			oAppRef : editor_object,
			//textarea ID
			elPlaceHolder : "contents",
			/* 주소 바꿀껏  */
			sSkinURI : "../resources/SE2/SmartEditor2Skin.html",
			htParams : {
				// 툴바 사용 여부 (true:사용/ false:사용하지 않음)
				bUseToolbar : true,
				// 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
				bUseVerticalResizer : true,
				// 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
				bUseModeChanger : false,
			}
		});

		//전송버튼 클릭이벤트
		$("#btn").click(
				function() {
					//id가 smarteditor인 textarea에 에디터에서 대입
					editor_object.getById["contents"].exec(
							"UPDATE_CONTENTS_FIELD", []);

					// 이부분에 에디터 validation 검증

					var title = $("#title").val();
					var titler = title.replace(/[ ]/g,'');
					var contents = $("#contents").val();
					var contentsr = contents.replace(/[ ]/g,'');
					
					//폼 submit
					if(email == '' || kind != "admin"){
						alert("관리원으로 로그인 해주세요.");
					} else if(titler.length < 2 || title.length > 360) {
						alert("Title(이)가 너무 길거나 짧습니다.");
					} else if(contentsr.length < 20 || contents.length > 3600) {
						alert("Contents(이)가 너무 길거나 짧습니다.");
					} else {
						$("#frm").submit();
					}
				});
	});
</script>
<title>Notice Update</title>
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
						<i class="fa fa-angle-right" aria-hidden="true"></i>Update</a>
					</li>
				</ul>
			</div>
		<form id="frm" action="./noticeUpdate" method="post" enctype="multipart/form-data">
			<input name="b_num" type="hidden" value="${board.b_num}" />
			<div class="form-group">
				<label for="title">제목:</label>
				<input name="title" type="text" class="form-control" id="title" value="${board.title}" placeholder="Title">
			</div>
			<div class="form-group">
				<label for="contents">내용:</label>
				<textarea name="contents" rows="5" class="form-control"
					id="contents" placeholder="Contents">${board.contents}</textarea>
			</div>
			<div class="form-group"><input class="fileAddBtn btn btn-info" type="button" value="첨부파일 추가" onclick="fileAdd()" /></div>
			<div id="fileUploadDiv" class="row">
				<c:forEach items="${files}" var="file" varStatus="i">
					<div id="file${i.index}" class="col-6 form-group">
							<img onclick="fileDelete('${file.fname}', ${i.index})" class="fileDeleteIcon" width="18px" height="18px"
								src="../resources/images/common/removeIcon.png" /><span>${file.oname}</span>
					</div>
				</c:forEach>
			</div>
		</form>
		<div class="noticeBtnDiv">
		<button id="btn" class="noticeWriteBtn btn btn-success" type="button">수정</button>
		<button onclick="location.href='./noticeView?b_num=${board.b_num}'" class="noticeCancelBtn btn btn-warning">취소</button>
		</div>
	</section>
	<c:import url="../common/footer.jsp" />
</body>
</html>