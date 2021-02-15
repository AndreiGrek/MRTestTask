package by.itacademy.mrtesttask.di;

import javax.inject.Singleton;
import by.itacademy.mrtesttask.presenter.MainActivityPresenterImpl;
import by.itacademy.mrtesttask.view.MainActivity;
import dagger.Component;

@Component(modules = {UtilsModule.class, DataModule.class, AppModule.class})
@Singleton
public interface MainActivityPresenterComponent {
    void inject(MainActivityPresenterImpl mainActivityPresenterImpl);

    void inject(MainActivity mainActivity);
}
