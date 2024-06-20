package com.example.store

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.store.model.CategoryModel
import com.example.store.ui.theme.StoreTheme
import com.example.store.views.CategoryListView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StoreTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                      Categories(
                              categoryModel = CategoryModel(),
                              modifier = Modifier.padding(innerPadding)
                      )
                }
            }
        }
    }
}

@Composable
fun Categories(categoryModel: CategoryModel, modifier: Modifier = Modifier) {
    CategoryListView(category = categoryModel)
}



@Preview(showBackground = true)
@Composable
fun CategoryPreview() {
    StoreTheme {
        val viewModel = CategoryModel()
        CategoryListView(category = viewModel)
    }
}