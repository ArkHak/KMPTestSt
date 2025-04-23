package o.mysin.kmptestst.settings

import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import o.mysin.kmptestst.base.BaseViewModel
import o.mysin.kmptestst.platform.DeviceInfo
import o.mysin.kmptestst.settings.SettingsContract.*
import o.mysin.kmptestst.storage.SettingsManager

class SettingsViewModel : BaseViewModel<SettingsContract.State, Nothing>() {

    init {

        SettingsManager.themeIsDarkFlow.onEach {
            updateState { copy(themeIsDark = it) }
        }.launchIn(viewModelScope)

        val deviceInfo = DeviceInfo()
        updateState {
            copy(deviceInfo = deviceInfo.getSummary())
        }
    }

    override fun initialState() = State.NONE

    fun switchTheme(isDark: Boolean) {
        SettingsManager.themeIsDark = isDark
    }
}