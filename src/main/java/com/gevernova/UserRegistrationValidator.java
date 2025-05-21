package com.gevernova;

public class UserRegistrationValidator {

    // Validates first name or last name (Starts with capital, min 3 letters)
    public static boolean isValidName(String name) {
        return name.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    // Validates email based on rules including test cases
    public static boolean isValidEmail(String email) {
         String regex = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,}){1,2}$";
        return email.matches(regex);
    }

    //  mobile validation rule
    public static boolean isValidMobile(String mobile) {
        return mobile.matches("^(\\d{2}\\s)?\\d{10}$");
    }

    // Validates password using all 4 rules:
    // - Min 8 chars, at least 1 uppercase, 1 digit, exactly 1 special character
    public static boolean isValidPassword(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*\\d)(?=^[^@#$%^&+=!]*[@#$%^&+=!][^@#$%^&+=!]*$).{8,}$");
    }
}

