# J2EE-Exercises
# 🌐 Multi-Tier & Microservice Applications (J2EE/Jakarta EE & Spring Boot)

A comprehensive collection of enterprise application architectures, including traditional **Three-Tier (Multi-Tier)** and modern **Microservices**, built with **J2EE/Jakarta EE** and **Spring Boot**.

## 📚 Tech Stack

### Traditional Enterprise (J2EE/Jakarta EE)
- **Framework**: Jakarta EE (formerly J2EE)
- **Server**: Apache Tomcat
- **Key Technologies**:
  - **Servlets**: Web request handling
  - **JSP (JavaServer Pages)**: Dynamic UI generation
  - **JDBC**: Database connectivity
  - **JMS**: Message queuing
  - **EJB**: Enterprise Beans (Session & Message-Driven)
  - **JPA**: Object-Relational Mapping (EclipseLink/Hibernate)
  - **Web Services**: RESTful (JAX-RS) and SOAP (JAX-WS)

### Modern Microservices (Spring Boot)
- **Framework**: Spring Boot
- **Key Technologies**:
  - **Spring MVC**: REST APIs
  - **Spring Data JPA**: Database access
  - **Spring Cloud**: Cloud native features
  - **Spring Security**: Authentication & Authorization
  - **Spring Cloud Gateway**: API Gateway
  - **Docker**: Containerization
  - **Kubernetes**: Orchestration

## 📂 Project Structure

The repository contains two main branches of projects:

### 1. 🏗️ Traditional Multi-Tier Applications
Classic enterprise applications demonstrating server-side architectures.

- **Ecommerce**:
  - Multi-tier web application with:
    - Shopping Cart
    - Order Management
    - Payment Processing
    - User Authentication

- **Student Registration**:
  - Core academic system with:
    - Course Enrollment
    - Grade Management
    - Student Information System
    - Faculty Portals

### 2. 🚀 Microservices Architecture
Modern distributed systems with independent services.

- **Full Microservices E-Commerce Platform**:
  - **API Gateway**: Central entry point
  - **Product Catalog Service**: Product management
  - **Order Service**: Order processing and user data

## 🏁 Getting Started

### 📦 Prerequisites
- Java Development Kit (JDK) 8 or higher
- Apache Maven (for traditional apps)
- Docker (for microservices)
- Database (MySQL, PostgreSQL, or H2 for local)

### 🛠️ Build & Run

#### Traditional Applications
1. Navigate to the project directory:
   ```bash
   cd traditional/ecommerce
   ```

2. Build with Maven:
   ```bash
   mvn clean install
   ```

3. Run on Tomcat:
   ```bash
   # Deploy the WAR file to your Tomcat server
   ```

#### Microservices Applications
1. Build the project:
   ```bash
   cd microservices
   mvn clean package
   ```

2. Run the services:
   ```bash
   java -jar microservice/api-gateway/target/*.jar
   java -jar microservice/art-catalog-service/target/*.jar
   java -jar microservice/order-service/target/*.jar
   ```

## 📂 Project Structure Details

```
J2EE-Exercises/
├── traditional/
│   ├── ecommerce/        # Full 3-tier E-Commerce System
│   └── student-registration/ # Student Registration System
└── microservices/
    └── pom.xml             # Parent POM for microservices
    └── api-gateway/        # API Gateway
    ├── art-catalog-service/ # Product Catalog
    └── order-service/      # Order Management & Users
```

## 📚 Key Features

### 🎯 Traditional Architecture Benefits
- ✅ Simplified development model
- ✅ Strong transaction management
- ✅ Mature technology stack
- ✅ Enterprise-grade security

### 🎯 Microservices Architecture Benefits
- ✅ Independent deployment
- ✅ Technology diversity
- ✅ Scalability
- ✅ Fault isolation
- ✅ Faster development cycles

## 🤝 Contributing

Contributions are welcome! Feel free to fork the repository, create a feature branch, and submit a pull request.

## 📄 License

This project is open-source and available under the MIT License.

---

**Need help getting started? Check out the specific README files in each project directory for detailed instructions!**
