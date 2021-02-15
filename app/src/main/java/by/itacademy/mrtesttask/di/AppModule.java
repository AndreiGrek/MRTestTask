package by.itacademy.mrtesttask.di;

import android.content.Context;
import androidx.annotation.NonNull;
import javax.inject.Singleton;
import by.itacademy.mrtesttask.presenter.MainActivityPresenter;
import by.itacademy.mrtesttask.presenter.MainActivityPresenterImpl;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module(includes = AppModule.PresenterModule.class)
public class AppModule {
    private Context appContext;

    public AppModule(@NonNull Context context) {
        appContext = context;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return appContext;
    }

    @Module
    public interface PresenterModule {
        @Binds
        MainActivityPresenter mainActivityPresenter(MainActivityPresenterImpl mainActivityPresenter);
    }
}
