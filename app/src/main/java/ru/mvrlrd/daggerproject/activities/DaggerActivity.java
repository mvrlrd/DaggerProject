package ru.mvrlrd.daggerproject.activities;

import androidx.appcompat.app.AppCompatActivity;
import ru.mvrlrd.daggerproject.R;
import ru.mvrlrd.daggerproject.colors.Red;
import ru.mvrlrd.daggerproject.colors.White;
import ru.mvrlrd.daggerproject.App;
import android.os.Bundle;

//Создать DaggerActivity. Решить 1ое задание с применение dagger
public class DaggerActivity extends AppCompatActivity {
    //todo declare App in the manifest

    private static final String TAG = "DaggerActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getAppComponent().injectActivity(this);

        White white = new White();
        Red red = new Red();
    }
}
