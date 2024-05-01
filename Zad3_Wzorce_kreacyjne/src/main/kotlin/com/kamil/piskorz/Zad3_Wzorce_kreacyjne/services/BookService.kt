package com.kamil.piskorz.Zad3_Wzorce_kreacyjne.services

import com.kamil.piskorz.Zad3_Wzorce_kreacyjne.models.Book
import org.springframework.stereotype.Service

@Service
class BookService {

    private val books = mutableListOf<Book>()

    init {
        books.add(Book(0, "Hobbit", "JR Tolkien"))
        books.add(Book(1, "Harry Potter", "JK Rowling"))
        books.add(Book(2, "Dracula", "Bram Stoker"))
    }

    fun getAllBooks(): List<Book> {
        return books;
    }

    fun getBookById(id: Int): Book? {
        return books.find { it.id == id }
    }
}