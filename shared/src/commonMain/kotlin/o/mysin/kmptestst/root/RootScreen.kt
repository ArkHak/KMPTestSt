package o.mysin.kmptestst.root

import androidx.compose.runtime.Composable
import o.mysin.kmptestst.settings.compose.SettingsScreen
import o.mysin.kmptestst.settings.SettingsViewModel

@Composable
fun RootScreen() {
    SettingsScreen(SettingsViewModel())
}