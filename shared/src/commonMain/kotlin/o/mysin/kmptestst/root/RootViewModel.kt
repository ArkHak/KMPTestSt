package o.mysin.kmptestst.root

import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import o.mysin.kmptestst.base.BaseViewModel
import o.mysin.kmptestst.root.model.AppTab
import o.mysin.kmptestst.root.model.RootContract.*
import o.mysin.kmptestst.storage.SettingsManager

class RootViewModel(
    settingsManager: SettingsManager,
) : BaseViewModel<State, Nothing>() {

    init {
        settingsManager.themeIsDarkFlow.onEach { isDark ->
            updateState { copy(themeIsDark = isDark) }
        }.launchIn(viewModelScope)
    }

    override fun initialState(): State = State.NONE

    fun handleClickOnTab(appTab: AppTab) = updateState { copy(selectedTab = appTab) }
}