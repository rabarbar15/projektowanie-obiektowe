package com.kamil.piskorz.Zad3_Wzorce_kreacyjne.controllers

import com.kamil.piskorz.Zad3_Wzorce_kreacyjne.services.AuthorizationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(@Autowired val authorizationService: AuthorizationService) {

    @PostMapping("/login")
    fun authenticate(@RequestBody credentials: Map<String, String>): String {
        val username = credentials["username"]
        val password = credentials["password"]

        return if (username != null && password != null && authorizationService.authorize(username, password)) {
            "Authentication successful"
        } else {
            "Authentication failed"
        }
    }
}


