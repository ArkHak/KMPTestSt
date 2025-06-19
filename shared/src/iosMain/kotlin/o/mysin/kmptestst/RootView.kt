package o.mysin.kmptestst

import androidx.compose.ui.window.ComposeUIViewController
import o.mysin.kmptestst.root.RootViewModel
import o.mysin.kmptestst.root.compose.RootScreen

fun MainViewController() = ComposeUIViewController { RootScreen(RootViewModel()) }