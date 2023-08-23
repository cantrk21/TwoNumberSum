package com.canturk.twonumbersum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.canturk.twonumbersum.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //  setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        /*var sayi = 5

        var sayi2 = "5"
        var sayi3 = 4
        var sum = sayi2.toInt() + sayi3

        binding.textView.text = sum.toString()*/


        binding.btnKaydet.setOnClickListener {
            var sayi1= binding.editTextNumber1.text.toString().toInt()
            var sayi2= binding.editTextNumber2.text.toString().toInt()

            var sum = sayi1+sayi2

            binding.textView.text = sum.toString()
        }


    }
}