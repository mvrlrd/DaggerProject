package ru.mvrlrd.daggerproject.colors;

import android.util.Log;
import javax.inject.Inject;
import ru.mvrlrd.daggerproject.App;

public class White {
    private static final String TAG = "White";

    @Inject
    Green green;

    public White() {
        //        Green green = new Green();
        App.getAppComponent().inject(this);
        Log.d(TAG, green.show()+"  "+green);
    }

    public White(Green green) {
        Log.d(TAG, green.show()+"  "+green);
    }
}
