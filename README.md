# Student_Marks_Sheet

A website that displays 10th-grade results, featuring secure logins for students and authorities. Leveraging CRUD operations, authorities can manage student marks,
while students can access their individual results by entering a unique seat number and date of birth.


## Installation
- Java (JDK 1.8).
- Apache Tomcat server.
- Eclipse (IDE).
- My SQL workbench.

Instructions on how to install and run the project:

1. Clone the repository: `git clone https://github.com/CHETHANsmg/Student_Marks_Sheet.git`
2. Install dependencies: `mysql, Hibernate, servlets`

## Usage

Instructions on how to use the project:

1. Run the application: `start the tomcat server`
2. Open your browser and navigate to `http://localhost:8080/homepage.html`

## Contributing

If you'd like to contribute to the project, please follow these steps:\
Persistence file:

<?xml version="1.0" encoding="UTF-8"?>\
<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence"\
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"\
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence\
  http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd"\
	version="2.1">

	<persistence-unit name="dev">/
		<provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>/
		<shared-cache-mode>ENABLE_SELECTIVE</shared-cache-mode> /     <!-- for caching -->  
		<properties>/
			<property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver" />/
			<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/data base name"/>/
			<property name="javax.persistence.jdbc.user" value="root" />/
			<property name="javax.persistence.jdbc.password" value="root" />/
			<property name="hibernate.show_sql" value="true" />/
			<property name="hibernate.hbm2ddl.auto" value="update" />/
			<property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect"/>/
		</properties>/
	</persistence-unit>/
</persistence>
