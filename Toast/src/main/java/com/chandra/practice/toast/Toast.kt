package com.chandra.practice.toast

import android.content.Context
import android.view.LayoutInflater
import com.google.android.material.textview.MaterialTextView
import android.widget.Toast

class ToastNew(context : Context) {

    private val inflater = LayoutInflater.from(context)
    private val view = inflater.inflate(R.layout.layout_toast , null)

    fun successToast(context : Context , message : String) {
        val textView = view.findViewById<MaterialTextView>(R.id.toast)
        textView.text = message
        // Create and show the Toast
        val toast = Toast(context)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = view
        toast.show()
    }
}