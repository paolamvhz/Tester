<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %> 
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
<jsp:include page="includes/menu.jsp"></jsp:include>
	<h1>IT's ALIVE!!!!!!!!!!!!!!!!!!</h1>
	Categories Table


<div class="card-deck">
<c:forEach items="${categories }" var="cat">
  <div class="card">
    <img class="card-img-top" src="${urlPublic }/images/${cat.image}" alt="Card image cap">
    <div class="card-body">
      <h5 class="card-title">${cat.name }</h5>
      <p class="card-text">${cat.description }</p>
      <a href="category/${cat.categoryId }" class="btn btn-primary">Go somewhere</a>
    </div>
  </div>
 </c:forEach>
</div>	



</body>
</html>