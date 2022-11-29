package com.example.kotlinlib

import android.content.Context
import android.widget.Toast


class ToasterClass {
    companion object {
        fun toastMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}