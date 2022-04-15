package com.example.foodtruck

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodtruck.databinding.ActivityMainBinding
import com.example.foodtruck.databinding.ActivityFoodTruckDetailBinding

class truck_description : AppCompatActivity() {
    private lateinit var binding: ActivityFoodTruckDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodTruckDetailBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        val truck = intent.getParcelableExtra<truckdata>("truck")
        binding.truckImage.setImageResource(when(truck!!.imageNum) {
            0 -> R.drawable.elfishytacos
            1 -> R.drawable.borgor
            2 -> R.drawable.halalalalla
            3 -> R.drawable.ginger
            4 -> R.drawable.susquesitonmark
            else -> R.drawable.hjeft
        })
        binding.truckName.text = truck.name
        binding.location.text = truck.location
        binding.time.text = truck.time
        binding.truckDesc.text = truck.desc

        binding.link.setOnClickListener {
            val uri = Uri.parse(truck.link)
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
//          binding.truckName.text = "Among US!!!"
        }
    }
}