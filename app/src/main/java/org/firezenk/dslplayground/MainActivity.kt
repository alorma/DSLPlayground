package org.firezenk.dslplayground

import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RecyclerItemTouchHelper.RecyclerItemTouchHelperListener {

    private val adapter = MainAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupAdapter()

        navigation.dsl {
            menu = R.menu.navigation
            item(R.id.navigation_home) {
                showToast(R.string.title_home)
            }
            item(R.id.navigation_dashboard) {
                showToast(R.string.title_dashboard)
            }
            item(R.id.navigation_notifications) {
                showToast(R.string.title_notifications)
            }
        }
    }

    private fun setupAdapter() {
        adapter.setOnItemClickListener {

            val uri = Uri.Builder().scheme("http")
                    .authority("wikimedia.org")
                    .appendPath("character")
                    .appendPath(it.id.toString())
                    .appendQueryParameter("lang", "es")
                    .build()
            showToast("Clicked: $uri")
        }

        adapter.submitList(Shows.shows)

        val itemTouchHelperCallback = RecyclerItemTouchHelper(0, ItemTouchHelper.LEFT, this)
        ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(list)

        list.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        list.adapter = adapter
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int, position: Int) {
        if (viewHolder is MainAdapter.ViewHolder) {
            val name = Shows.shows[viewHolder.adapterPosition].name

            val deletedIndex = viewHolder.adapterPosition
            val deletedItem = Shows.shows[deletedIndex]

            Shows.shows.removeAt(position)
            adapter.notifyItemRemoved(position)

            val snackbar = Snackbar.make(container, "$name removed!", Snackbar.LENGTH_LONG)
            with(snackbar) {
                setAction("UNDO", {
                    Shows.shows.add(deletedIndex, deletedItem)
                    adapter.notifyItemInserted(deletedIndex)
                })
                setActionTextColor(Color.YELLOW)
                show()
            }
        }
    }

    private fun showToast(id: Int) {
        Toast.makeText(this, id, Toast.LENGTH_SHORT).show()
    }

    private fun showToast(stringId: String) {
        Toast.makeText(this, stringId, Toast.LENGTH_SHORT).show()
    }
}
