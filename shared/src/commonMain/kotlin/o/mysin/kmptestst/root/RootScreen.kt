package o.mysin.kmptestst.root

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import o.mysin.kmptestst.common.ui.AppTheme
import o.mysin.kmptestst.common.ui.AppThemeProvider
import o.mysin.kmptestst.settings.compose.SettingsScreen
import o.mysin.kmptestst.settings.SettingsViewModel

@Composable
fun RootScreen(viewModel: RootViewModel) {

    val state by viewModel.state.collectAsState()

    AppTheme(
        themeIsDark = state.themeIsDark,
        appPrefs = state.appPrefs
    ) {
        Box(modifier = Modifier.fillMaxSize().background(AppThemeProvider.colors.background)) {
            SettingsScreen(SettingsViewModel())
        }
    }
}