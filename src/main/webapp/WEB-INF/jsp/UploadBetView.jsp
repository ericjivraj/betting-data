<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
  <title>Betting Data Tool</title>

  <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css"/>

  <!--
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
  <link rel="stylesheet" type="text/css" href="stylesheet.css">

  <c:url value="/css/main.css" var="jstlCss"/>
  <link href="${jstlCss}" rel="stylesheet"/>
</head>

<body>

<header>
  <h1>Search for Bets</h1>
  <p>Search for betting data by providing one of the filtering information</p>
</header>

<main class="branch">

  <div>
    <div class="details">
      <h1>Upload Betting Data</h1>
      <div class="buttons">
        <form action="/bets" method="POST" enctype="multipart/form-data">
          <label for="betData">Upload File:</label>
            <input type="file" id="betData" name="betData" accept=".json,application/json" required>
          <button type="submit">Upload</button>
        </form>
      </div>
      <div class="buttons">
        <form action="/" method="GET">
          <button type="submit">Go Back to Homepage</button>
        </form>
      </div>
    </div>
    <br><br>
    <p><b>Important Note:</b> When uploading your json file, please do not include an "id" field, the application and database will handle adding the right id to the data</p>
  </div>

</main>

<footer><p>Made by Eric Jivraj in 2020</p></footer>

<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"/>

</body>
</html>