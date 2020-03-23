package ru.mvrlrd.daggerproject.noDi;

import android.util.Log;

 class White {
    private static final String TAG = "White";

    White() {
        Green green = new Green();
        Log.d(TAG, green.show()+"  "+green);
    }
}
