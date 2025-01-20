WeGroceries API

Overview:

WeGroceries API is a RESTful service designed to enable sellers, buyers, and delivery services to connect seamlessly for wholesale grocery transactions. It supports authentication, product management, order processing, and user management. Built using Java and Spring Boot, this API adheres to a clean and modular structure for easy scalability and maintainability.

Features
Authentication
- User registration and login
- Token-based authentication using JWT

Product Management
- Add, view, update, and delete products
- List all available products

Order Processing
- Create, view, and update orders
- Manage order status

User Management
- Manage user details
- Retrieve specific user information

Project Structure
src
├── main
│   ├── java
│   │   ├── com
│   │   │   ├── wegroceries
│   │   │   │   ├── WeGroceriesApplication.java         # Main application entry point
│   │   │   │   ├── config                             # Configuration classes
│   │   │   │   ├── common                             # Common utilities and error handling
│   │   │   │   ├── feature
│   │   │   │   │   ├── authentication                # Authentication feature
│   │   │   │   │   │   ├── controller                # Controllers for auth
│   │   │   │   │   │   ├── service                   # Services for auth logic
│   │   │   │   │   │   ├── model                     # Models for auth (e.g., User)
│   │   │   │   │   │   └── repository                # Repositories for auth (e.g., UserRepository)
│   │   │   │   │   ├── product                       # Product feature
│   │   │   │   │   │   ├── controller                # Controllers for products
│   │   │   │   │   │   ├── service                   # Services for products logic
│   │   │   │   │   │   ├── model                     # Models for product (e.g., Product)
│   │   │   │   │   │   └── repository                # Repositories for product (e.g., ProductRepository)
│   │   │   │   │   ├── order                         # Order feature
│   │   │   │   │   │   ├── controller                # Controllers for orders
│   │   │   │   │   │   ├── service                   # Services for orders logic
│   │   │   │   │   │   ├── model                     # Models for order (e.g., Order, OrderItem)
│   │   │   │   │   │   └── repository                # Repositories for orders (e.g., OrderRepository)
│   │   │   │   │   ├── user                          # User feature
│   │   │   │   │   │   ├── controller                # Controllers for users
│   │   │   │   │   │   ├── service                   # Services for users logic
│   │   │   │   │   │   ├── model                     # Models for user (e.g., User)
│   │   │   │   │   │   └── repository                # Repositories for users (e.g., UserRepository)
│   │   │   │   │   └── config                        # Configuration specific to features
│   │   │   │   ├── exception                          # Global exceptions
│   │   │   │   └── util                               # Common utilities (e.g., DateUtil, PasswordValidator)
│   ├── resources
│   │   ├── application.properties                    # Application properties (e.g., DB config, server)
└── pom.xml                                            # Maven build file with dependencies

API Endpoints

Authentication
- POST /api/auth/register: Register a new user
- POST /api/auth/login: Authenticate a user

User Management
- GET /api/users/{id}: Retrieve user details

Product Management
- GET /api/products: List all products
- POST /api/products: Add a new product
- GET /api/products/{id}: Get product details
- PUT /api/products/{id}: Update product details
- DELETE /api/products/{id}: Delete a product
-
Order Management
- POST /api/orders: Create a new order
- GET /api/orders/{id}: Retrieve order details
- PUT /api/orders/{id}/status: Update order status

Prerequisites
- Java 21
- Maven
- MySQL (or PostgreSQL)
- IDE (e.g., IntelliJ IDEA or Visual Studio Code with Java extensions)

Getting Started
1. Clone the Repository
git clone <repository-url>
cd wegroceries

2. Setup Database
Create a database and configure the application.properties file in the resources folder:

spring.datasource.url=jdbc:mysql://localhost:3306/wegroceries
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>
spring.jpa.hibernate.ddl-auto=update

3. Run the Application

mvn spring-boot:run

4. Test the API
Use Postman or any API client to test the endpoints.

Error Handling
- Global exception handler with @ControllerAdvice.
- Returns appropriate HTTP status codes and error messages (e.g., 404 Not Found, 400 Bad Request).

License
This project is licensed under the MIT License. See the LICENSE file for details.

Contributing
- Fork the repository.
- Create a feature branch.
- Commit your changes.
- Submit a pull request.

