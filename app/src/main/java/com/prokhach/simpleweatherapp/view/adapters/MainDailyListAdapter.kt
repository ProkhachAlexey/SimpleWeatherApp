package com.prokhach.simpleweatherapp.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.prokhach.simpleweatherapp.R
import com.prokhach.simpleweatherapp.databinding.ItemMainDailyBinding

class MainDailyListAdapter : BaseAdapter<MainDailyListAdapter.DailyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyViewHolder {

        val binding = ItemMainDailyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DailyViewHolder(binding)
    }

    inner class DailyViewHolder(private val binding: ItemMainDailyBinding) : BaseViewHolder(binding.root) {

        override fun bindView(position: Int) {
            with(binding) {
                itemDailyDateTv.text = "20 Saturday"
                itemDailyPopTv.text = "80 %"
                itemDailyMaxTempTv.text = "27°"
                itemDailyMinTempTv.text = "13°"
                itemDailyWeatherConditionIcon.setImageResource(R.drawable.ic_sun)
            }
        }
    }
}