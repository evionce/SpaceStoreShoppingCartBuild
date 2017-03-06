<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id ="main-content">
	<c:url var = "imageLink" value="img/${param.Planet.toLowerCase()}.jpg" />
	<img src="${imageLink}"/>
	<div>
		If you are ${param.earthAge} years old on planet Earth, you are ${AgeOnPlanet} years old on ${param.Planet}.
	</div>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />