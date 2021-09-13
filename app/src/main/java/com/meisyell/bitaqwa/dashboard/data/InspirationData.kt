package com.meisyell.bitaqwa.dashboard.data

import com.meisyell.bitaqwa.R
import com.meisyell.bitaqwa.dashboard.model.InspirationModel

//
object InspirationData {
    //Membuat variable untuk daftar gambar dari drawable
    //set data
    private val inspirationImage = intArrayOf(
        R.drawable.img_inspiration,
        R.drawable.inspiration2,
        R.drawable.inspiration3,
        R.drawable.inspiration4,
        R.drawable.inspiration5
    )
    //berfungsi untuk memproses data dari variable di atas (inspiration image)
    val listData: ArrayList<InspirationModel>
    get() {
        //Buat menampung data dari hasil looping
        //Melooping sesuai jumlah data
        val list = arrayListOf<InspirationModel>()
        for (position in inspirationImage.indices){
            val inspiration = InspirationModel()
            //position = untuk mengatur item sesuai posisi nya
            inspiration.inspirationImageModel = inspirationImage[position]
            list.add(inspiration)
        }
        //dari get harus punya nilai return(mengembalikan nilai)
        return list
    }
}