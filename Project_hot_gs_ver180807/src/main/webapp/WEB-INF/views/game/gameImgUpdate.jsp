<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "No-cache");
	response.setDateHeader("Expires", -1);
	response.setHeader("Cache-Control", "No-store");
%>
<!DOCTYPE html>
<html>
<head>
<c:import url="../import/css/commonCss.jsp" />
<c:import url="../import/css/categoriesCss.jsp" />
<c:import url="../import/js/commonJs.jsp" />
<c:import url="../import/js/categoriesJs.jsp" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/common/vnsCommon.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/game/gameImgUpdate.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">

<script type="text/javascript">
	//메시지 alert
	var message = '${message}';
	if (message != '') {
		alert(message);
	}

	var orgSubImgCnt = ${subImgCnt};
	var subImgCnt = ${subImgCnt};

	function imgDelete(fname, divId) {
		var check = confirm("정말 삭제 하겠습니까?");
		if (check) {
			$.post("./subImgDeleteWithFname", {
				fname : fname
			}, function(data) {
				if (data > 0) {
					orgSubImgCnt--;
					subImgCnt--;
					alert("이미지가 삭제되었습니다.");
					$("#" + divId).remove();
				} else {
					alert("이미지를 삭제하지 못 하였습니다. 다시 시도하거나 운영자에게 문의하세요.");
				}
			});
		}
	}
	
	function viewImg(fname, oname) {
		$("#subImgOname").html(oname);
		$("#subImgSrc").attr("src", "../resources/upload/images/game/sub/" + fname);
		$("#subImgModalBtn").click();
	}

	function extraSubImgDelete(imgCnt) {
		$("#extraSubImg" + imgCnt).remove();
		subImgCnt--;
		if (subImgCnt > orgSubImgCnt) {
			$("#subImgsUploadFrmBtn").show();
		} else {
			$("#subImgsUploadFrmBtn").hide();
		}
	}

	$(function() {

		var cnt = 0;

		// 서브 이미지 추가
		$("#addSubImg")
				.click(
						function() {
							if (subImgCnt < 12) {
								subImgCnt++;
								cnt++;
								$("#subImgsUploadFrm")
										.append(
												'<div id="extraSubImg' + cnt + '" class="fileInput col-sm-7"><input name="files" type="file" class="fileButton" /><i onclick="extraSubImgDelete('
														+ cnt
														+ ')" class="material-icons">delete_forever</i></div>');
							} else {
								alert("서브 이미지는 최대 12개까지만 업로드 가능합니다.")
							}
							if (subImgCnt > orgSubImgCnt) {
								$("#subImgsUploadFrmBtn").show();
							} else {
								$("#subImgsUploadFrmBtn").hide();
							}
						});

		// 추가된 서부 이미지 삭제

		// 추가 서브이미지 업로드
		$("#subImgsUploadFrmBtn").click(function() {
			$("#subImgsUploadFrm").submit();
		});

		$("#mainImgData").change(function() {
			if ($("#mainImgData").val != "") {
				$("#mainImgUpdateFrm").submit();
			}
		});

	});
</script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Game Image Update</title>
</head>
<body>
	<c:import url="../common/header.jsp" />
	<section class="container">
		<div class="vnsEmpty"></div>
		<div class="breadcrumbs d-flex flex-row align-items-center">
			<ul style="text-align: right;">
				<li><a href="../">Home</a></li>
				<li><a href="./gameList"><i class="fa fa-angle-right"
						aria-hidden="false"></i>Game</a></li>
				<li><a href="./gameView?g_num=${game.g_num}"><i
						class="fa fa-angle-right" aria-hidden="false"></i>${game.g_name}</a></li>
				<li class="active"><a
					href="./gameImgUpdate?g_num=${game.g_num}"> <i
						class="fa fa-angle-right" aria-hidden="true"></i>Image Update
				</a></li>
			</ul>
		</div>
		<div style="min-height: 500px;">
			<!-- ************************** -->
			<div class="main-container">
				<!-- 1 -->
				<div>
					<!-- 2 -->
					<div class="main-Imgname">Main Image</div>
					<!-- 2 -->
					<!-- 3 -->
					<div id="mainImgUpdateDiv" style="display: none;">
						<form id="mainImgUpdateFrm" action="./mainImgUpdate" method="post"
							enctype="multipart/form-data">
							<input name="gf_num" value="${mainImg.gf_num}" type="hidden" />
							<input id="mainImgData" name="mainImg" type="file" />
						</form>
					</div>
					<!-- 3 -->
					<!-- 4 -->
					<div class="realImgDiv">
						<img onclick='$("#mainImgData").click()'
							src="../resources/upload/images/game/main/${mainImg.fname}" />
					</div>
					<!-- 4 -->
				</div>
				<!-- 1 -->
			</div>
			<!-- ************************** -->

			<div style="width: 100%;">
				<div class="sub-Imgname">
					<div>Sub Image</div>
					<div>
						<a id="addSubImg" href="#"><i class="fa fa-plus"></i> </a> <a
							id="subImgsUploadFrmBtn" href="#" style="display: none;"><i
							class="	fa fa-check"></i>&nbsp;&nbsp;</a>
					</div>
				</div>
				<form id="subImgsUploadFrm" action="./imgsUpload" method="post"
					enctype="multipart/form-data">
					<input name="g_num" type="hidden" value="${g_num}" />
				</form>

			</div>
			<!-- ************************** -->
			<div class="row">
				<c:forEach items="${subImgs}" var="subImg" varStatus="i">
					<div class="col-sm-5 file-out" id="subImg${i.index}">
						<div><span onclick="viewImg('${subImg.fname}', '${subImg.oname}')" ><a href="#">${subImg.oname}</a></span>
							<div class="ImgDelete-btn">
								<a onclick="imgDelete('${subImg.fname}', 'subImg${i.index}')"
									href="#"><i class="material-icons">delete_forever</i></a>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
			<!-- ************************** -->
			<button id="subImgModalBtn" type="button" data-toggle="modal"
				data-target="#subImgModal" style="display: none;" >Open modal</button>

			<!-- The Modal -->
			<div class="modal" id="subImgModal">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h5 id="subImgOname" class="modal-title"></h5>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							<img id="subImgSrc" src="" style="width: 100%" />
						</div>

					</div>
				</div>
			</div>
		</div>
	</section>
	<c:import url="../common/footer.jsp" />
</body>
</html>