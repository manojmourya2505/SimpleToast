package com.inouiw.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

public class SplashModule {

    public static void printToast(Activity activity, String values, boolean Long) {

        if (Long == true) {

            Toast.makeText(activity, "" + values, Toast.LENGTH_LONG).show();

        } else {

            Toast.makeText(activity, "" + values, Toast.LENGTH_SHORT).show();

        }

    }
}


