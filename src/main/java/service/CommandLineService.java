package service;

import Exeption.ResponseCode;
import Exeption.AddressBookException;

import java.util.Scanner;

public interface CommandLineService {

    static void showMenu() {
        //**  вывод с начального меню на экран*/
        System.out.println("1. Add contact;");
        System.out.println("2. Update contact");
        System.out.println("3. Delete contact");
        System.out.println("4. Show all contacts");
        System.out.println("5. Show contact by id");
        System.out.println("0. Exit");
    }

    static void run(Scanner scanner, ContactService service) {
        //** Обработка меню и вызов методов из слоя Service*/
        boolean exit = false;
        do {
            System.out.println("Chose your wish");
            showMenu();
            try {
                if (scanner.hasNextInt()) {
                    switch (scanner.nextInt()) {
                        case 1: {
                            service.createContact(scanner);
                            break;
                        }
                        case 2: {
                            service.updateContact(scanner);
                            break;
                        }
                        case 3: {
                            service.removeContact(scanner);
                            break;
                        }
                        case 4: {
                            service.showAllContacts(scanner);
                            break;
                        }
                        case 5: {
                            service.findById(scanner);
                            break;
                        }
                        case 0: {
                            System.out.println("Thank you that use our app. Good by");
                            exit = true;
                            break;
                        }
                        default: {
                            throw new AddressBookException(ResponseCode.NOT_FOUND,
                                    "You enter wrong number");
                        }
                    }
                } else {
                    System.out.println("Need enter a number.");
                    scanner.next();
                }
            } catch (AddressBookException e) {
                System.out.println(e.getCode());
                System.out.println(e.getMessage());
            }
        } while (!exit);
    }
}
