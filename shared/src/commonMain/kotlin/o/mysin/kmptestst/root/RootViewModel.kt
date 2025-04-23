package o.mysin.kmptestst.root

import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import o.mysin.kmptestst.base.BaseViewModel
import o.mysin.kmptestst.root.RootContract.*
import o.mysin.kmptestst.storage.SettingsManager

class RootViewModel : BaseViewModel<State, Nothing>() {

    init {
        SettingsManager.themeIsDarkFlow.onEach { isDark ->
            updateState { copy(themeIsDark = isDark) }
        }.launchIn(viewModelScope)
    }

    override fun initialState(): State = State.NONE
}