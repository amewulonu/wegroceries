package com.wegroceries;

import org.hibernate.annotations.Comment;

@Comment("This is a welcome message class")
public class WelcomeMessage {
    
public String getWelcomeMessage() {
    return "Welcome to the Spring Boot Application!";
}
}
