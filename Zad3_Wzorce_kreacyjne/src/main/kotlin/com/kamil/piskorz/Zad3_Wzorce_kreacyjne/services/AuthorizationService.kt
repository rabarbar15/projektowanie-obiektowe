package com.kamil.piskorz.Zad3_Wzorce_kreacyjne.services

import org.springframework.stereotype.Service

@Service
class AuthorizationService {

    fun authorize(userName: String, password: String): Boolean {
        return (userName == "admin" && password == "admin123")
    }
}