<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id ="main-content">
<h2>New Geek Post</h2>

	<c:url var="formAction" value="/forumPost" />
	<form method="POST" action="${formAction}">
		<div>
			<label for="username">Username:</label> 
			<input type="text" name="username" />
		</div>
		<div>
			<label for="subject">Subject:</label> 
			<input type="text" name="subject" />
		</div>		
		<div>
			<label for="message">Message:</label> 
			<input type="text" name="message" />
		</div>
		<input type="submit"
			value="Submit" />
	</form>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp"/>