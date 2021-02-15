package by.itacademy.mrtesttask.di;

import android.content.Context;
import javax.inject.Singleton;
import by.itacademy.mrtesttask.utils.Filter;
import by.itacademy.mrtesttask.utils.ItemAdapter;
import dagger.Module;
import dagger.Provides;

@Module
public class UtilsModule {
    @Provides
    @Singleton
    Filter providerFilter() {
        return new Filter();
    }

    @Provides
    @Singleton
    ItemAdapter providerItemAdapter(Context context) {
        return new ItemAdapter(context);
    }
}
