package ragavi.com.myscaffold.ui.features.products

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import ragavi.com.myscaffold.data.Product

class ProductViewModel : ViewModel() {
    val products = mutableStateListOf<Product>(
        Product("1", "Laptop Pro", 1299.99),
        Product("2", "Mouse Inalámbrico", 49.99)
    )


    fun addProduct(name: String, price: Double) {
        val newId = (products.size + 1).toString()
        products.add(Product(id = newId, name = name, price = price))
    }
}