package com.meisyell.bitaqwa.latihan

fun main() {
    operatorAritmatika()
    operatorRelasi()
    operatorLogika()
}

fun operatorLogika() {
    var dua =2
    var lima =5
    var delapan =8
    var contoh = true
    var hasil : Boolean

    hasil = (dua>lima) && (lima<delapan)
    println("(dua>lima) && (lima<delapan):"+hasil)

    hasil = (lima>dua) || (delapan<dua)
    println("(lima>dua) || (delpaan<dua):"+hasil)

    hasil = !contoh //true
    println("!contoh :"+ hasil)

}

fun operatorRelasi() {
    val a = 9
    val b = 2
    val hasil = if (b < a){
        println("b lebih kecil dari a")
        b
    }else{
        println("a lebih kecil dari b")
        a
    }
    println("hasil = $hasil")
}

fun operatorAritmatika() {
    val a = 12
    val b = 6

    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)
}

