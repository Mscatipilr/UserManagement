# User Management Application

This is a Spring Boot-based user management system that implements user registration, authentication using JWT, role-based access control, and validation. The application also uses Spring Data JPA for database interactions and Thymeleaf for templating.

## Features
- **User Registration**: Users can register with a username, email, and password.
- **Authentication**: Users authenticate via JWT (JSON Web Token).
- **Role-Based Access Control**: The application supports two roles, `ADMIN` and `USER`.
    - `ADMIN`: Can view, update, and delete all users.
    - `USER`: Can view and update their own details.
- **Validation**: Input validation using Spring's `@Valid` annotations and custom validators (e.g., password strength).
- **Exception Handling**: Global exception handling for consistent error messages and HTTP status codes.

## Project Structure

```bash
src
 └── main
     └── java
         └── org.joann.usermanagement
             ├── config               # Spring Security configurations
             ├── controllers           # REST controllers
             ├── dto                   # Data Transfer Objects (DTOs)
             ├── exceptions            # Custom exceptions and handlers
             ├── models                # Entity models (e.g., User)
             ├── repositories          # Data access layer (DAOs)
             ├── services              # Business logic
             └── utilities             # JWT utilities and filters
     └── resources
         ├── static                    # Static resources (CSS, JavaScript, etc.)
         └── templates                 # Thymeleaf templates (HTML)
