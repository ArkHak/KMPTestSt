package o.mysin.kmptestst.root.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import o.mysin.kmptestst.categories.CategoriesScreen
import o.mysin.kmptestst.common.ui.AppTheme
import o.mysin.kmptestst.common.ui.AppThemeProvider
import o.mysin.kmptestst.di.getKoinInstance
import o.mysin.kmptestst.events.EventsScreen
import o.mysin.kmptestst.root.RootViewModel
import o.mysin.kmptestst.root.model.AppTab
import o.mysin.kmptestst.settings.compose.SettingsScreen

@Composable
fun RootScreen() {

    val viewModel = getKoinInstance<RootViewModel>()
    val state by viewModel.state.collectAsState()

    AppTheme(
        themeIsDark = state.themeIsDark,
        appPrefs = state.appPrefs
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(AppThemeProvider.colors.background)
        ) {
            RootNavigation(state.selectedTab)
            RootBottomBar(state.selectedTab) { tab ->
                viewModel.handleClickOnTab(tab)
            }
        }
    }
}

@Composable
private fun BoxScope.RootNavigation(selectedTab: AppTab) {
    when (selectedTab) {
        AppTab.Categories -> CategoriesScreen()
        AppTab.Events -> EventsScreen()
        AppTab.Settings -> SettingsScreen(getKoinInstance())
    }
}