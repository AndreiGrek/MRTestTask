package by.itacademy.mrtesttask.data;

import java.util.List;
import by.itacademy.mrtesttask.model.Contact;
import io.reactivex.Observable;

public interface DataRepository {
    void insertContacts();

    Observable<List<Contact>> getContacts();
}
