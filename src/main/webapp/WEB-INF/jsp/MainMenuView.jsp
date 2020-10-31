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
  <h1>Betting Data Tool</h1>
  <p>This tool allows you to upload betting data and also search for betting data by providing one of the filtering information</p>
</header>

<main class="branch">

  <div>
    <div class="details">
      <h1>Upload Betting Data</h1>
      <div class="buttons">
        <form action="/uploadBets" method="GET">
          <button type="submit">Upload Bets</button>
        </form><br>
        <p>${message}</p>
      </div>
    </div>
  </div>

  <div>
    <div class="details">
      <h1>Search for Betting Data</h1>
      <div class="buttons">
        <form action="/searchBets" method="GET">
          <button type="submit">Search Bets</button>
        </form>
        <br>
      </div>
    </div>
  </div>

</main>

<footer><p>Made by Eric Jivraj in 2020<p></footer>

<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"/>

</body>
</html>
