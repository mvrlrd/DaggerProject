package ru.mvrlrd.daggerproject.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import ru.mvrlrd.daggerproject.R;
import ru.mvrlrd.daggerproject.colors.Green;
import ru.mvrlrd.daggerproject.colors.Red;
import ru.mvrlrd.daggerproject.colors.White;

//Создать DiActivity. Решить 1ое задание с применение di, но без dagger.
public class DiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Green green = new Green();
        White white = new White(green);
        Red red = new Red(green);
    }
}

