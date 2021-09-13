package com.meisyell.bitaqwa.dasarkotlin2.Class
//kerangka mobil
class Mobil() {
    //bagian - bagian mobil
    //properti
    var totalRoda : Int = 4
    var totalPintu : Int = 2
    var merek : String = "Toyota"
    var tahunKeluar : String = "2020"
    var warna : String = "Merah"

    //Method
    //cara kerja mobil
    fun majuKedepan(){
        println("Mobil Maju Kedepan")
    }
    fun mundurKebelakang(){
        println("Mobil mundur kebelakang")
    }
}