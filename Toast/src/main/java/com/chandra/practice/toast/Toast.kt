package com.chandra.practice.toast

import android.content.Context
import android.view.LayoutInflater
import com.google.android.material.textview.MaterialTextView
import android.widget.Toast

class ToastNew(context: Context) {

    private val inflater = LayoutInflater.from(context)
    private val layout = inflater.inflate(R.layout.layout_toast, null)

    fun successToast(context: Context, message: String) {
        val textView = layout.findViewById<MaterialTextView>(R.id.toast)
        textView.text = message

        // Create and show the Toast
        val toast = Toast(context).apply {
            duration = Toast.LENGTH_SHORT
            // Set the custom layout directly
            setView(layout) // This is a direct method, not the deprecated setter.
        }
        toast.show()
    }
}
