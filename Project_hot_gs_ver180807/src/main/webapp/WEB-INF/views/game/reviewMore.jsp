<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<c:forEach items="${reviewList}" var="review">
		
<%-- 		<c:choose>
			<c:when test="${review.depth gt 0}"> --%>
		<div class="user_review_container d-flex flex-column flex-sm-row"  <c:if test="${review.depth gt 0}">style="padding-left: 9%"</c:if> >
<%-- 			</c:when>
			<c:otherwise>
				<div class="user_review_container d-flex flex-column flex-sm-row">
			</c:otherwise>
		</c:choose> --%>

		<div class="user">
			<div class="user_pic">
				<img  class="rounded-circle" width="70" height="70" src="../resources/upload/images/member/${review.fname}">
			</div>
		</div>
		<div class="review">
			<div class="review_date">
			${review.reg_date}
				<c:if test="${review.email ne 'Unknown' }">
					<c:if test="${member.email eq review.email }">
						<!-- 삭제버튼 -->
						<a id="beforeDeleteBtn${review.r_num }" onclick="reviewDelete(${review.r_num })"> 
						<i class="material-icons" style="font-size: 1.5rem !important; float: right; margin-left: 0.5%">delete_forever</i>
						</a>
						<!-- 수정버튼 -->
						<a id="beforeUpdateBtn${review.r_num }" onclick="reviewText(${review.r_num })">
						 <i class="material-icons" style="font-size: 1.5rem !important; float: right; margin-left: 0.5%">edit</i>
						 </a>
					</c:if>
					<!-- 댓글버튼 -->
					<c:if test="${review.depth lt 1 }">
						<c:if test="${!empty member }">
							<a id="beforeReplyBtn${review.r_num}" onclick="reviewReplyText(${review.r_num})">
							 <i class="material-icons" style="font-size: 1.5rem !important; float: right;">reply</i>
							 </a>
						 </c:if>
					</c:if>
					<!-- 수정취소버튼 -->
					<a id="afterCancelBtn${review.r_num}" onclick="reviewCancelText(${review.r_num})" style="display: none; font-size: 1.5rem; float: right; margin-left: 1%">
						<i class="fa fa-close"></i>
					</a>
					<!-- 수정완료버튼 -->
					<a id="afterUpdateBtn${review.r_num}" onclick="reviewUpdateText(${review.r_num})" style="display: none; font-size: 1.5rem; float: right;"> 
					<i class="fa fa-edit"></i></a>
				</c:if>
			</div>
			<!-- 리뷰 출력 부분 contents/email -->
			<div class="user_name">${review.nickname}</div>
			<div id="reviewViewOne${review.r_num }">
				<c:forEach begin="1" end="${review.depth}" varStatus="i">
				</c:forEach>
				
				<pre class="reviewContentPre">${review.contents}</pre>
			</div>
			<!-- 리플달기 -->
			<div id="reviewReplyArea${review.r_num }" class="reviewReplyDiv" style="display: none;">
				<div>
					<textarea id="reviewReplyContents${review.r_num}" class="form-control" name="reviewContents" rows="3" cols="" placeholder="Your Review"></textarea>
				</div>
				<button id="reviewReplyWriteBtn${review.r_num}" onclick="reviewReplyWriteText(${review.r_num})" class="red_button review_submit_btn trans_300">write</button>
			</div>
			<!-- 리플달기 -->
			<!-- 리뷰 수정 작성 란 -->
			<div id="reviewTextUpdate${review.r_num}" style="display: none;">
				<textarea id="contentsUpdateData${review.r_num}"
					class="form-control" name="contents" rows="3" cols="">${review.contents}</textarea>
			</div>
		</div>
		</div>
	</c:forEach>
	<c:if test="${pager.curPage lt pager.totalPage }">
	<div style="float: right;" id="reviewMoreBtn">
	<button class="reviewMoreBtn" id="reviewClickBtn" onclick="more(); close()">more</button> </div>
	</c:if>
