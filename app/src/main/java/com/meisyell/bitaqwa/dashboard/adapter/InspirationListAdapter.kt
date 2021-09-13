package com.meisyell.bitaqwa.dashboard.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.meisyell.bitaqwa.R
import com.meisyell.bitaqwa.dashboard.model.InspirationModel

//Adapter = berfungsi utuk menjdi penghubung data dan tampilan
class InspirationListAdapter (private val listInspiration : ArrayList<InspirationModel>) :
    RecyclerView.Adapter<InspirationListAdapter.ListViewHolder>(){


   inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder (itemView) {

        //Variable untuk menemukan id image nya
        var imgPhoto : ImageView = itemView.findViewById(R.id.iv_item_photo)

    }

    //untuk menentukan layout atau tempat data yang akan di tampilkan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
       val view: View = LayoutInflater.from(parent.context).inflate(R.layout
           .item_row_inspiration, parent, false)
        return ListViewHolder(view)
    }
    //untuk menampilkan data pada komponen layout yang telah di tentukan pada fungsi oncreate view holder
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val inspiration = listInspiration[position]

        //Glide = library untuk menampilkan gambar pada recycleview
        Glide.with(holder.itemView.context)
            .load(inspiration.inspirationImageModel)
            .into(holder.imgPhoto)

    }
    //untuk menentukan jumlah data yang akan di tampilkan
    override fun getItemCount(): Int {
        return listInspiration.size
    }

}