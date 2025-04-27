# FeeSystem Project Overview

A full-stack fee management system built with **Spring Boot (Java 21, MongoDB)** and static **HTML/CSS** portals. It includes controllers, models, repositories, services, and three portal UIs.

## Folder Structure

roject-root/ ├─ pom.xml # Maven build file ├─ src/ │ └─ main/ │ ├─ java/com/feesystem/feesystem/ │ │ ├─ controller/ # REST controllers + HomeController.java │ │ │ ├─ AdminProfileController.java │ │ │ ├─ ClassroomController.java │ │ │ ├─ DiscountController.java │ │ │ ├─ FeeCategoryController.java │ │ │ ├─ FeeStructureController.java │ │ │ ├─ GuardianProfileController.java │ │ │ ├─ NotificationController.java │ │ │ ├─ PaymentController.java │ │ │ ├─ ReceiptController.java │ │ │ ├─ SchoolController.java │ │ │ ├─ StudentProfileController.java │ │ │ ├─ TransactionHistoryController.java │ │ │ ├─ UserController.java │ │ │ └─ HomeController.java # Maps friendly URLs to static pages │ │ ├─ model/ # MongoDB document classes │ │ ├─ repository/ # Spring Data MongoDB repositories │ │ ├─ service/ # Business logic services │ │ └─ FeesystemApplication.java # Main Spring Boot application │ └─ resources/ │ ├─ application.properties # DB URI, ports, etc. │ └─ static/ # Frontend portals │ ├─ index.html # Gateway page │ ├─ adminDashboard.html # Admin portal UI │ ├─ guardianDashboard.html # Guardian portal UI │ ├─ studentDashboard.html # Student portal UI │ └─ css/ │ └─ style.css # Shared SaaS-style CSS


## Requirements

- **Java 21** JDK installed  
- **Maven 3.8+**  
- **MongoDB** (running locally or remotely)  

## Setup & Run

1. **Configure MongoDB URI** in `src/main/resources/application.properties`:
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/feesystem
mvn clean spring-boot:run
