
<body>
	<%@ include file="common/navigation.jspf" %>
	<%@ include file="common/header.jspf" %>
	<div class="container">
		<h1 class="text-red-500 text-4xl">Welcome ${name}</h1>
		<div>
			<p>Your name: ${name} and password: ${password}</p>

		</div>

		<div>
			<a href="list-todos">List todos</a>
		</div>
	</div>
	<%@ include file="common/footer.jspf" %>
