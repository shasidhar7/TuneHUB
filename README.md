# TuneHUB 🎵  

**TuneHUB** is a web-based music platform that offers seamless music experiences for users. It supports user registration, song management, playlist creation, and premium features through Razorpay integration.

---

## Features  
- **User Authentication**: Secure login and registration for users.  
- **Song Management**: Add, view, and play songs.  
- **Playlist Creation**: Users can create and manage playlists.  
- **Premium Subscription**: Razorpay integration for premium user features.  
- **Role-Based Access**: Admins can manage songs and playlists, while customers enjoy music streaming.  

---

## Technologies Used  
- **Frontend**:  
  - HTML, CSS, Thymeleaf  

- **Backend**:  
  - Java (Spring Boot Framework)  
  - Hibernate ORM  

- **Database**:  
  - MySQL  

- **Payment Gateway**:  
  - Razorpay  

---

## Project Structure  
```
src  
│
├── main  
│   ├── java  
│   │   └── com.project.tunehub  
│   │       ├── controller          # Controllers for handling requests  
│   │       ├── entity              # Entities representing database models  
│   │       ├── repository          # Repository interfaces for DB operations  
│   │       └── service             # Business logic implementation  
│   ├── resources  
│   │   ├── templates               # Thymeleaf templates (HTML files)  
│   │   └── application.properties  # Configuration files  
│   └── static                      # CSS, JS, and static files  
│  
├── test                            # Test cases  
│
└── pom.xml                         # Maven dependencies  

```
---

## Setup Instructions  

### Prerequisites  
- Java Development Kit (JDK) 8 or higher  
- Maven  
- MySQL (Version 5.7.20)  
- Razorpay account for payment gateway setup  

### Steps to Run the Project  
1. Clone the repository:  
   ```bash
   git clone https://github.com/shasidhar7/TuneHUB.git
   cd TuneHUB

2. Configure the database in application.properties:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/tunehub
   spring.datasource.username=<your_db_username>
   spring.datasource.password=<your_db_password>
    
3. Install dependencies:
   ```bash
     mvn clean install
   ```
4. Run the application:
   ```bash
     mvn spring-boot:run
   ```
5. Access the application:
    - Open your browser and navigate to http://localhost:8080.

## Razorpay Integration
### Steps to Set Up Razorpay:
  1. Create an account at Razorpay.
  2. Generate API keys (Test and Live keys).
  3. Replace placeholders in `PaymentController`:

   ```java
     RazorpayClient razorpay = new RazorpayClient("rzp_test_xxx", "your_secret_key");
   ```

