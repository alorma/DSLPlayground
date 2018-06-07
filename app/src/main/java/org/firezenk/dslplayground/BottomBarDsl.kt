package org.firezenk.dslplayground

import android.support.design.widget.BottomNavigationView
import android.view.MenuItem

@DslMarker
annotation class BottomBarDsl

@BottomBarDsl
class ItemBuilder {
    internal lateinit var select: (MenuItem) -> Unit

    fun select(function: (MenuItem) -> Unit) {
        this.select = function
    }
}

@BottomBarDsl
class BottomBarBuilder {
    internal lateinit var navigationView: BottomNavigationView

    var menu: Int = 0
    private val items: MutableMap<Int, ItemBuilder> = mutableMapOf()

    fun build() {
        navigationView.inflateMenu(menu)
        navigationView.setOnNavigationItemSelectedListener { menuItem ->
            items[menuItem.itemId]?.let {
                it.select(menuItem)
                true
            } ?: false
        }
    }

    fun item(itemId: Int, action: (MenuItem) -> Unit) {
        items[itemId] = ItemBuilder().apply {
            select(action)
        }
    }
}

fun BottomNavigationView.dsl(setup: BottomBarBuilder.() -> Unit) {
    BottomBarBuilder().apply {
        navigationView = this@dsl
        setup()
    }.build()
}