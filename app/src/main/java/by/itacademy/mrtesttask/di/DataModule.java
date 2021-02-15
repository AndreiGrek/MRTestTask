package by.itacademy.mrtesttask.di;

import android.content.Context;
import androidx.room.Room;
import javax.inject.Singleton;
import by.itacademy.mrtesttask.data.ContactDao;
import by.itacademy.mrtesttask.data.ContactDatabase;
import by.itacademy.mrtesttask.data.DataRepository;
import by.itacademy.mrtesttask.data.DataRepositoryImpl;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module (includes = {DataModule.PresenterModule.class})
public class DataModule {
    @Provides
    @Singleton
    ContactDatabase providerContactDatabase(Context context) {
        return Room.databaseBuilder(context, ContactDatabase.class, "db")
                .build();
    }

    @Provides
    @Singleton
    ContactDao providerContactDao(ContactDatabase db) {
        return db.contactDao();
    }
    @Module
    public interface PresenterModule {
        @Binds
        @Singleton
        DataRepository dataRepository(DataRepositoryImpl dataRepository);
    }
}
