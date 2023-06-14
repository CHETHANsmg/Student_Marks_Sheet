<%@page import="students_mark_sheet.dto.kseeb_data_insert_dto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SSLC Mark Sheet</title>
</head>
<body class="b1">
	<%
	kseeb_data_insert_dto dto = (kseeb_data_insert_dto) request.getAttribute("dto");
	%>
	<center>
		<div class="d1">
			<div>
				<h1>Karnataka Secondary Education Examination Board</h1>
				<h4 id="h4">SSLC Examination Results</h4>
			</div>
		</div>
	</center>

	<div>
		<table class="t1">
			<tr class="tr1">
				<td class="td4">Name</td>
				<td class="td1"><%=dto.getName()%></td>
			</tr>
			<tr class="tr1">
				<td class="td4">Reg No.</td>
				<td class="td1"><%=dto.getUniversity_Seat_Number()%></td>
			</tr>
		</table>
	</div>

	<nav>
		<div class="div1">
			<table class="t2">
				<caption id="ca1">Part A</caption>
				<tr>
					<th>Subject</th>
					<th>Internal Marks</th>
					<th>External Marks</th>
					<th>Total Marks</th>
				</tr>
				<tr>
					<td id="id1">KANNADA</td>
					<td><%=dto.getIn_kannada()%></td>
					<td><%=dto.getEx_kannada()%></td>
					<td><%=dto.getKannada()%></td>
				</tr>
				<tr>
					<td id="id1">ENGLISH</td>
					<td><%=dto.getIn_english()%></td>
					<td><%=dto.getEx_english()%></td>
					<td><%=dto.getEnglish()%></td>
				</tr>
				<tr>
					<td id="id1">HINDI</td>
					<td><%=dto.getIn_hindi()%></td>
					<td><%=dto.getEx_hindi()%></td>
					<td><%=dto.getHindi()%></td>
				</tr>
				<tr>
					<td id="id1">MATHS</td>
					<td><%=dto.getIn_maths()%></td>
					<td><%=dto.getEx_maths()%></td>
					<td><%=dto.getMaths()%></td>
				</tr>
				<tr>
					<td id="id1">SCIENCE</td>
					<td><%=dto.getIn_science()%></td>
					<td><%=dto.getEx_science()%></td>
					<td><%=dto.getScience()%></td>
				</tr>
				<tr>
					<td id="id1">SOCIAL SCIENCE</td>
					<td><%=dto.getIn_social_science()%></td>
					<td><%=dto.getEx_social_science()%></td>
					<td><%=dto.getSocial_science()%></td>
				</tr>
				<tr>
					<th id="id1">Total Marks</th>
					<th class="td2" colspan="3"><%=dto.getTotal_marks()%></th>
				</tr>
			</table>

			<table class="t3">
				<caption id="ca1">Part B</caption>
				<tr>
					<th>Subject</th>
					<th>Grade</th>
				</tr>
				<tr>
					<td>Physical and health</td>
					<td>A</td>
				</tr>
				<tr>
					<td>Attitude and Values</td>
					<td>A</td>
				</tr>
				<tr>
					<td>Work Experience</td>
					<td>A</td>
				</tr>
				<tr>
					<td>Art Education</td>
					<td>A</td>
				</tr>
			</table>
		</div>
	</nav>



	<div>
		<table class="t1">
			<tr class="tr1">
				<td class="td3">Result</td>
				<td>Pass</td>
			</tr>
			<tr class="tr1">
				<td class="td3">Percentage</td>
				<td><%=dto.getPercentage()%></td>
		</table>
	</div>



	<style>
* {
	margin: 0px;
	padding: 0px;
}

.b1 {
	background-color: white;
}

.d1 {
	background-color: rgb(228, 156, 46);
	color: white;
	width: 100%;
}

#h4 {
	margin-top: 20px;
}

.t1, .tr1 {
	border: 4px solid white;
	border-collapse: collapse;
}

.td3 {
	text-align: left;
	border: 1px solid white;
}

#id1 {
	text-align: left;
}

.t1 {
	margin-left: auto;
	margin-right: auto;
	font-size: 20px;
	margin-top: 25px;
	background-color: #5CB85C;
	height: 30px;
	width: 85%
}

.t2, #tr2, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
}

#ca1 {
	background-color: #316AC8;
	color: white;
}

.t2 {
	margin-left: 120px;
	margin-right: auto;
	margin-top: 10px;
	height: 300px;
	content: center;
	width: 55%;
}

.td2 {
	text-align: right;
}

.td4 {
	text-align: left;
	border: 1px solid #5CB85C;
}

.div1 {
	display: flex;
	align-items: center;
	justify-content: space-around;
}

.t3 {
	margin-left: auto;
	margin-right: 120px;
	margin-top: 10px;
	height: 200px;
	content: center;
	width: 22%;
}

.t3, tr, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
}
</style>

</body>
</html>