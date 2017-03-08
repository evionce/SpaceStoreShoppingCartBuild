<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">
	<c:url value="img/${product.imageName}" var="a" />
	<div class="pimage">
		<img src="${a}">
	</div>
	<div>

		<h2>${product.name}</h2>
		${product.price}<br> 
		${product.description}<br>
		
			<c:url var="formAction" value="/productDetails" />
	<form method="POST" action="${formAction}">
		<div>
			<label for="amount">Quantity to buy:</label>
			<input type="text" name="amount" required/>
		</div>
		<input type="hidden" name="id" value="${product.id}" />
		<input type="submit" value="Add to Cart" />
	</form>
		</div>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />