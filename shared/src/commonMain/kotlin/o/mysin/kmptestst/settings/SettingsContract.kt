package o.mysin.kmptestst.settings

import o.mysin.kmptestst.base.BaseViewState

class SettingsContract {
    data class State(
        val deviceInfo: String,
        val themeIsDark: Boolean
    ) : BaseViewState {
        companion object {
            val NONE = State(
                deviceInfo = "",
                themeIsDark = false
            )
        }
    }
}