package com.meisyell.bitaqwa.dasarkotlin

fun main() {
    val a=10
    val b=5
    val c=15

    val contoh = false

    var hasil : Boolean

    hasil = (a>b) && (a>c) //true && false
    println(hasil)

    hasil = (a>b) || (a>c) //true && false
    println(hasil)

    hasil = !contoh //false
    println(hasil)

    //Contoh
    val d=15
    val e=10
    val f=20

    val buku = true

    var jumlah : Boolean

    jumlah = (a>b) && (a>c)
    println(jumlah)

    jumlah = (a>b) || (a>c)
    println(jumlah)

    jumlah = !buku
    println(jumlah)

}