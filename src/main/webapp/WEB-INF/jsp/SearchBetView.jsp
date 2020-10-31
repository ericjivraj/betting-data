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
      <h1>Search for Bets by Filter</h1>
      <p>Note: When searching for date in particular, please enter in the following format YYYY/MM/DD</p>
      <div class="buttons">
        <form action="/processSearch" method="GET">
          <label for="bet">Bet Information</label>
          <input type="text" name="bet" id="bet"/>
          <label for="option">Filter By:</label>
          <select name="option" id="option" id="option" class="form-control" required>
            <option selected>Game</option>
            <option>Client ID</option>
            <option>Date</option>
          </select>
          <button type="submit">Search</button>
        </form>
      </div>
      <div class="buttons">
        <form action="/" method="GET">
          <button type="submit">Go Back to Homepage</button>
        </form>
      </div>
    </div>
  </div>

</main>

<footer><p>Made by Eric Jivraj in 2020</p></footer>

<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"/>

</body>
</html>
