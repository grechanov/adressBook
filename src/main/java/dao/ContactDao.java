package dao;

import entity.Contact;

public interface ContactDao {
    Contact createContact(Contact newContact);

    Contact findById(int id);

    Contact updateContact(Contact updatedContact);

    boolean removeContact(int id);

    void ShowAllContacts();
}
