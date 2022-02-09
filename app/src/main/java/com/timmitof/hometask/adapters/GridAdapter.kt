package com.timmitof.hometask.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.timmitof.hometask.R
import com.timmitof.hometask.models.ModelClass

class GridAdapter(private val array: ArrayList<ModelClass>, private val context: FragmentActivity):
    RecyclerView.Adapter<GridAdapter.ViewHolder>(){
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val image: ImageView
        val name: TextView
        val description: TextView

        init {
            image = itemView.findViewById(R.id.imageView_grid)
            name = itemView.findViewById(R.id.name_grid)
            description = itemView.findViewById(R.id.description_grid)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_grid, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = array[position]
        Glide.with(holder.itemView).load(item.image).into(holder.image)
        holder.name.text = item.name
        holder.description.text = item.description
    }

    override fun getItemCount(): Int {
        return array.size
    }
}