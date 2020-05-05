package com.inouiw.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

public class SplashModule {

    public static void printToast(Activity activity, String value, boolean Long) {

        if (Long == true) {

            Toast.makeText(activity, "" + value, Toast.LENGTH_LONG).show();

        } else {

            Toast.makeText(activity, "" + value, Toast.LENGTH_SHORT).show();

        }

    }
}


