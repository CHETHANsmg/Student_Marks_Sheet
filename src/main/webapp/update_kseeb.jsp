<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update data here</title>
</head>
<body class="b1">
	<form action="update" method="post">
		<center>
			<div class="col">
				<div>
					<h1>Karnataka Secondary Education Examinaton Board</h1>
				</div>
			</div>
			<div class="d1">
				<h2>Update Data</h2>
			</div>
			<table class="t1">
				<tr>
					<td>University Seat Number :</td>
					<td><input type="text" name="University_Seat_Number"
						value="<%=request.getParameter("usn")%>" readonly="readonly"></td>
				</tr>
				<tr>
					<td>Name :</td>
					<td><input type="text" name="name"
						value="<%=request.getParameter("name")%>"></td>
				</tr>
				<tr>
					<td>Date of Birth :</td>
					<td><input type="date" name="dob"
						value="<%=request.getParameter("dob")%>"></td>
				</tr>
				<tr>
					<td>Father Name :</td>
					<td><input type="text" name="f_name"
						value="<%=request.getParameter("f_name")%>"></td>
				</tr>
				<tr>
					<td>Mother Name :</td>
					<td><input type="text" name="m_name"
						value="<%=request.getParameter("m_name")%>"></td>
				</tr>
				<tr>
					<td>Kannada Internal Marks :</td>
					<td><input type="number" name="in_kannada"
						value="<%=request.getParameter("in_kannada")%>"></td>
					<td>Kannada External Marks:</td>
					<td><input type="number" name="ex_kannada"
						value="<%=request.getParameter("ex_kannada")%>"></td>
				</tr>
				<tr>
					<td>English Internal Marks :</td>
					<td><input type="number" name="in_english"
						value="<%=request.getParameter("in_english")%>"></td>
					<td>English External Marks:</td>
					<td><input type="number" name="ex_english"
						value="<%=request.getParameter("ex_english")%>"></td>
				</tr>
				<tr>
					<td>Hindi Internal Marks :</td>
					<td><input type="number" name="in_hindi"
						value="<%=request.getParameter("in_hindi")%>"></td>
					<td>Hindi External Marks:</td>
					<td><input type="number" name="ex_hindi"
						value="<%=request.getParameter("ex_hindi")%>"></td>
				</tr>
				<tr>
					<td>Maths Internal Marks :</td>
					<td><input type="number" name="in_maths"
						value="<%=request.getParameter("in_maths")%>"></td>
					<td>Maths External Marks:</td>
					<td><input type="number" name="ex_maths"
						value="<%=request.getParameter("ex_maths")%>"></td>
				</tr>
				<tr>
					<td>Science Internal Marks :</td>
					<td><input type="number" name="in_science"
						value="<%=request.getParameter("in_science")%>"></td>
					<td>Science External Marks:</td>
					<td><input type="number" name="ex_science"
						value="<%=request.getParameter("ex_science")%>"></td>
				</tr>
				<tr>
					<td>Social Science Internal Marks :</td>
					<td><input type="number" name="in_social_science"
						value="<%=request.getParameter("in_social_science")%>"></td>
					<td>Social Science External Marks:</td>
					<td><input type="number" name="ex_social_science"
						value="<%=request.getParameter("ex_social_science")%>"></td>
				</tr>
				<tr>
					<td><button type="submit">UPDATE</button></td>

				</tr>
			</table>
		</center>
	</form>

	<style>
* {
	margin: 0px;
	padding: 0px;
}

.b1 {
	background-color: rgb(246, 246, 246);
}

.t1 {
	background-color: white;
	border: 2px solid #316AC8;
	height: 500px;
	width: 50%;
	margin-top: 10px;
}

button {
	height: 30px;
	width: 70px;
	background-color: rgb(203, 202, 202);
	border-radius: 5px;
}

.col {
	height: 50px;
	color: white;
	background-color: rgb(228, 156, 46);
}

.d1 {
	margin-top: 20px;
	color: white;
	background-color: rgb(228, 156, 46);
	width: 50%;
}
</style>
</body>
</html>