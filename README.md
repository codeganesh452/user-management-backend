# 💚 Backend README (Spring Boot + PostgreSQL)

## 📌 User Management Backend (Spring Boot)

![Stars](https://img.shields.io/github/stars/codeganesh452/user-management-backend?style=for-the-badge)
![Forks](https://img.shields.io/github/forks/codeganesh452/user-management-backend?style=for-the-badge)
![Issues](https://img.shields.io/github/issues/codeganesh452/user-management-backend?style=for-the-badge)
![License](https://img.shields.io/github/license/codeganesh452/user-management-backend?style=for-the-badge)
![Last Commit](https://img.shields.io/github/last-commit/codeganesh452/user-management-backend?style=for-the-badge)

A robust **Spring Boot REST API** providing full CRUD functionality for user management. Integrated with **PostgreSQL** and structured using Spring Data JPA.

---

## 🚀 Features

* Create user
* View all users
* View by ID
* Update user
* Delete user
* Exception handling
* CORS support
* PostgreSQL integration

---

## 🛠️ Tech Stack

```
Java 17
Spring Boot
Spring Web
Spring Data JPA
PostgreSQL
Maven
```

---

## 📦 Installation

### 1️⃣ Clone the repo

```bash
git clone https://github.com/codeganesh452/user-management-backend.git
cd user-management-backend
```

### 2️⃣ Setup PostgreSQL

```sql
CREATE DATABASE usermanagementsystem;
```

### 3️⃣ Configure application.properties

```
spring.datasource.url=jdbc:postgresql://localhost:5432/usermanagementsystem
spring.datasource.username=postgres
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4️⃣ Run the application

```bash
mvn spring-boot:run
```

Backend runs on:

```
http://localhost:8080
```

---

## 🔗 API Endpoints

| Method | Endpoint      | Description      |
| ------ | ------------- | ---------------- |
| POST   | `/createuser` | Add new user     |
| GET    | `/viewall`    | Fetch all users  |
| GET    | `/view/{id}`  | Fetch user by ID |
| PUT    | `/user/{id}`  | Update user      |
| DELETE | `/user/{id}`  | Delete user      |

---

## 📁 Project Structure

```
src/
│── controller/
│── model/
│── repository/
│── exception/
│── UserManagementSystemApplication.java
```

---

## 🚀 Future Enhancements

* JWT authentication
* Role-based access
* Swagger API documentation
* Search + pagination

---

## 📜 License

MIT License

---

You can copy the respective section into each repo's README.md file.
