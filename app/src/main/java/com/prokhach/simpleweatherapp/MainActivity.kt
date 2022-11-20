package com.prokhach.simpleweatherapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.prokhach.simpleweatherapp.databinding.ActivityMainBinding
import com.prokhach.simpleweatherapp.view.adapters.MainDailyListAdapter
import com.prokhach.simpleweatherapp.view.adapters.MainHourlyListAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        initViews()

        binding.mainHourlyList.apply {
            adapter = MainHourlyListAdapter()
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
        }

        binding.mainDailyList.apply {
            adapter = MainDailyListAdapter()
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            setHasFixedSize(true)
        }
    }

    private fun initViews() {
        with(binding) {
            mainCityNameTv.text = "Moscow"
            mainDateTv.text = "1 april"
            mainWeatherConditionIcon.setImageResource(R.drawable.ic_sun)
            mainTemp.text = "25\u00b0"
            mainWeatherConditionDescription.text = "Clear sky"
            mainTempMinTv.text = "19"
            mainTempMaxTv.text = "25"
            mainWeatherImage.setImageResource(R.mipmap.cloud3x)
            mainPressureMuTv.text = "1023 hPa"
            mainHumidityMuTv.text = "88 %"
            mainWindSpeedMuTv.text = "5 m/s"
            mainSunriseMuTv.text = "04.30"
            mainSunsetMuTv.text = "22.30"
        }
    }
}
