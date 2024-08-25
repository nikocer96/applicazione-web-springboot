<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link
	href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<title>List Todos Page</title>
<!-- <script src="https://cdn.tailwindcss.com"></script> -->
</head>
<body>
	<div class="container">
		<h1 class="text-purple-500 text-3xl">Welcome ${name}</h1>
	<div>
		<p>Your todos are:</p>
	</div>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>id</th>
				<th>Description</th>
				<th>Target Date</th>
				<th>Is Done?</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
					<td><a href="todo-delete?id=${todo.id}" class="btn btn-warning">DELETE ${todo.id}</a></td>

				</tr>

			</c:forEach>

		</tbody>

	</table>
	<a class="btn btn-success" href="add-todo">Add Todo</a>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>