package service.Impl;

import dao.ContactDao;
import entity.Contact;
import service.ContactService;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ContactServiceImpl implements ContactService {
    private  static  final  ContactDao = new ContactDaoImpl();
    private  static Scanner scanner = new Scanner(System.in );

    public Contact createContact() {
        Contact contact = new Contact();
        System.out.println("Enter name of contact:");
        contact.setName(scanner.next());
        System.out.println("Enter age of contact");
        contact.setAge(scanner.next());
        System.out.println("Enter phone number of contact");
        contact.setPhoneNumber(scanner.next);
        System.out.println("Is contact married(y/n?)");
        contact.setCreateDate(LocalDateTime.now());
        contact.setUpdateTime(LocalDateTime.now);
        return contactDao.create;
    }

    public Contact findById(int id) {
        return null;
    }

    public Contact updateContact(Contact updatedContact) {
        return null;
    }

    public boolean removeContact(int id) {
        return false;
    }

    public void ShowAllContacts() {

    }
}
