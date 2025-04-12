package com.chandra.practice.toast

import android.content.Context
import android.view.LayoutInflater
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.cardview.widget.CardView
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
        val materialCardView = layout.findViewById<CardView>(R.id.cardView)
        val cardView = layout.findViewById<CardView>(R.id.ivCardView)
        val linearLayout = layout.findViewById<LinearLayout>(R.id.linearLayout)
        textView.text = message
        tvMessage.text = description
        //To find the Toast Add the Respective Icon and Bg color
        when (toastType) {
            ToastType.SUCCESS -> {
                setImageResourceIcon(
                        context ,
                        imageIcon ,
                        materialCardView ,
                        R.drawable.ic_check ,
                        R.color.success_bg_color,
                        cardView,
                        linearLayout
                                    )
            }

            ToastType.ERROR -> {
                setImageResourceIcon(
                        context ,
                        imageIcon ,
                        materialCardView ,
                        R.drawable.ic_warning ,
                        R.color.error_bg_color,
                        cardView,
                        linearLayout
                                    )
            }

            ToastType.WARNING -> {
                setImageResourceIcon(
                        context ,
                        imageIcon ,
                        materialCardView ,
                        R.drawable.ic_warning_triangle ,
                        R.color.warning_bg_color,
                        cardView,
                        linearLayout
                                    )
            }

            ToastType.INFO -> {
                setImageResourceIcon(
                        context ,
                        imageIcon ,
                        materialCardView ,
                        R.drawable.ic_information ,
                        R.color.info_bg_color,
                        cardView,
                        linearLayout
                                    )
            }

            ToastType.DELETE -> {
                setImageResourceIcon(
                        context ,
                        imageIcon ,
                        materialCardView ,
                        R.drawable.ic_delete ,
                        R.color.delete_bg_color,
                        cardView,
                        linearLayout
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
        cardView : CardView ,
        imageResource : Int ,
        resourceColor : Int ,
        animationCardView : CardView ,
        linearLayout : LinearLayout,

                                    ) {
        imageView.setImageResource(imageResource)
        //cardView.strokeColor = context.getColor(resourceColor)
        cardView.setCardBackgroundColor(context.getColor(resourceColor))
        linearLayout.setBackgroundColor(context.getColor(resourceColor))
        //Animation
        setImageAnimation(context,animationCardView)
    }

    private fun setImageAnimation(context :Context ,animationCardView: CardView) {
        // Pulse Animation for Icon
        val pulseAnimation = AnimationUtils.loadAnimation(context, R.anim.pulse)
        animationCardView.startAnimation(pulseAnimation)
    }

}

