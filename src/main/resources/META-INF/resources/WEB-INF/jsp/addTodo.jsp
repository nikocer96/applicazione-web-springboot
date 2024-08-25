
<body>
	<%@ include file="common/navigation.jspf" %>
	<%@ include file="common/header.jspf" %>
	
	<div class="container">
		<h1>Add New Todo Page</h1>
		<form:form method="post" modelAttribute="todo">
			<fieldset>
				<form:label path="description">Description</form:label>
					<form:input type="text" path="description" required="required"/>
					<form:errors type="text" path="description" cssClass="text-warning" />
			</fieldset>
			
			<fieldset>
				<form:label path="targetDate">Target Date</form:label>
					<form:input type="date" path="targetDate" required="required"/>
					<form:errors type="text" path="targetDate" cssClass="text-warning" />
			</fieldset>
			
				<form:input type="hidden" path="id" />
			 	<form:input type="hidden" path="done" />
			<input class="btn btn-success" type="submit" />
		
		</form:form>
	</div>
	<%@ include file="common/footer.jspf" %>