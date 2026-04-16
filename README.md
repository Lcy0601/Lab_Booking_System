# Lab Booking System

## 1. Project Introduction

This system is designed to address common issues in university laboratory management, including uneven resource allocation, cumbersome reservation procedures, delayed equipment maintenance, and the absence of a credit evaluation mechanism. By integrating a web-based backend management console with a Uniapp WeChat Mini Program, the system provides end-to-end lifecycle management—from laboratory resource publishing and student online reservations to teacher/administrator approval, on-site check-in/out via QR code, and credit evaluation.

**Current Version:** Iteration 1 (Core functionality and closed-loop processes)

---

## 2. Technology Stack

The system adopts a front-end and back-end separation architecture to ensure high performance and scalability.

- **Backend:** Spring Boot 2.x, Spring Security (RBAC access control), MyBatis Plus, MySQL 8.0  
- **Admin Frontend:** Vue.js 3, Element Plus, ECharts (reserved for data visualization)  
- **Mobile Client:** Uniapp (WeChat Mini Program), WeChat Native APIs (QR code scanning, location verification)  
- **Middleware:** Redis (reservation conflict caching), JWT (unified authentication)

---

## 3. Team Member Responsibilities (Iteration 1)

| Member         | Module                                   | Key Deliverables                                                                 |
|----------------|------------------------------------------|----------------------------------------------------------------------------------|
| **Huo Zhengli**   | Open Reservation Management              | Reservation request workflow, backend approval workflow, time-slot/station conflict detection algorithm |
| **Xu Xueqing**    | Laboratory and Equipment Resource Module | Laboratory basic information CRUD, equipment status lifecycle management (damaged/maintenance), data isolation filtering |
| **Han Xinyue**    | WeChat Mini Program and Credit Evaluation | Uniapp mobile development, QR code check-in interaction, safety hazard reporting, credit evaluation display |
| **Li Chenyao**    | Permission Architecture and Security Audit | RBAC permission model, JWT authentication for all roles, user account management, system-wide operation audit logs |

---

## 4. Environment Requirements

- **Java:** JDK 1.8 or higher  
- **Database:** MySQL 5.7 / 8.0  
- **Cache:** Redis 5.0 or higher  
- **Build Tool:** Maven 3.6 or higher  
- **Development Tools:** IntelliJ IDEA / VS Code / HBuilderX (for Mini Program)

---

## 5. Deployment Steps

### 5.1 Backend Deployment
1. Clone the repository and import it into your IDE.  
2. Execute the database initialization scripts located in `src/main/resources/sql`.  
3. Modify the database and Redis connection settings in `application-dev.yml`.  
4. Run the `LabManagerApplication` main class to start the service (default port: 8080).

### 5.2 Admin Frontend Deployment
1. Navigate to the `lab-admin-web` directory.  
2. Run `npm install` to install dependencies.  
3. Run `npm run dev` to start the development environment.

### 5.3 Mini Program Deployment
1. Open the `lab-miniprogram` directory with HBuilderX.  
2. Click **Run** → **Run to Mini Program Simulator** → **WeChat Developer Tools**.  
3. In WeChat Developer Tools, enable the **"Do not verify valid domain names"** option.

---

## 6. Core Features (Corresponding to A2 Demonstration Video)

- **Unified Login for All Roles:** Students, teachers, and administrators access the system through a single portal.  
- **Complete Reservation Workflow:** Mobile request → automatic conflict detection → backend manual approval → real-time status update.  
- **Equipment Damage Reporting:** Damage reports can be submitted from either the mobile client or backend and are linked to specific laboratories.  
- **Security Auditing:** All sensitive operations (e.g., approving reservations, deleting equipment) are logged to ensure traceability.
