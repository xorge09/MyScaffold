package ragavi.com.myscaffold.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewmodel.compose.viewModel
import ragavi.com.myscaffold.ui.features.products.ProductFormScreen
import ragavi.com.myscaffold.ui.features.products.ProductList
import ragavi.com.myscaffold.ui.features.products.ProductViewModel

enum class Screen {
    List, Create
}

@Composable
fun AppNavigation() {
    val productViewModel: ProductViewModel = viewModel()

    var currentScreen by remember { mutableStateOf(Screen.List) }

    when (currentScreen) {
        Screen.List -> ProductList(
            viewModel = productViewModel,
            onNavigateToCreate = { currentScreen = Screen.Create }
        )
        Screen.Create -> ProductFormScreen(
            viewModel = productViewModel,
            onNavigateBack = { currentScreen = Screen.List }
        )
    }
}