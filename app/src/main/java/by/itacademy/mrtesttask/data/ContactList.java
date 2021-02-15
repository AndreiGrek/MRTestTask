package by.itacademy.mrtesttask.data;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import by.itacademy.mrtesttask.model.Contact;

public class ContactList {
    private ContactList() {
    }

    public static List<Contact> getList() {
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Аркадий", "Аркадьевич", "Паровозов", "ЖД Вокзал", 3924857));
        contactList.add(new Contact("Геннадий", "Платонович", "Букин", "ООО Ромашка", 4829483));
        contactList.add(new Contact("Иосиф", "Виссарионович", "Сталин", "Кремль", 3765829));
        contactList.add(new Contact("Владимир", "Ильич", "Ленин", "Мавзолей", 4930200));
        contactList.add(new Contact("Александр", "Сергеевич", "Пушкин", "Фриланс", 3987627));
        contactList.add(new Contact("Владимир", "Вольфович", "Жириновский", "ЛДПР", 2828484));
        Log.d("mytag", String.format("create list %s", contactList.size()));
        return contactList;
    }
}
