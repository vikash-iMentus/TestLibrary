package com.example.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void showingToast(Context c, String message){

        Toast.makeText(c, message, Toast.LENGTH_LONG).show();

    }
}
