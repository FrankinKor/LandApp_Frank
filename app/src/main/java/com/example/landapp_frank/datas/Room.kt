package com.example.landapp_frank.datas

import java.io.Serializable

class Room (
    val price:Int,
    val address: String,
    val floor: Int,
    val description: String) : Serializable {
}