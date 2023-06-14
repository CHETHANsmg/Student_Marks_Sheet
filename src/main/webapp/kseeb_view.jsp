<%@page import="students_mark_sheet.dao.kseeb_dao"%>
<%@page import="students_mark_sheet.dto.kseeb_data_insert_dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Data</title>
</head>
<body class="b1">
	<%
	List<kseeb_data_insert_dto> l1 = (List<kseeb_data_insert_dto>) new kseeb_dao().kseebf1();
	%>
	<center>
		<div class="col">
			<div>
				<h1>Karnataka Secondary Education Examinaton Board</h1>
			</div>
		</div>
		<div class="d1">
			<h2>All Data</h2>
		</div>
		<table class="t1">
			<tr>
				<th>University_Seat_Number</th>
				<th>Name</th>
				<th>Date_of_Birth</th>
				<th>Father_Name</th>
				<th>Mother_Name</th>
				<th>Kannada</th>
				<th>English</th>
				<th>Hindi</th>
				<th>Maths</th>
				<th>Science</th>
				<th>Social_Science</th>
				<th>Total_Marks</th>
				<th>Percentage</th>
			</tr>

			<%
			for (kseeb_data_insert_dto k : l1) {
			%>
			<tr>
				<td><%=k.getUniversity_Seat_Number()%></td>
				<td><%=k.getName()%></td>
				<td><%=k.getDob()%></td>
				<td><%=k.getF_name()%></td>
				<td><%=k.getM_name()%></td>
				<td><%=k.getKannada()%></td>
				<td><%=k.getEnglish()%></td>
				<td><%=k.getHindi()%></td>
				<td><%=k.getMaths()%></td>
				<td><%=k.getScience()%></td>
				<td><%=k.getSocial_science()%></td>
				<td><%=k.getTotal_marks()%></td>
				<td><%=k.getPercentage()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</center>

	<style>
* {
	margin: 0px;
	padding: 0px;
}

.b1 {
	background-color: rgb(246, 246, 246); 
	}
.col 
{ 
	height : 50px;
	width: 100%;
	color: white;
	background-color: rgb(228, 156, 46);
}

.d1 {
	margin-top: 20px;
	color: white;
	background-color: rgb(228, 156, 46);
	width: 80%;
}

.t1, tr, th, td {
	border: 2px solid #316AC8;
	border-collapse: collapse;
	font-size: 18px;
	text-align: center;
	margin-left: 10px;
}

.t1 {
	width: 95%;
	height: 300px;
	margin-top: 10px;
	content: center;
}
</style>
</body>
</html>