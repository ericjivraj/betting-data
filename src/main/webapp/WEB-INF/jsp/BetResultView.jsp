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
    <div>
      <div align="center">
        <h1>Search Bet - Results</h1>
        <p>If the table below is empty it means there were no matches found according to your search criteria</p>
        <table>
          <tr>
            <th>ID</th>
            <th>Number of Bets</th>
            <th>Game</th>
            <th>Stake</th>
            <th>Returns</th>
            <th>Client ID</th>
            <th>Date</th>
          </tr>
          <c:forEach var="bet" items="${bets}">
                <tr>
                  <td>${bet.id}</td>
                  <td>${bet.numbets}</td>
                  <td>${bet.game}</td>
                  <td>${bet.stake}</td>
                  <td>${bet.returns}</td>
                  <td>${bet.clientid}</td>
                  <td>${bet.date}</td>
                </tr>
          </c:forEach>
        </table>
        <div class="buttons">
          <form action="/searchBets">
            <button type="submit">Go Back to Search Menu</button>
          </form>
        </div>
      </div>
    </div>
  </div>

</main>

<footer><p>Made by Eric Jivraj in 2020</p></footer>

<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"/>

</body>
</html>
