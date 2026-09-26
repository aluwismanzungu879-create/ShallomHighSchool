# Shallom High School Management System

A browser-based Java web application for the day-to-day academic and administrative work of Shallom High School. The project uses Java Servlets and JSP on Apache Tomcat, with serialized Java objects for local persistent storage.

> **Knowledge · Discipline · Excellence**

## Features

- Session login and role-aware navigation for students, teachers, ancillary staff, deputy headmaster, and headmaster.
- Student pages for subjects, sports, fees, receipts, results, payment history, class teachers, and timetable.
- Teacher mark entry with server-side validation and saved results.
- Ancillary issue reporting and duty information.
- Administrative school summaries, fee records, results, staff information, and reports.
- School fees payments with reference numbers, serialized history, and printable receipts.
- Java serialization persistence outside the public web folder, initialized demo accounts, and a lifecycle-managed report thread.
- Responsive green and gold interface.

## Technologies and architecture

Java 8, Maven WAR, Servlet API 4, JSP, HTML5, CSS, JavaScript, Apache Tomcat 9, and Java object serialization. The application follows an MVC-style structure: models in `model`, controllers in `servlet`, JSP views under `WEB-INF/views`, business rules in `service`, persistence in `repository`, access control in `filter`, and application lifecycle setup in `listener`.

## Roles and demo credentials

| Role | Username | Password |
| --- | --- | --- |
| Student | `student1` | `pass123` |
| Student | `student2` | `pass123` |
| Teacher | `teacher1` | `teach123` |
| Teacher | `teacher2` | `teach123` |
| Ancillary Staff | `ancil1` | `ancil123` |
| Ancillary Staff | `ancil2` | `ancil123` |
| Deputy Headmaster | `deputy` | `dep123` |
| Headmaster | `headmaster` | `head123` |

Demo passwords are plain text for this academic assignment. Do not use these authentication practices in a production system.

## Prerequisites and running

- JDK 8 or newer
- Maven 3.6 or newer
- Apache Tomcat 9 (Servlet 4 / `javax.servlet`)

Build from the project directory:

```sh
mvn clean package
```

This creates `target/ShallomHighSchool.war`. Copy it to Tomcat's `webapps` directory and start Tomcat. On Windows, for example:

```powershell
Copy-Item target\ShallomHighSchool.war C:\path\to\apache-tomcat-9\webapps\
C:\path\to\apache-tomcat-9\bin\startup.bat
```

Open **http://localhost:8080/ShallomHighSchool/**. The application creates its data directory at `${catalina.base}/ShallomHighSchool-data` by default. Set the Java system property `-Dshallom.data=C:\path\to\data` to choose another directory. The `.dat` files and generated payment report remain outside the deployed web application.

## Project structure

```text
pom.xml
src/main/java/zw/shallom/{model,servlet,service,repository,exception,filter,listener}/
src/main/webapp/index.jsp
src/main/webapp/WEB-INF/{web.xml,views}/
src/main/webapp/assets/{style.css,app.js}
```

## Screenshots

Add captures from a running deployment here, for example `screenshots/login.png`, `screenshots/student-dashboard.png`, and `screenshots/headmaster-dashboard.png`.

## Java concepts demonstrated

Encapsulation and model objects, enums, arrays and 2D arrays, collections and generics, streams, lambdas and method references, checked custom exceptions, try-with-resources, serialization, synchronized file access, background threading, and MVC separation.

## Troubleshooting

- Confirm Tomcat 9 is running and deploy the WAR under the `ShallomHighSchool` name.
- Check Tomcat logs if JSP compilation or deployment fails.
- Use JDK 8+ and Maven 3.6+; Maven needs access to download dependencies on the first build.
- Confirm the Tomcat process can write to the configured data directory.
- This uses the `javax.servlet` namespace and targets Tomcat 9. Tomcat 10 requires Jakarta namespace migration.

## Future improvements

Production password hashing and account administration, fuller attendance and timetable workflows, exportable reports, and a relational database when the assignment permits one.

## Author

**Aluwis Manzungu**  
Student Number: C03261115  
Course: Computer Programming  
Institution: Reformed Church University  
Email: aluwismanzungu879@gmail.com  
Lecturer: MR Fanyana  
Year: 2026
