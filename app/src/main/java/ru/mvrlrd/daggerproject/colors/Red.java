package ru.mvrlrd.daggerproject.colors;

import android.util.Log;
import javax.inject.Inject;
import ru.mvrlrd.daggerproject.App;

public class Red {
    private static final String TAG = "RED";

    @Inject
    Green green;

    public Red() {
//        Green green = new Green();
        App.getAppComponent().inject(this);
        Log.d(TAG, green.show()+"  "+ green);
    }

    public Red(Green green) {
        Log.d(TAG, green.show()+"  "+ green);
    }
}
