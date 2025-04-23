package o.mysin.kmptestst.root

import o.mysin.kmptestst.base.BaseViewState
import o.mysin.kmptestst.common.ui.AppPrefs

class RootContract {

    data class State(
        val themeIsDark: Boolean,
        val firstDayMonday: Boolean
    ) : BaseViewState {

        val appPrefs: AppPrefs
            get() = AppPrefs(firstDayIsMonday = firstDayMonday)

        companion object {
            val NONE = State(
                themeIsDark = true,
                firstDayMonday = true
            )
        }
    }
}