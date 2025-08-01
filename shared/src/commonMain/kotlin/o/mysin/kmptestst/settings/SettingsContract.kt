package o.mysin.kmptestst.settings

import o.mysin.kmptestst.base.BaseViewState

class SettingsContract {
    data class State(
        val info: String,
        val themeIsDark: Boolean
    ) : BaseViewState {
        companion object {
            val NONE = State(
                info = "",
                themeIsDark = false
            )
        }
    }
}