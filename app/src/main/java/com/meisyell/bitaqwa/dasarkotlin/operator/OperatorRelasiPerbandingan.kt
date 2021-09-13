package com.meisyell.bitaqwa.dasarkotlin

fun main() {
    val a = 5
    val b = 10

    val maksimal = if (a > b) {
        println("a lebih besar dari b.")
        a
    }else{
        println("b lebih besar dari a.")
        b
    }
    println("maksimal = $maksimal")


}