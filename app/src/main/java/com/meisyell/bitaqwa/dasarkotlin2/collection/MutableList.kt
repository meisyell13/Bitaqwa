package com.meisyell.bitaqwa.dasarkotlin2

fun main() {
    //datanya bisa diubah
    val mutableList = mutableListOf("Aji", "Haidar", "Haura")
    mutableList.add("Aziz")
    for (guruAndroid in mutableList){
        println(guruAndroid)
    }
}