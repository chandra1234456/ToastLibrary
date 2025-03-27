package com.chandra.practice.toast

import android.animation.ValueAnimator
import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.card.MaterialCardView
import com.google.android.material.textview.MaterialTextView


/**
 * Custom Toast Creation
 */
object CustomToast {

    fun successToast(
        context : Context ,
        message : String ,
        description : String ,
        toastType : ToastType ,
        toastDuration : Long ,
                    ) {
        val inflater = LayoutInflater.from(context)
        val layout = inflater.inflate(R.layout.layout_toast , null)
        val textView = layout.findViewById<MaterialTextView>(R.id.toastTitle)
        val tvMessage = layout.findViewById<MaterialTextView>(R.id.toastMessage)
        val imageIcon = layout.findViewById<ImageView>(R.id.ivToastIcon)
        val materialCardView = layout.findViewById<MaterialCardView>(R.id.cardView)
        textView.text = message
        tvMessage.text = description
        //To find the Toast Add the Respective Icon and Bg color
        when (toastType) {
            ToastType.SUCCESS -> {
                setImageResourceIcon(
                        context ,
                        imageIcon ,
                        materialCardView ,
                        R.drawable.ic_check_circle ,
                        R.color.red
                                    )
            }

            ToastType.ERROR -> {
                setImageResourceIcon(
                        context ,
                        imageIcon ,
                        materialCardView ,
                        R.drawable.ic_warning ,
                        R.color.red
                                    )
            }

            ToastType.WARNING -> {
                setImageResourceIcon(
                        context ,
                        imageIcon ,
                        materialCardView ,
                        R.drawable.ic_warning_triangle ,
                        R.color.red
                                    )
            }

            ToastType.INFO -> {
                setImageResourceIcon(
                        context ,
                        imageIcon ,
                        materialCardView ,
                        R.drawable.ic_information ,
                        R.color.red
                                    )
            }

            ToastType.DELETE -> {
                setImageResourceIcon(
                        context ,
                        imageIcon ,
                        materialCardView ,
                        R.drawable.ic_delete ,
                        R.color.red
                                    )
            }
        }

        // Create and show the Toast
        val toast = Toast(context).apply {
            duration = toastDuration.toInt()
            // Set the custom layout directly
            setView(layout) // This is a direct method, not the deprecated setter.
        }
        toast.show()
    }

    private fun setImageResourceIcon(
        context : Context ,
        imageView : ImageView ,
        cardView : MaterialCardView ,
        imageResource : Int ,
        resourceColor : Int ,
                                    ) {
        imageView.setImageResource(imageResource)
        cardView.strokeColor = context.getColor(resourceColor)
        cardView.setBackgroundColor(context.getColor(resourceColor))
        //Animation
        setImageAnimation(imageView)
    }

    private fun setImageAnimation(imageView : ImageView) {
        val anim = ValueAnimator.ofFloat(1f , 1.5f)
        anim.setDuration(3000)
        anim.addUpdateListener { animation ->
            imageView.scaleX = animation.animatedValue as Float
            imageView.scaleY = animation.animatedValue as Float
        }
        anim.repeatCount = 1
        anim.repeatMode = ValueAnimator.REVERSE
        anim.start()


    }
}

