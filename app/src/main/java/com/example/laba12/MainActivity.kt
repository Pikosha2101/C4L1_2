package com.example.laba12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import com.example.laba12.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //связь макета с активити
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val user = User(name = ObservableField("Василий Петров"), age = ObservableField("22"))
        binding.user = user

        binding.clicker = View.OnClickListener{
            Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show()
            user.name = ObservableField("Петр Васильев")
            user.age = ObservableField("38")
            binding.user = user //обновление ui
        }
    }
}