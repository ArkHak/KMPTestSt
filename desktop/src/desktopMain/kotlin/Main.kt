import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import o.mysin.kmptestst.di.initKoin
import o.mysin.kmptestst.root.compose.RootScreen

fun main() {

    initKoin()

    application {
        val state = rememberWindowState().apply { size = DpSize(1200.dp, 600.dp) }

        Window(
            onCloseRequest = { exitApplication() },
            state = state,
            title = "KMPTestSr"
        ) {
            RootScreen()
        }
    }
}