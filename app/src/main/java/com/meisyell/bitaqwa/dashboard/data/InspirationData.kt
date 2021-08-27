package com.meisyell.bitaqwa.dashboard.data

import com.meisyell.bitaqwa.R
import com.meisyell.bitaqwa.dashboard.model.InspirationModel

//
object InspirationData {
    //daftar gambar dari drawable
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
        val list = arrayListOf<InspirationModel>()
        for (position in inspirationImage.indices){
            val inspiration = InspirationModel()
            inspiration.inspirationImageModel = inspirationImage[position]
            list.add(inspiration)
        }
        return list
    }
}