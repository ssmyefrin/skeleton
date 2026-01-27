# 프로젝트 스켈레톤 (Project Skeleton)

이 저장소는 **Spring Boot** 백엔드와 **Vue.js** 프론트엔드로 구성된 풀스택 스타터 키트입니다.

## 구조 (Structure)

프로젝트는 두 개의 주요 모듈로 나뉩니다:

### 1. 백엔드 (`/backend`)
**계층형 아키텍처(Layered Architecture)**와 **DDD** 원칙에 따라 구성된 Spring Boot 애플리케이션입니다.

- **기술 스택**: Spring Boot 3.4.1, Java 17+, Gradle (Groovy DSL)
- **주요 패키지**:
    - `controller`: API 엔드포인트
    - `service`: 비즈니스 로직
    - `domain`: 엔티티 & DTO
    - `repository`: JPA 리포지토리
    - `common`: 공통 유틸리티 (예: `ApiResponse`)
    - `exception`: 전역 예외 처리
- **실행 방법**:
  ```bash
  cd backend
  ./gradlew bootRun
  ```

### 2. 프론트엔드 (`/frontend`)
Vue 3와 Tailwind CSS를 사용하는 모던 웹 애플리케이션입니다.

- **기술 스택**: Vue 3, Vite, Tailwind CSS v4
- **디자인**: Tailwind를 사용한 프리미엄/모던 스타일링 설정 완료.
- **실행 방법**:
  ```bash
  cd frontend
  npm install
  npm run dev
  ```

## 요구 사항 (Requirements)
- Java 17 이상
- Node.js 18 이상

## API 문서 (API Documentation)
백엔드에는 샘플 헬스 체크 엔드포인트가 포함되어 있습니다:
- `GET /api/health` -> 반환값: `{"success": true, "message": "Backend is running", "data": "Backend is running"}`
