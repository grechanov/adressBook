package service.Impl;

import dao.ContactDao;
import dao.impl.ContactDaoImpl;
import entity.Contact;
import service.ContactService;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ContactServiceImpl implements ContactService {

    private static final ContactDao contactDao = new ContactDaoImpl();

    public ContactServiceImpl(ContactDaoImpl contactDao) {

    }

    @Override
    public Contact createContact(Scanner scanner) {
        Contact contact = new Contact();
        System.out.println("Enter name of contact:");
        contact.setName(scanner.next());
        System.out.println("Enter last name of contact:");
        contact.setLastName(scanner.next());
        System.out.println("Enter age of contact");
        contact.setAge(scanner.nextInt());
        System.out.println("Enter phone number of contact");
        contact.setPhoneNumber(scanner.next());
        while (true) {
            System.out.println("Is contact married(y/n?)");
            String str = scanner.next();
            if (str.equalsIgnoreCase("y")) {
                contact.setMarried(true);
                break;
            } else if (str.equalsIgnoreCase("n")) {
                contact.setMarried(false);
                break;
            } else {
                System.out.println("Enter only 'y' or 'n'");
            }
        }
        contact.setCreateDate(LocalDateTime.now());
        contact.setUpdateTime(LocalDateTime.now());
        return contactDao.createContact(contact);
    }

    @Override
    public Contact findById(Scanner scanner) {
        while (true) {
            System.out.println("Enter id");
            if (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                return contactDao.findById(id);
            } else {
                System.out.println("You enter wrong id");
                scanner.next();
            }

        }
    }

    @Override
    public Contact updateContact(Scanner scanner) {
        Contact updateContact = new Contact();
        Contact contactStore = findById(scanner);
        if (contactStore.getId() != 0) {
            updateContact.setId(contactStore.getId());
            updateContact.setName(contactStore.getName());
            updateContact.setLastName(contactStore.getLastname());
            updateContact.setAge(contactStore.getAge());
            updateContact.setMarried(contactStore.isMarried());
            updateContact.setPhoneNumber(contactStore.getPhoneNumber());
            updateContact.setUpdateTime(contactStore.getUpdateTime());
            updateContact.setCreateDate(contactStore.getCreateDate());

//            System.out.println(updateContact);

            boolean exit = false;
            do {
                System.out.println("Choose update field: ");
                System.out.println("1. Name");
                System.out.println("2. Last name");
                System.out.println("3. Age");
                System.out.println("4. Married status");
                System.out.println("5. Phone number");
                System.out.println("0. Exit");

                if (scanner.hasNextInt()) {
                    int numberField = scanner.nextInt();
                    switch (numberField) {
                        case 1: {
                            System.out.println("Enter new name:");
                            updateContact.setName(scanner.next());
                            updateContact.setUpdateTime(LocalDateTime.now());
                            break;
                        }
                        case 2: {
                            System.out.println("Enter new Last name:");
                            updateContact.setLastName(scanner.next());
                            updateContact.setUpdateTime(LocalDateTime.now());
                            break;
                        }
                        case 3: {
                            System.out.println("Enter new Age:");
                            updateContact.setAge(scanner.nextInt());
                            updateContact.setUpdateTime(LocalDateTime.now());
                            break;
                        }
                        case 4: {
                            System.out.println("Is contact married (y/n?):");
                            updateContact.setMarried(scanner.next().equalsIgnoreCase("y"));
                            updateContact.setUpdateTime(LocalDateTime.now());
                            break;
                        }
                        case 5: {
                            System.out.println("Enter new phone number:");
                            updateContact.setPhoneNumber(scanner.next());
                            updateContact.setUpdateTime(LocalDateTime.now());
                            break;
                        }
                        case 0: {
                            contactDao.updateContact(updateContact);
                            exit = true;
                            break;
                        }
                        default: {
                            System.out.println("You enter wrong number of field");
                            break;
                        }
                    }
                } else {
                    System.out.println("You enter wrong number of field");
                    scanner.next();
                }

            } while (!exit);
        }
        return updateContact;

    }

    @Override
    public boolean removeContact(Scanner scanner) {
        Contact contact = findById(scanner);
        if (contact.getId() != 0) {
            while (true) {
                System.out.println("If you really want to delete this contact (y/n):");
                String str = scanner.next();
                if (str.equalsIgnoreCase("y")) {
                    contactDao.removeContact(contact.getId(), scanner);
                    System.out.println("contact delete successfully");
                    return true;
                } else if (str.equalsIgnoreCase("n")) {
                    System.out.println("delete cancelled");
                    return false;
                } else {
                    System.out.println("Enter only 'y' or 'n'");
                }
            }
        }
        return false;
    }

    @Override
    public void showAllContacts(Scanner scanner) {
        contactDao.showAllContacts();
    }
}

