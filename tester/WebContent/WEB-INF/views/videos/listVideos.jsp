<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %> 
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<spring:url value="/" var="urlRoot" />
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
<div class="container">
<h1>Administration Videos</h1>

<c:if  test="${msj!=null}">
<div class="alert alert-primary" role="alert">
  ${msj}
</div>
</c:if>

<a href="${urlRoot}videos/create" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">New Video</a>


<table class="table">
  <thead class="thead-light">
    <tr>
      <th scope="col">#</th>
      <th scope="col">DescName</th>
      <th scope="col">Products</th>
      <th scope="col">URL</th>
      <th scope="col">Youtuber</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach items="${videos }" var="video">
  <tr>
  <th scope="row">${video.videoId }</th>
      <td>${video.descName }</td>
      <td>${video.products }</td>
      <td>${video.url }</td>
      <td>${video.youtuber }</td>
      <tr>
  </c:forEach>
   
   
  </tbody>
</table>
${videos }
</div>

</body>
</html>