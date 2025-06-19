import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import o.mysin.kmptestst.root.compose.RootScreen
import o.mysin.kmptestst.root.RootViewModel

fun main() {
    application {
        val state = rememberWindowState().apply { size = DpSize(200.dp, 200.dp) }

        Window(
            onCloseRequest = { exitApplication() },
            state = state,
            title = "KMPTestSr"
        ) {
            RootScreen(RootViewModel())
        }
    }
}