package ru.mvrlrd.daggerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//Создать NoDiActivity, классы Red, White, Green.
// В классе Green есть метод show, который возвращает строчку “green”.
// Классы Red и White в конструкторе выводят в log эту строчку.
// Решить без применения di и dagger. Вывести в log объекты этих классов

//Создать DiActivity. Решить 1ое задание с применение di, но без dagger.

//Создать DaggerActivity. Решить 1ое задание с применение dagger

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
