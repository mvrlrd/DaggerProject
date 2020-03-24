package ru.mvrlrd.daggerproject.daggerStaff;

import javax.inject.Singleton;

import dagger.Component;
import ru.mvrlrd.daggerproject.activities.DaggerActivity;
import ru.mvrlrd.daggerproject.colors.Red;
import ru.mvrlrd.daggerproject.colors.White;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void injectActivity(DaggerActivity daggerActivity);
    void inject(Red red);
    void inject(White white);
}
