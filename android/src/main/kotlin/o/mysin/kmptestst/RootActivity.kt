package o.mysin.kmptestst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import o.mysin.kmptestst.root.compose.RootScreen
import o.mysin.kmptestst.root.RootViewModel

class RootActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RootScreen(RootViewModel())
        }
    }
}