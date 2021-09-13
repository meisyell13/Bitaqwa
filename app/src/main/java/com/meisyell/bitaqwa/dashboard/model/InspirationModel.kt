package com.meisyell.bitaqwa.dashboard.model

//Kita mau pake apa aja sih di recycler view nya? image
//biar recycler view nya tau kalo data apa yang mau di tampilin
//buat nampung data biar bisa di akses
//data class = Class untuk menampung data
data class InspirationModel (
    //Pake tipe data integer? Karena tipe data gambar itu integer
    //isi nya 0 fugsinya untuk mengatur nilai defaultnya
    var inspirationImageModel: Int = 0
)