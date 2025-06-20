package o.mysin.kmptestst.root.model

import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.StringResource
import o.mysin.kmptestst.MR

data class BottomBarItem(
    val title: StringResource,
    val appTab: AppTab,
    val icon: ImageResource,
) {
    companion object {
        fun getItems() = listOf(
            BottomBarItem(MR.strings.events, AppTab.Events, MR.images.ic_calendar),
            BottomBarItem(MR.strings.categories, AppTab.Categories, MR.images.ic_categories),
            BottomBarItem(MR.strings.settings, AppTab.Settings, MR.images.ic_settings),
        )
    }
}
