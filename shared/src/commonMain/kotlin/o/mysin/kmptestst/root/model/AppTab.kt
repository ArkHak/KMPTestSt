package o.mysin.kmptestst.root.model

sealed interface AppTab {
    data object Events : AppTab
    data object Categories : AppTab
    data object Settings : AppTab
}