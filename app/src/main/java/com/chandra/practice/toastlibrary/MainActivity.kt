package com.chandra.practice.toastlibrary

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.chandra.practice.toast.CustomToast
import com.chandra.practice.toast.ToastResources
import com.chandra.practice.toast.ToastType
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v , insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left , systemBars.top , systemBars.right , systemBars.bottom)
            insets
        }
        val btnSuccess = findViewById<MaterialButton>(R.id.btnSuccess)
        btnSuccess.setOnClickListener {
            CustomToast.successToast(
                    this ,
                    "Success !" ,
                    "Profile Created Successfully " ,
                    ToastType.SUCCESS ,
                    ToastResources.LONG_DURATION
                                    )
        }
        val btnFailed = findViewById<MaterialButton>(R.id.btnFailed)
        btnFailed.setOnClickListener {
            CustomToast.successToast(
                    this ,
                    "Failed !" ,
                    "Profile Update Failed !! " ,
                    ToastType.ERROR ,
                    ToastResources.LONG_DURATION
                                    )
        }

        val btnWarning = findViewById<MaterialButton>(R.id.btnWarning)
        btnWarning.setOnClickListener {
            CustomToast.successToast(
                    this ,
                    "Warning !" ,
                    "Please Add Profile Details " ,
                    ToastType.WARNING,
                    ToastResources.LONG_DURATION
                                    )
        }
        val btnInfo = findViewById<MaterialButton>(R.id.btnInfo)
        btnInfo.setOnClickListener {
            CustomToast.successToast(
                    this ,
                    "Information !" ,
                    "Profile Information Fetched !! " ,
                    ToastType.INFO ,
                    ToastResources.LONG_DURATION
                                    )
        }
        val btnRemove = findViewById<MaterialButton>(R.id.btnRemove)
        btnRemove.setOnClickListener {
            CustomToast.successToast(
                    this ,
                    "Delete Record !" ,
                    "Profile Deleted Successfully !! " ,
                    ToastType.DELETE ,
                    ToastResources.LONG_DURATION
                                    )
        }
    }
}