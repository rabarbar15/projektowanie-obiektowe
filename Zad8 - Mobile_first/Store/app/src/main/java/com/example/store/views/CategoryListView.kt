package com.example.store.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.store.model.CategoryModel

@Composable
fun CategoryListView(category: CategoryModel) {
    Column {
        category.categories.forEach { category ->
            Text(
                text = category.name,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(16.dp)
            )
            category.products.forEach { item ->
                ProductItem(product = item)
            }
        }
    }
}