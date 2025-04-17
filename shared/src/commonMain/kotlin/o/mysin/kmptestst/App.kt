package o.mysin.kmptestst

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

fun sayHello() {
    println("Hello from My Code")
}

@Composable
fun SayHelloFromCommon() {
    Box(modifier = Modifier.size(200.dp)) {
        Text(
            "hello from my compose common",
            modifier = Modifier.align(Alignment.Center),
            color = Color.Red
        )
    }
}