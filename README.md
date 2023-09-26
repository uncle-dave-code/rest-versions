# Managing API Versioning in Spring Boot REST APIs
(uncledavecode)
## Introduction

In Spring Boot, there are several ways to manage API versioning.
The choice of versioning strategy depends on your project's requirements and conventions.
Below are four common approaches for versioning REST APIs.

## Versioning Types

### 1. Versioning using URI Path

This approach involves including the API version in the URL path.

### 2. Versioning using Request Parameter

This approach involves including the API version as a request parameter.

### 3. Versioning using Custom Request Header

This approach involves including the API version as a custom request header.

### 4. Versioning using Media Type

This approach involves including the API version as a media type.

## API Design top eleven best practices

### 1. Use plural Nouns but no Verbs:
- Use nouns instead of verbs for resources in the endpoint paths. Don't use verbs in path. Use HTTP methods instead of verbs for resources in the endpoint paths.
- Example: /api/users instead of /api/getUsers

### 2. Keep it simple and intuitive:
- Keep it simple and intuitive. Don't make it complex. Don't make it difficult to understand.
- Example: /api/users instead of /api/getAllActiveUsersOfCompany

### 3. Avoid CRUD names:
- Avoid CRUD names in the endpoint paths. Don't use CRUD names in the endpoint paths.
- Example: /api/users instead of /api/getAllUsers
- Example: /api/users/{id} instead of /api/deleteUser/{id}

### 4. Use standard HTTP methods:
- Use standard HTTP methods.
- Example: GET, POST, PUT, DELETE

### 5. Use slash separator for hierarchical data:
- Use slash separator for hierarchical data.
- Example: /api/users/{id}/accounts/{id}

### 6. Use query component to filter result:
- Use query component to filter result.
- Example: /api/users?status=active

### 7. Use hyphen separator for long name:
- Use hyphen separator for long name.
- Example: /api/users/{id}/accounts/{id}/account-summary

### 8. Avoid underscores:
- Avoid underscores.
- Example: /api/users/{id}/accounts/{id}/account-summary instead of /api/users/{id}/accounts/{id}/account_summary

### 9. Version your API:
- Version your API.
- See the section "Versioning types on this page".

### 10. Use HTTP status codes:
- Use HTTP status codes.
- Example: 200, 201, 400, 401, 403, 404, 500
- See the section "HTTP status codes on this page".

### 11. Document your API:
- Document your API.
- Example: Swagger, OpenAPI, Postman, etc.


## HTTP status codes
#### 1. 200 OK
#### 2. 201 Created
#### 3. 400 Bad Request
#### 4. 401 Unauthorized
#### 5. 403 Forbidden
#### 6. 404 Not Found
#### 7. 500 Internal Server Error