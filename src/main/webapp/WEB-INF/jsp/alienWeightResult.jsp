<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id ="main-content">
<c:url var = "imageLink" value="img/${param.Planet.toLowerCase()}.jpg"/>
<img src="${imageLink}"/>
<div> If you are ${param.earthWeight} lbs. on planet Earth, you would weigh ${WeightOnPlanet} lbs. on ${param.Planet}.
</div>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />