<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %> 
<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tester</title>
	<spring:url value="/resources" var="urlPublic"></spring:url>
	<spring:url value="/" var="urlRoot"></spring:url>
    <link href="${urlPublic}/bootstrap/css/bootstrap.css" rel="stylesheet">

</head>
<body>
<jsp:include page="../includes/menu.jsp"></jsp:include>
<h1>Video Detail</h1>


<!--  
-->
the video is 
${video.videoId}

${video.descName }

${video.url }

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> 
    <script src="${urlPublic}/bootstrap/js/bootstrap.min.js"></script> 
</body>
</html>