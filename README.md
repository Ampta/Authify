# Authify

Authify is **authentication and authorization** system built with a modern full-stack architecture. 
It provides a secure foundation for applications, featuring multi-factor verification, **JWT-based security**, 
and a clean, responsive user interface.

## 🚀 Features
-   **Secure Authentication**: User registration and login with encrypted password storage.
-   **Email Verification (OTP)**: Two-step verification process via 6-digit OTP sent to the user's registered email.
-   **JWT Authorization**: Stateless session management using JSON Web Tokens for secure API communication.
-   **Interactive Dashboard**: Personalized user greeting and account management post-login.
-   **Database Management**: Comprehensive user data tracking including account verification status and encrypted credentials.

## 🛠️ Tech Stack
-   **Backend**: Java, Spring Boot, Spring Security
-   **Frontend**: React.js, Tailwind CSS
-   **Security**: JWT (JSON Web Token), BCrypt Password Hashing
-   **Database**: MySQL
-   **Communication**: RESTful APIs, Brevo (formerly Sendinblue) for SMTP/OTP services

## 📸 Screenshots

### 1. **Welcome Screen** 
The landing page for Authify, featuring a clean hero section and a direct call to action for users to get started.
<img width="1607" height="912" alt="authify_home" src="https://github.com/user-attachments/assets/f90608cb-f761-424c-8217-a8c49164af21" />


### 2. **User Authentication** 
A streamlined login and account creation experience with real-time validation.
<img width="1607" height="912" alt="authify_create" src="https://github.com/user-attachments/assets/159d4955-58d3-4631-8199-a878c5085389" />
<img width="1543" height="911" alt="authify_login_c" src="https://github.com/user-attachments/assets/7dddc4d8-a015-49c8-bda6-749d7785f663" />


### 3. **User Dashboard** 
A personalized "Welcome" dashboard after successful authentication and verification.
<img width="1543" height="911" alt="after_login_dashboard" src="https://github.com/user-attachments/assets/65290746-460e-42fc-8fa3-d6380430a4eb" />


### 4. **Email Verification (OTP)** 
To ensure account security, a 6-digit OTP is triggered to the user's email upon registration.
<img width="1543" height="911" alt="verify_otp" src="https://github.com/user-attachments/assets/16be4e54-ff29-434f-96a9-4959e85f57d8" />



### 5. **Database Architecture** 
Backend tracking of user metadata, including is_account_verified flags and created_at timestamps.
<img width="1519" height="851" alt="Screenshot 2026-02-24 123638" src="https://github.com/user-attachments/assets/97046308-fbdb-45e7-8b01-cadf88f551e2" />

# 🏗️ Getting Started

### Prerequisites
-   Java 17 or higher
-   MySQL Server
-   Node.js & npm

### Installation
-   Clone the repository:
-   Backend Setup:
    -   Configure your database settings in src/main/resources/application.properties.
    -   Run the Spring Boot application using your IDE or ./mvnw spring-boot:run.
-   Frontend Setup:
    -   Navigate to the frontend directory: cd client.
    -   Install dependencies: npm install.
    -   Start the development server: npm run dev.
      



