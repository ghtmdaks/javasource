<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% response.setHeader("Pragma","No-cache"); response.setHeader("Cache-Control","No-cache"); response.setDateHeader("Expires", -1); response.setHeader("Cache-Control", "No-store"); %>
<!DOCTYPE html>
<html>
<head>
<c:import url="../import/css/commonCss.jsp" />
<c:import url="../import/css/categoriesCss.jsp" />
<c:import url="../import/js/commonJs.jsp" />
<c:import url="../import/js/categoriesJs.jsp" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/common/vnsCommon.css">
<link rel="stylesheet" type="text/css" href="../resources/css/game/gameInsertAndUpdate.css">
<script src="../resources/SE2/js/HuskyEZCreator.js"></script>

<script type="text/javascript">

	var subImgCnt = 0;
	
	function subImgAdd() {
		if(subImgCnt < 12){
			subImgCnt++;
			$("#subImgsDiv").append('<div id="subImg'+subImgCnt+'" class="col-6 form-group"><img onclick="subImgReduce('+subImgCnt+')" class="subImgDeleteIcon" width="18px" height="18px" src="../resources/images/common/removeIcon.png" /><input class="gameSubImg" type="file" name="subImgs" /></div>');
			
		} else {
			alert("서브 이미지는 12개까지만 추가 가능합니다.");
		}
		if(subImgCnt > 0) {
			$(".subImages").show();
		}
	}
	
	function subImgReduce(divNum) {
		$("#subImg" + divNum).remove();
		subImgCnt--;
		if(subImgCnt == 0) {
			$(".subImages").hide();
		}
	}
	
	var genreCnt = 0;
	
	$(function(){
		
		// 메인 이미지 세트
		$("#mainImg").change(function(){
			if($("#mainImg").val() != "") {
				$("#mainImg").show();
			} else {
				$("#mainImg").hide();
			}
		});
		
		// 장르 최소 1개 선택
		$(".genreCheckbox").click(function(){
			if($(this).prop("checked")) {
				genreCnt++;
			} else {
				genreCnt--;
			}
		});
		
		//SmartEditor start 
		var editor_object = [];

		nhn.husky.EZCreator.createInIFrame({
			oAppRef : editor_object,
			//textarea ID
			elPlaceHolder : "g_info",
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

		var kind = '${member.kind}';
		
		//전송버튼 클릭이벤트
		$("#gameInsertBtn").click(function() {
			//id가 smarteditor인 textarea에 에디터에서 대입
			editor_object.getById["g_info"].exec(
					"UPDATE_CONTENTS_FIELD", []);

			// 이부분에 에디터 validation 검증
			
			// 입력 데이터
			var g_name = $("#g_name").val();
			var g_namer = g_name.replace(/[ ]/g,''); 
			var developer = $("#developer").val();
			var developerr = developer.replace(/[ ]/g,'');
			var publisher = $("#publisher").val();
			var publisherr = publisher.replace(/[ ]/g,'');
			var price = $("#price").val();
			var g_date = $("#g_date").val();
			var g_info = $("#g_info").val();
			var g_infor = g_info.replace(/[ ]/g,'');
			var curDate = new Date();
			var minDate = new Date("1, 1, 1972");
			
			//폼 submit
			if(kind != 'admin') {
				alert("관리원으로 로그인 해주세요.");
			} else if(g_namer.length < 2 || g_name.length>360) {
				alert("Name(이)가 너무 길거나 짧습니다.");
				$("#g_name").focus();
			} else if(developer.length < 2 || developerr.length>360) {
				alert("Developer(이)가 너무 길거나 짧습니다.");
				$("#developer").focus();
			} else if(publisher.length < 2 || publisherr.length>360) {
				alert("Publisher(이)가 너무 길거나 짧습니다.");
				$("#publisher").focus();
			} else if(price.length == 0) {
				alert("Price을 입력해 주세요.");
				$("#price").focus();
			} else if(price < 0 || price > 2000) {
				alert("정확한 Price을 입력해 주세요.");
				$("#price").focus();
			} else if(g_date.length == 0) {
				alert("Release Date을 입력해 주세요.");
				$("#g_date").focus();
			} else if(genreCnt == 0) {
				alert("Genre을 적어도 하나 선택해주세요.");
			} else if(g_infor.length < 20 || g_info.length >3600) {
				alert("Game Infomation(이)가 너무 길거나 짧습니다.");
			} else {
				 $("#gameInsertFrm").submit();
			}
		});
		
	});
</script>

<title>New Game</title>
</head>
<body>
	<c:import url="../common/header.jsp" />
	<section class="container">
		<div class="vnsEmpty"></div>
		<div class="breadcrumbs d-flex flex-row align-items-center">
			<ul style="text-align: right;">
				<li><a href="../">Home</a></li>
				<li><a href="./gameList"><i class="fa fa-angle-right" aria-hidden="false"></i>Game</a></li>
				<li class="active"><a href="./gameInsert">
					<i class="fa fa-angle-right" aria-hidden="true"></i>New Game</a>
				</li>
			</ul>
		</div>
		<form id="gameInsertFrm" action="./gameInsert" method="post" enctype="multipart/form-data">
			<div class="row">
				<div class="col-sm-6">
					<div class="form-group">
						<label for="g_name">Name:</label>
						<input name="g_name" type="text" class="form-control" id="g_name" placeholder="Name" required="required">
					</div>
				</div>
				<div class="col-sm-6">
					<div class="form-group">
						<label for="steamAppId">Steam App ID:</label>
						<input name="steamAppId" type="text" class="form-control" id="steamAppId" placeholder="Steam App ID" required="required">
					</div>
				</div>
				<div class="col-sm-6">
					<div class="form-group">
						<label for="developer">Developer:</label>
						<input name="developer" type="text" class="form-control" id="developer" placeholder="Developer" required="required">
					</div>
				</div>
				<div class="col-sm-6">
					<div class="form-group">
						<label for="publisher">Publisher:</label>
						<input name="publisher" type="text" class="form-control" id="publisher" placeholder="Publisher" required="required">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6">
					<div class="form-group">
						<label for="price">Price:</label>
						<input name="price" type="number" step="0.01" class="form-control" id="price" placeholder="Price" required="required">
					</div>
				</div>
				<div class="col-sm-6">
					<div class="form-group">
						<label for="g_date">Release Date:</label>
						<input name="g_date" type="date" class="form-control" id="g_date" placeholder="Release date" required="required">
					</div>
				</div>
			</div>
			<div class="form-group">
				<label for="genre">Genre:</label>
				<div class="row">
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="RPG">RPG
					</label></div>
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="VR">VR
					</label></div>
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="Indie">Indie
					</label></div>
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="Sports">Sports
					</label></div>
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="Multiplayer">Multiplayer
					</label></div>
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="Simulation">Simulation
					</label></div>
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="Stealth">Stealth
					</label></div>
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="Strategy">Strategy
					</label></div>
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="Adventure">Adventure
					</label></div>
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="FPS">FPS
					</label></div>
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="Action">Action
					</label></div>
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="Tabletop">Tabletop
					</label></div>
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="Software">Software
					</label></div>
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="Racing">Racing
					</label></div>
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="Puzzle">Puzzle
					</label></div>
					<div class="col-sm-3"><label class="form-check-label">
						<input type="checkbox" name="genres" class="genreCheckbox form-check-input" value="Retro">Retro
					</label></div>
				</div>
			</div>
			<div class="form-group">
				<label for="g_info">Game Infomation:</label>
				<textarea class="form-control" id="g_info" name="g_info" placeholder="Game Infomation"></textarea>
			</div>
			<div class="row">
				<div class="col-sm-6">
					<div class="form-group">
						<input onclick='$("#mainImg").click()' class="setMainImgBtn vnsBtn" onclick="showMainImgInput()" type="button" value="Set Main Image" />
						<span id="mainImgName"></span>
						<input name="mainImg" type="file" id="mainImg">
					</div>
				</div>
				<div class="col-sm-6"><input class="addSubImgBtn vnsBtn" onclick="subImgAdd()" type="button" value="Add Sub Image"/></div>
			</div>
			<div>
				<div class="form-group">
					<label class="subImages" for="subImgsDiv">Sub Images: </label>
					<div id="subImgsDiv" class="row"></div>
				</div>
			</div>
		</form>
		<div class="gameBtnDiv form-group">
			<button class="gameBtn vnsBtn" id="gameInsertBtn">등록</button>
			<button class="gameBtn vnsBtn" onclick="location.href='./gameList'" >취소</button>
		</div>
	</section>
	<c:import url="../common/footer.jsp" />
</body>
</html>