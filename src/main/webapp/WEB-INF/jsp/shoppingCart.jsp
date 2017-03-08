<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.techelevator.ssg.model.store.DollarAmount"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">
	<h2>Solar System Geek Gift Shop</h2>
	<table>
		<tr>
			<th></th>
			<th>Name</th>
			<th>Price</th>

			<th>Qty.</th>

			<th>Total</th>
		</tr>
		<c:set var="total" value ="${DollarAmount.ZERO_DOLLARS}"/>
		<c:forEach var="entry" items="${cartItems}">
			<tr>
			
			<c:url value="img/${entry.key.imageName}" var="a" />
			<td>
				<img src="${a}">
			</td>
			<td>
			${entry.key.name}
			</td>
			<td>
			${entry.key.price}
			</td>
			<td>
			${entry.value}
			</td>
			<td>
			<c:set var="totalForProduct" value="${entry.key.price.multiply(entry.value)}" />
			${totalForProduct}
			<c:set var="total" value ="${total.plus(totalForProduct)}"/>
			</tr>
		
	</c:forEach>
	
	</table>
	Grand Total: ${total}

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />