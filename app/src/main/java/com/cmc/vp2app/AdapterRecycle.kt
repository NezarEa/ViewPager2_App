package com.cmc.vp2app

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterRecycle(
    private val context: Context,
    private var countries: MutableList<Countries>,
    private var onItemClick: ((Countries) -> Unit)? = null
) : RecyclerView.Adapter<AdapterRecycle.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)

        fun bind(item: Countries) {
            imageView.setImageResource(item.img)
            textView.text = item.name

            itemView.setOnClickListener {
                onItemClick?.invoke(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_country, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(countries[position])
    }

    override fun getItemCount(): Int = countries.size

    fun updateList(newList: List<Countries>) {
        countries.clear()
        countries.addAll(newList)
        notifyDataSetChanged()
    }
}