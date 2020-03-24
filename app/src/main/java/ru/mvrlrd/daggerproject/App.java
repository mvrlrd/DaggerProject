package ru.mvrlrd.daggerproject;

import android.app.Application;
import ru.mvrlrd.daggerproject.daggerStaff.AppComponent;
import ru.mvrlrd.daggerproject.daggerStaff.AppModule;
import ru.mvrlrd.daggerproject.daggerStaff.DaggerAppComponent;

public class App extends Application {
    private  static AppComponent appComponent;

    @Override
    public void onCreate(){
        super.onCreate();
        appComponent = generateAppComponent();
    }
    public static AppComponent getAppComponent(){
        return appComponent;
    }
    public AppComponent generateAppComponent(){
        return DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }
}
