package dao.impl;

import dao.ContactDao;
import entity.Contact;

import java.util.*;
public class ContactDaoImpl implements ContactDao {

    private static int generator = 0;

//    private Contact[] contacts = new Contact[10];

    private static List<Contact> contactList = new ArrayList<>();


    @Override
    public Contact createContact(Contact newContact) {
        newContact.setId(++generator);
        contactList.add(newContact);
        System.out.println("New contact is add");
        System.out.println(newContact);
        return newContact;
    }

    @Override
    public Contact findById(int id) {
        for (Contact contact : contactList) {
            if (contact != null && contact.getId() == id) {
                System.out.println(contact);
                return contact;
            }
        }
        System.out.println("Contact with id = " + id + " not found");
        return new Contact();
    }

    @Override
    public boolean removeContact(int id, Scanner scanner) {
        for (Contact contact : contactList) {
            if (contact != null && contact.getId() == id) {
                contactList.remove(contact);
                return true;
            }
        }
        System.out.println("contact with id = " + id + " is not found");
        return false;
    }

    @Override
    public Contact updateContact(Contact updatedContact) {
        for (Contact contactStore : contactList) {
            if (contactStore != null && Objects.equals(contactStore.getId(), updatedContact.getId())) {
                contactStore.setName(updatedContact.getName());
                contactStore.setLastName(updatedContact.getLastname());
                contactStore.setAge(updatedContact.getAge());
                contactStore.setPhoneNumber(updatedContact.getPhoneNumber());
                contactStore.setMarried(updatedContact.isMarried());
                contactStore.setUpdateTime(updatedContact.getUpdateTime());
                System.out.println("Contact was updated");
                System.out.println(contactStore);
                return updatedContact;
            }
        }
        return updatedContact;
    }

    @Override
    public void showAllContacts() {
        for (Contact contact : contactList) {
            if (!Objects.isNull(contact)) {
                System.out.println(contact);
            }
        }
    }


}










