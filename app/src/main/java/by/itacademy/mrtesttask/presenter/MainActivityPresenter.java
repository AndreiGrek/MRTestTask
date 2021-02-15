package by.itacademy.mrtesttask.presenter;

import androidx.appcompat.widget.SearchView;

public interface MainActivityPresenter {
    void insertContacts();

    void setOnChangeListener(SearchView searchView);

    void getContacts();

    void sortContact();

    void closeDisposable();
}
