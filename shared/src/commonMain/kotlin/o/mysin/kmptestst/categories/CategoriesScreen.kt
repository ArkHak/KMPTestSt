package o.mysin.kmptestst.categories

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun BoxScope.CategoriesScreen() {
    Text(
        text = "Categories",
        modifier = Modifier.align(Alignment.Center)
    )
}