package com.rku.bdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greetingactivity.*

class BirthdayGreetingactivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greetingactivity)

        val name = intent.getStringExtra(NAME_EXTRA)
        birthdayGreetings.text = "Happy Birthday \n $name!"
    }
}