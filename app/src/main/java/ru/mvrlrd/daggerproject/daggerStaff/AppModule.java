package ru.mvrlrd.daggerproject.daggerStaff;

import android.app.Application;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import ru.mvrlrd.daggerproject.colors.Green;

@Module
public class AppModule {

    private final Application application;

    public AppModule(Application application){
        this.application = application;
    }

    @Singleton
    @Provides
    Green provideOne(){
        return new Green();
    }

}
