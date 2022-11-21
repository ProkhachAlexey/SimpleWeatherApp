package com.prokhach.simpleweatherapp.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.prokhach.simpleweatherapp.R
import com.prokhach.simpleweatherapp.business.model.HourlyWeatherModel
import com.prokhach.simpleweatherapp.databinding.ItemMainHourlyBinding


class MainHourlyListAdapter : BaseAdapter<HourlyWeatherModel>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HourlyViewHolder {

        val binding = ItemMainHourlyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HourlyViewHolder(binding)
    }

    inner class HourlyViewHolder(private val binding: ItemMainHourlyBinding) : BaseViewHolder(binding.root) {

        override fun bindView(position: Int) {
            with(binding) {
                itemHourlyTimeTv.text = "14.00"
                itemHourlyTempTv.text = "14\u00b0"
                itemHourlyPopTv.text = "30 %"
                itemHourlyWeatherConditionIcon.setImageResource(R.drawable.ic_sun)
            }
        }
    }
}