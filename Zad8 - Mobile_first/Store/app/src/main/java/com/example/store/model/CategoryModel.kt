package com.example.store.model

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

data class Category(
    val id: Int,
    val name: String,
    val products: List<Product>
)

data class Product(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double
)

class CategoryModel : ViewModel() {
    var categories = mutableStateListOf<Category>()


    init {
        categories.addAll(generateSampleData())
    }

    private fun generateSampleData(): List<Category> {
        val guitars = listOf(
            Product(1, "Les Paul", "Heavy metal", 1000.99),
            Product(2, "Stratocaster", "Funk and punk", 1200.99)
        )
        val pianos = listOf(
            Product(3, "Keyboard", "For begginers", 150.99),
            Product(4, "Grand piano", "For super advanced", 9000.99)
        )
        return listOf(
            Category(1, "Guitars", guitars),
            Category(2, "Pianos", pianos)
        )
    }
}