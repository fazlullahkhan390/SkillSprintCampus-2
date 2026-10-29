package com.example.ecotrack;

import android.app.Activity;
import android.content.Intent;
import android.util.Patterns;
import android.widget.Toast;

public class Base {
    static String email = "";
    static String name = "Campus Explorer";
    static String password = "Green123";

    static void go(Activity activity, Class<?> cls) {
        activity.startActivity(new Intent(activity, cls));
    }

    static boolean validEmail(String email) {
        return email != null && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    static void toast(Activity activity, String message) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show();
    }
}
