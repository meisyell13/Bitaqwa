package com.meisyell.bitaqwa.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.meisyell.bitaqwa.R
import com.meisyell.bitaqwa.dashboard.adapter.InspirationListAdapter
import com.meisyell.bitaqwa.dashboard.data.InspirationData
import com.meisyell.bitaqwa.dashboard.model.InspirationModel
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

    private fun initRecyclerViewInspiration() {
        val list: ArrayList<InspirationModel> = arrayListOf()
        rv_inspiration.setHasFixedSize(true)
        list.addAll(InspirationData.listData)
        rv_inspiration.layoutManager = LinearLayoutManager(this)
        val listInspirationAdapter = InspirationListAdapter(list)
        rv_inspiration.adapter = listInspirationAdapter
    }

    private fun initHeader() {
        val timeNow = Calendar.getInstance()
        val timeFormat = SimpleDateFormat("HH")
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

    }
}