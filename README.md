# Android Login & Registration App using Jetpack Compose

## Aim
Create an Android application that includes Login and Registration screens using **Jetpack Compose**.

## Description
This practical demonstrates the development of a basic Android application using Kotlin and Jetpack Compose. The application provides Login and Registration screens with input fields, buttons, password masking, and navigation between screens.

## Features
- Login screen with Email and Password fields
- Registration screen with Name, Phone Number, City, Email, Password, and Confirm Password fields
- Password masking for secure input display
- Input validation for empty fields
- Password confirmation check during registration
- Forgot Password button with Toast message
- Navigation between Login and Registration screens
- GUNI logo displayed on both screens
- Scrollable forms for better usability

## Technologies Used
- **Language:** Kotlin
- **UI Framework:** Jetpack Compose
- **IDE:** Android Studio
- **UI Components:** Material 3
- **Navigation:** Navigation Compose

## Project Structure

```text
app/src/main/java/com/example/a24012011002_mad_practical_5/
├── MainActivity.kt
├── AppNavigation.kt
├── LoginPage.kt
├── RegisterPage.kt
└── FormField.kt
```

## Key Components

- **MainActivity.kt:** Initializes the application and applies the app theme.
- **AppNavigation.kt:** Manages navigation between Login and Registration screens.
- **LoginPage.kt:** Displays login fields, Forgot Password, Login, and Sign Up options.
- **RegisterPage.kt:** Displays registration fields and checks for empty fields and matching passwords.
- **FormField.kt:** Provides reusable input fields with number, email, and password keyboard options.

## Working
1. The application opens on the Login screen.
2. Users can enter their email and password.
3. The Sign Up option navigates to the Registration screen.
4. Users enter their details and confirm their password.
5. Toast messages display the results of basic input validation.
6. Users can navigate back to the Login screen.

## Android Concepts Studied
- Jetpack Compose and Composable functions
- State management using `remember` and `mutableStateOf`
- Navigation using `NavController` and `NavHost`
- Material 3 UI components
- Reusable composable functions
- Input validation and Toast messages
- Password visual transformation



|<img width="300" height="700" alt="image" src="https://github.com/user-attachments/assets/0a2c0ad1-0391-4594-bd67-33ed8cb127e8" />|<img width="300" height="700" alt="image" src="https://github.com/user-attachments/assets/4667a5c2-227d-44a6-83d1-ced79bfda7f2" />|


## Conclusion
This practical demonstrates how to build Login and Registration screens using **Kotlin and Jetpack Compose**, implement basic input validation, create reusable form fields, and navigate between screens in an Android application.
