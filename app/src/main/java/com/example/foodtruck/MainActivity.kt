package com.example.foodtruck
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodtruck.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val trucks = listOf<truckdata>(
        truckdata(
            0, "Authentic Street Taco", 0, "Silo Patio", "11am - 4pm",
            "A unique blend of street taco with high-quality " +
                    "ingredients to give you the highest quality Mexican food", "https://www.authen" +
                    "ticstreettaco.com/"
        ),
        truckdata(
            1, "Buckhorn Grill", 1, "Silo Patio", "10am - 2pm",
            "The idea of the Buckhorn Grill was born out of" +
                    " the success of the product at the Chef’s Market" +
                    " in Napa, California. Thousands of Tri-Tip" +
                    " sandwiches were sold at the market on Friday" +
                    " nights. The first Buckhorn Grill opened in the" +
                    " Metreon located in San Francisco, California in" +
                    " 1999. Each Buckhorn Grill is uniquely designed" +
                    " and provides a friendly, family atmosphere with" +
                    " Really Good Food, Real Fast.", "https://buckhorngril" +
                    "l.com/"
        ),
        truckdata(
            2, "Shah's Halal", 2, "Silo Patio", "12pm - 4pm",
            "Owned and operated by Tory Mashriqi, Shah’s" +
                    " Halal Foods serves strictly Halal certified meats" +
                    " and features a menu of several Mediterranean" +
                    " inspired items including rice, salad, homemade" +
                    " sauces, lamb, chicken and falafel. Made fresh," +
                    " they are cooked over a large flat griddle.", "https://shahshalalfo" +
                    "od.myfreesites.net"
        ),
        truckdata(
            3, "Star Ginger", 3, "Silo Patio", "1pm - 4pm",
            "Fresh Asian flavors for campus, corporate," +
                    "government, healthcare and leisure", "https://www.stargin" +
                    "ger.com/"
        ),
        truckdata(
            4, "Bangin Bowls", 4, "Tercero DC", "2pm - 6pm",
            "We are a Latin fusion food truck buffet, inspired" +
                    " by South American and Caribbean food, to bring" +
                    " to our beloved city Sacramento something" +
                    " different, healthy, with many flavors and with" +
                    " fresh grilled meats. Bangin 'Bowls was created" +
                    " with the purpose of taking a typical Latin food to" +
                    " another level, such as our famous BOWLS with a" +
                    " street style, our FRIES CARGADAS and" +
                    " CHURROS SUNDAE always thinking about what" +
                    " our customers would like and giving the best of" +
                    " us", "https://www.labang" +
                    "inbowls.com/"
        ),
        truckdata(
            5, "Hefty Gyros", 5, "Storer Hall", "1pm - 4pm",
            "Hefty Gyros is a family owned and operated food" +
                    " truck that serves delicious and great quality food." +
                    " As a family owned business, we put our heart" +
                    " and soul with passion to serve the most" +
                    " authentic and delicious Mediterranean food.", "https://heftygyros.c" +
                    "om/"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        val adapter = RecyclerAdapter(trucks)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        //recyclerView.findContainingItemView() //?


//        val card = findViewById<CardView>(R.id.thecard)
//        val truckName = findViewById<TextView>(R.id.truckName)
//        val truck = trucks.filter {it.name == truckName.text}.first()
//        card.setOnClickListener {
//           val intent = Intent(this, truck_description::class.java)
//            intent.putExtra("truck", truck )
//            startActivity(intent)
//
//        }


    }

}