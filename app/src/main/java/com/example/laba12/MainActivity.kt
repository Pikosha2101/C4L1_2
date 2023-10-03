package com.example.laba12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.laba12.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val user = User("Василий Петров", "22")
        binding.user = user

        binding.clicker = View.OnClickListener{
            Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show()
            user.name = "Петр Васильев"
            user.age = "38"
            binding.user = user
        }
    }
}