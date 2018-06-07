package org.firezenk.dslplayground

import android.support.design.widget.BottomNavigationView
import android.view.MenuItem

@DslMarker
annotation class BottomBarDsl

@BottomBarDsl
class BottomBarBuilder {
    internal lateinit var navigationView: BottomNavigationView

    var menu: Int = 0
    private val items: MutableMap<Int, (MenuItem) -> Unit> = mutableMapOf()

    fun build() {
        navigationView.inflateMenu(menu)
        navigationView.setOnNavigationItemSelectedListener { menuItem ->
            val item = items[menuItem.itemId]

            item?.let {
                it.invoke(menuItem)
                true
            } ?: false
        }
    }

    fun item(itemId: Int, action: (MenuItem) -> Unit) {
        items[itemId] = action
    }
}


fun BottomNavigationView.dsl(setup: BottomBarBuilder.() -> Unit) {
    BottomBarBuilder().apply {
        navigationView = this@dsl
        setup()
    }.build()
}