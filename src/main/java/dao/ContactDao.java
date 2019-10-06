package dao;

import entity.Contact;

import java.util.Scanner;

public interface ContactDao {
    //** We create contact*/
    Contact createContact(Contact newContact);
    //** We find contact by id*/
    Contact findById(int id);
    //** We update contact*/
    Contact updateContact(Contact updatedContact);
    //** We delete contact*/
    boolean removeContact(int id, Scanner scanner);
    //** We show contacts*/
    void showAllContacts();
}
