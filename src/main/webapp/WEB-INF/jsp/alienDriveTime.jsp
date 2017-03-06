<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">
	<h2>Alien Travel Calculator</h2>
	<c:url var="formAction" value="/alienDriveTimeResult" />
	<form method="GET" action="${formAction}">
		<div>
			<label for="Planet">Choose A Planet:</label>
			<select name="Planet">
				<option value="Mercury">Mercury</option>
				<option value="Venus">Venus</option>
				<option value="Mars">Mars</option>
				<option value="Jupiter">Jupiter</option>
				<option value="Saturn">Saturn</option>
				<option value="Uranus">Uranus</option>
				<option value="Neptune">Neptune</option>
			</select>
		</div>
		<div>
			<label for="Transportation">Choose Transportation:</label>
			<select name="Transportation">
				<option value="Walking">Walking</option>
				<option value="Car">Car</option>
				<option value="Bullet Train">Bullet Train</option>
				<option value="Boeing 747">Boeing 747</option>
				<option value="Concorde">Concorde</option>
			</select>
		</div>
		<div>
			<label for="earthAge">Enter Your Earth Age:</label> 
			<input type="text" name="earthAge"/>
		</div>
		<input type="submit" value="Calculate Travel Time" />
	</form>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
