package org.firezenk.dslplayground

import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import org.firezenk.dslplayground.util.dsl

class MainAdapter : ListAdapter<TvShow, MainAdapter.ViewHolder>(ItemDiffCallback()) {

    private lateinit var clickListener: (TvShow) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater.inflate(R.layout.list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(getItem(position), clickListener)

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val viewForeground = itemView.findViewById<View>(R.id.viewForeground)
        private val title = itemView.findViewById<TextView>(R.id.title)
        private val subtitle = itemView.findViewById<TextView>(R.id.subtitle)
        private val characters = itemView.findViewById<TextView>(R.id.characters)
        private val image = itemView.findViewById<ImageView>(R.id.image)

        fun bind(item: TvShow, clickListener: (TvShow) -> Unit) {
            title.text = item.name
            subtitle.text = item.description
            characters.text = "${item.casting.size} characters"
            image.dsl { url = item.image }
            itemView.setOnClickListener { clickListener(item) }
        }
    }

    fun setOnItemClickListener(block: (TvShow) -> Unit) {
        clickListener = block
    }
}

class ItemDiffCallback : DiffUtil.ItemCallback<TvShow>() {

    override fun areItemsTheSame(oldItem: TvShow, newItem: TvShow): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: TvShow, newItem: TvShow): Boolean {
        return oldItem == newItem
    }
}