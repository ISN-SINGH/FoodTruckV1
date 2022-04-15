package com.example.foodtruck

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class truckdata(
    var ID: Int,
    var name: String,
    var imageNum: Int,
    var location: String,
    var time: String,
    var desc: String,
    var link: String
):Parcelable



