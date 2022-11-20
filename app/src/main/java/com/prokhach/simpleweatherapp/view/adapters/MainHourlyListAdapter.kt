package com.prokhach.simpleweatherapp.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prokhach.simpleweatherapp.R

class MainHourlyListAdapter : RecyclerView.Adapter<MainHourlyListAdapter.HourlyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HourlyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main_hourly, parent, false)
        return HourlyViewHolder(view)
    }

    override fun onBindViewHolder(holder: HourlyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }

    inner class HourlyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}