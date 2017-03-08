<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id ="main-content">
	<h2>Solar System Geek Gift Shop</h2>
	<c:forEach var="product" items="${products}">
		<c:url value="/productDetails" var ="aa">
		<c:param name="id">${product.id}</c:param>
		</c:url>
		<div class="product">
		<c:url value="img/${product.imageName}" var = "a"/>
		<div class = "pimage"><img src="${a}"></div>
		<div>
		<a href="${aa}">${product.name}</a>
		${product.price}
		</div>
		</div>
	</c:forEach>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />