<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id ="main-content">
	<c:url var = "imageLink" value="img/${param.Planet.toLowerCase()}.jpg"/>
	<img src="${imageLink}"/>
	<div>
		Traveling by ${param.Transportation} you will reach ${param.Planet} in ${driveTime} years. you will be ${driveTime + param.earthAge} years old.
	</div>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
