# Student Management REST API

A RESTful backend application built using **Spring Boot** and **MySQL** that provides CRUD operations for managing student data.  
The project follows **Spring Web MVC architecture** with clean separation of concerns.

---

## 🚀 Features
- RESTful APIs following MVC architecture
- CRUD operations (Create, Read, Update, Delete, Partial Update)
- DTO-based request and response handling
- Input validation using Bean Validation
- MySQL database integration using Spring Data JPA
- Global exception handling
- API testing using Postman

---

## 🛠 Tech Stack
- Java
- Spring Boot
- Spring Web
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- Lombok
- ModelMapper
- Postman

---

## 📁 Project Structure
controller/
service/
repository/
dto/
entity/


---

## 🔗 API Endpoints

| HTTP Method | Endpoint | Description |
|-----------|----------|-------------|
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| POST | `/students` | Create a new student |
| PUT | `/students/{id}` | Update student completely |
| PATCH | `/students/{id}` | Update student partially |
| DELETE | `/students/{id}` | Delete student |

---

## ⚙️ Database Configuration

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true


```
## ▶️ How to Run the Application

Clone the repository

Create a MySQL database named studentdb

Update database credentials in application.properties

Run the Spring Boot application


## 🧪 API Testing

All APIs have been tested using Postman with proper HTTP status codes.

📌 Future Enhancements

JWT-based authentication & authorization

Pagination and sorting

Swagger / OpenAPI documentation

Unit testing using JUnit & Mockito

Deployment to cloud platforms

# 👨‍💻 Author

## Shudhanshu Maheshwari
### Aspiring Backend Developer | Java | Spring Boot
