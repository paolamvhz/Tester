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
<h1>Manage Categories</h1>



<div class="container">
<spring:url value="/manageCat/save" var="urlForm"></spring:url>
<form action="${urlForm }" method="post">
  <div class="form-group">
    <label for="categoryName">Category Name</label>
    <input class="form-control" name="name" id="categoryName" aria-describedby="categoryHelp" placeholder="Enter Category Name">
    <small id="categoryHelp" class="form-text text-muted">*</small>
  </div>
  <div class="form-group">
    <label for="catDesc">Description</label>
    <input  class="form-control" name="description" id="catDesc" placeholder="Tell us about this new category">
  </div>

 <div class="form-group">
    <label for="image">Image</label>
    <input  class="form-control" name="image" id="image" placeholder="Write the name of the Image">
  </div>
  
  <div class="form-group form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> 
    <script src="${urlPublic}/bootstrap/js/bootstrap.min.js"></script> 
</body>
</html>