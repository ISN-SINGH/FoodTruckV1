package com.example.foodtruck
import android.content.Intent
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class RecyclerAdapter(private var trucks: List<truckdata>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val truckImageView: ImageView = itemView.findViewById(R.id.truckImage)
        val truckName: TextView = itemView.findViewById(R.id.truckName)
        val truckLocation: TextView = itemView.findViewById(R.id.location)
        val truckTime: TextView = itemView.findViewById(R.id.time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.food_truck_item, parent, false);

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val truck = trucks[position]

        holder.truckImageView.setImageResource(when(truck.imageNum) {
            0 -> R.drawable.elfishytacos
            1 -> R.drawable.borgor
            2 -> R.drawable.halalalalla
            3 -> R.drawable.ginger
            4 -> R.drawable.susquesitonmark
            else -> R.drawable.hjeft
        })
        holder.truckName.text = truck.name
        holder.truckLocation.text = truck.location
        holder.truckTime.text = truck.time

       holder.itemView.setOnClickListener {
            val intent = Intent(it.context, truck_description::class.java)
            intent.putExtra("truck", truck)
            it.context.startActivity(intent)

        }

    }

    override fun getItemCount() = trucks.size
}