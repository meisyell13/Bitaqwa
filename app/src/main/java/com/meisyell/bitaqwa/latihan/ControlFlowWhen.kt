package com.meisyell.bitaqwa.latihan

fun main() {
    var hari = 7
    var hasilHari = when(hari){
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jumat"
        else -> "Hari tidak dikenali"
    }
    println("Hasil hari : $hasilHari")
}