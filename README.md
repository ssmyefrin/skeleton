# Project Skeleton

This repository contains a full-stack start kit with a **Spring Boot** backend and **Vue.js** frontend.

## Structure

The project is divided into two main modules:

### 1. Backend (`/backend`)
A Spring Boot application structured with **Layered Architecture** and **DDD** principles.

- **Stack**: Spring Boot 3.4.1, Java 17+, Gradle (Groovy DSL)
- **Key Packages**:
    - `controller`: API Endpoints
    - `service`: Business Logic
    - `domain`: Entities & DTOs
    - `repository`: JPA Repositories
    - `common`: Shared utilities (e.g. `ApiResponse`)
    - `exception`: Global Error Handling
- **Setup**:
  ```bash
  cd backend
  ./gradlew bootRun
  ```

### 2. Frontend (`/frontend`)
A modern Web Application using Vue 3 and Tailwind CSS.

- **Stack**: Vue 3, Vite, Tailwind CSS v4
- **Design**: Premium/Modern styling configured via Tailwind.
- **Setup**:
  ```bash
  cd frontend
  npm install
  npm run dev
  ```

## Requirements
- Java 17 or higher
- Node.js 18 or higher

## API Documentation
The backend includes a sample health check endpoint:
- `GET /api/health` -> Returns `{"success": true, "message": "Backend is running", "data": "Backend is running"}`
