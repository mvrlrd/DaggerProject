package ru.mvrlrd.daggerproject.noDi;

import android.util.Log;

 class Red {
    private static final String TAG = "RED";

     Red() {
        Green green = new Green();
        Log.d(TAG, green.show()+"  "+ green);
    }
}
