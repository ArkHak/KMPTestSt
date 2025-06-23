package o.mysin.kmptestst.settings

import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import o.mysin.kmptestst.base.BaseViewModel
import o.mysin.kmptestst.platform.DeviceInfo
import o.mysin.kmptestst.settings.SettingsContract.*
import o.mysin.kmptestst.storage.SettingsManager

class SettingsViewModel(
    private val deviceInfo: DeviceInfo,
    private val settingsManager: SettingsManager,
) : BaseViewModel<State, Nothing>() {

    init {

        settingsManager.themeIsDarkFlow.onEach {
            updateState { copy(themeIsDark = it) }
        }.launchIn(viewModelScope)

        updateState {
            copy(info = deviceInfo.getSummary())
        }
    }

    override fun initialState() = State.NONE

    fun switchTheme(isDark: Boolean) {
        settingsManager.themeIsDark = isDark
    }
}