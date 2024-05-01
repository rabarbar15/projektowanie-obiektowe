package com.kamil.piskorz.Zad3_Wzorce_kreacyjne.controllers

import com.kamil.piskorz.Zad3_Wzorce_kreacyjne.models.Book
import com.kamil.piskorz.Zad3_Wzorce_kreacyjne.services.BookService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController(private val bookService: BookService) {

    @GetMapping("/books")
    fun getAllBooks(): ResponseEntity<Any> {
        try {
            val books = bookService.getAllBooks()
            return ResponseEntity(books, HttpStatus.OK)
        } catch (e: Exception) {
            return ResponseEntity("Error: ${e.message}", HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/books/{id}")
    fun getBookById(@PathVariable id: Int): ResponseEntity<Any> {
        try {
            val book = bookService.getBookById(id)
            return ResponseEntity(book, HttpStatus.OK)
        } catch (e: Exception) {
            return ResponseEntity("Error: ${e.message}", HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }
}