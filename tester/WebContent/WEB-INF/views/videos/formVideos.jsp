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
<h1>Manage Videos</h1>



<div class="container">
<spring:url value="/videos/save" var="urlForm"></spring:url>
<form:form action="${urlForm }" method="post" modelAttribute="video">
 <div class="form-group">
    <label for="descName">Description Name</label>
    <form:input class="form-control" name="descName" path="descName" id="descName" aria-describedby="categoryHelp" placeholder="Enter a descriptive name of the video "></form:input>
    <small id="categoryHelp" class="form-text text-muted">*</small>
  </div>
  <div class="form-group">
    <label for="url">URL</label>
    <form:input class="form-control" path="url" id="url" aria-describedby="categoryHelp" placeholder="Enter the URL "></form:input>
    <small id="categoryHelp" class="form-text text-muted">*</small>
  </div>
  <div class="form-group">
    <label for="products">Products</label>
    <form:select  class="form-control" path="products" id="products" placeholder="Enter the products separated by comas">
    <form:option value="shampoo">Shampoo</form:option>
    <form:option value="eyeCream">Eye cream</form:option>
    <form:option value="cream">Cream</form:option>
    <form:option value="faceMask">Face Mask</form:option>
    </form:select>
    
  </div>

 <div class="form-group">
    <label for="youtuber">YouTuber</label>
    <form:input  class="form-control" path="youtuber" id="youtuber" placeholder="Let us now the YouTuber"></form:input>
  </div>
  

  <button type="submit" class="btn btn-primary">Submit</button>
</form:form>
</div>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> 
    <script src="${urlPublic}/bootstrap/js/bootstrap.min.js"></script> 
</body>
</html>