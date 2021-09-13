package com.meisyell.bitaqwa.dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.meisyell.bitaqwa.R
import com.meisyell.bitaqwa.dashboard.adapter.InspirationListAdapter
import com.meisyell.bitaqwa.dashboard.data.InspirationData
import com.meisyell.bitaqwa.dashboard.model.InspirationModel
import com.meisyell.bitaqwa.menus.doa.MenuDoaActivity
import com.meisyell.bitaqwa.menus.dzikir.MenuDzikirActivity
import com.meisyell.bitaqwa.menus.jadwalsholat.MenuJadwalSholatActivity
import com.meisyell.bitaqwa.menus.videokajian.MenuVideoKajianActivity
import com.meisyell.bitaqwa.menus.zakat.MenuZakatActivity
import kotlinx.android.synthetic.main.activity_dashboard.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        initNavMenu()
        initHeader()
        initRecyclerViewInspiration()
    }


    /*
    STEP Menggunakan Recycle View
    1. membuat Recycle View di XML utama (DashBoard Activity)
    2. Membuat tampilan item pada layout yang berbeda
    3. Membuat Model
    4. Membuat Data
    5. Membuat Adapter
    6. Inisialisasi pada Activity Recycle View (DashBoard Activity)

     */
    private fun initRecyclerViewInspiration() {
        val list: ArrayList<InspirationModel> = arrayListOf()
        //setHasFixedSize = Untuk mengatur ukuran recycler view
        rv_inspiration.setHasFixedSize(true)
        //kenapa pakai addAll? karena datanya lebih dari 1, nge add semua data
        list.addAll(InspirationData.listData)
        //Untuk membuat tampilan recycler view nya linear (atas bawah)
        rv_inspiration.layoutManager = LinearLayoutManager(this)
        //Buat manggil adapternya
        rv_inspiration.adapter = InspirationListAdapter(list)
    }

    private fun initHeader() {
        //untuk mengambil waktu yang sekarang
        val timeNow = Calendar.getInstance()
        //untuk membuat format jam, ngambil jam nya aja
        val timeFormat = SimpleDateFormat("HH")
        //untuk menampung data yang telah di format
        val time = timeFormat.format(timeNow.time)
        when{
            time.toInt() in 0..6 -> {
                iv_header.setBackgroundResource(R.drawable.bg_header_dashboard_night)
            }
            time.toInt() in 7..12 -> {
                iv_header.setBackgroundResource(R.drawable.bg_header_dashboard_morning)
            }
            time.toInt() in 13..18 -> {
                iv_header.setBackgroundResource(R.drawable.bg_header_dashboard_afternoon)
            }
            time.toInt() in 19..23 -> {
                iv_header.setBackgroundResource(R.drawable.bg_header_dashboard_night)
            }
        }
    }

    private fun initNavMenu() {
        iv_icon_menu_doa.setOnClickListener{
            startActivity(Intent(this, MenuDoaActivity::class.java))
        }
        iv_icon_menu_dzikir.setOnClickListener{
            startActivity(Intent(this, MenuDzikirActivity::class.java))
        }
        iv_icon_menu_jadwal_shalat.setOnClickListener{
            startActivity(Intent(this, MenuJadwalSholatActivity::class.java))
        }
        iv_icon_menu_video_kajian.setOnClickListener{
            startActivity(Intent(this, MenuVideoKajianActivity::class.java))
        }
        iv_icon_menu_zakat.setOnClickListener{
            startActivity(Intent(this, MenuZakatActivity::class.java))
        }

    }
}