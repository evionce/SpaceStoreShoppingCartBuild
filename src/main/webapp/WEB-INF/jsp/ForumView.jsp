<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.time.format.DateTimeFormatter"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">
	<h2>Solar System Geek Forum</h2>
	<c:url value="/forumPost" var="a" />

	<a href="${a}">Post A Message</a>

	<c:forEach var="post" items="${posts}">
		<div class="post">
			<h3>${post.subject}</h3>
			
			<%
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
				request.setAttribute("formatter", formatter);
			%>
			by ${post.username} on ${post.datePosted.format(formatter)}
			
			<p>${post.message}</p>
		</div>
	</c:forEach>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />