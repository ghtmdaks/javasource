<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
	<c:import url="../import/css/commonCss.jsp" />
	<c:import url="../import/css/indexCss.jsp" />
	<c:import url="../import/js/commonJs.jsp" />
	<c:import url="../import/js/indexJs.jsp" />
    <title>error</title>
</head>
<body>
	<c:import url="../common/header.jsp"/>
	<div style="height: 250px;"></div>
    <div style="text-align: center;">
	    <img alt="error" src="<%=request.getContextPath()%>/resources/images/error/errorImg.png" style="margin: 0 auto;" >
	    <h5 style="font-size: 1.55rem;">${errorMsg}</h5>
	    <a href="<%=request.getContextPath()%>/">Back Home</a>
    </div>
</body>
</html>