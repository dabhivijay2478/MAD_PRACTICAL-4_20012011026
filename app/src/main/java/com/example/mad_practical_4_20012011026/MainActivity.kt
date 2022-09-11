package com.example.mad_practical_4_20012011026

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.net.Uri

import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore

import android.widget.Button

import com.example.mad_practical_4_20012011026.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonBrowse=findViewById<Button>(R.id.btn1)
        buttonBrowse.setOnClickListener{

            var url_text:String = "www.google.com"
            Intent(Intent.ACTION_VIEW).setData(Uri.parse(url_text)).apply { startActivity(this) }
        }

        var buttonCall = findViewById<Button>(R.id.btn2)
        buttonCall.setOnClickListener{

            Intent(Intent.ACTION_VIEW).setType(ContactsContract.Contacts.CONTENT_TYPE).apply { startActivity(this) }

        }

        var buttonContact = findViewById<Button>(R.id.btn3)
        buttonContact.setOnClickListener{
            Intent(Intent.ACTION_VIEW).setType(ContactsContract.Contacts.CONTENT_TYPE).apply { startActivity(this) }
        }

        var buttonCallLog = findViewById<Button>(R.id.btn4)
        buttonCallLog.setOnClickListener{
            Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).apply { startActivity(this) }
        }

        var buttonGallery = findViewById<Button>(R.id.btn5)
        buttonGallery.setOnClickListener{
            Intent(Intent.ACTION_VIEW).setType("image/*").apply { startActivity(this) }
        }
        var buttonCamera = findViewById<Button>(R.id.btn6)
        buttonCamera.setOnClickListener{
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).apply { startActivity(this) }
        }
        var buttonAlarm = findViewById<Button>(R.id.btn7)
        buttonAlarm.setOnClickListener{
            Intent(AlarmClock.ACTION_SHOW_ALARMS).apply { startActivity(this) }
        }
    }
}