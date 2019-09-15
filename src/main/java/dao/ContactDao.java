package dao;

import entity.Contact;
//** Обозначаем джава методы*/
public interface ContactDao {
    Contact createContact(Contact newContact);

    Contact findById(int id);

    Contact updateContact(Contact updatedContact);

    boolean removeContact(int id);

    void showAllContacts();
}
