package service;

import Exeption.ResponseCode;
import sun.jvm.hotspot.debugger.AddressException;

import java.util.Scanner;

public interface CommandLineService {

  static  void showMenu(){
        System.out.println("Add contact;");
        System.out.println("Update contact");
        System.out.println("Delete contact");
        System.out.println("Show all contacts");
        System.out.println("Show contact by id");
        System.out.println("Exit");
    }
    static void  run(Scanner scanner, ContactService service){
      boolean exit = true;
        do {...} while (exit);
        System.out.println("Chose your wish");
        showMenu();
        if ( scanner.hasNextInt()) {...} else {
            System.out.println("your enter wrong number");
            scanner.next;
        }
        switch (scanner.nextInt())
            case 1:{
                createContact;
        }
        case 2:{
            service.updateContactByld();
        }
        case 3:{
            service.deleteContact;
        }
        case 4:{
            service.showContacts;
        }
        case 5:{
            System.out.println(service.getContact(scanner));
            break;
    }
        case 0:{
            System.out.println("Thak you thet use our app. Good by");
            exit = false;
            break;

}
        default:{
            throw new AddressException(ResponseCode);
        }
        else{
            System.out.println("");
        }
        catch (adressBookExeption e){
            System.out.println(e. getCode());
            System.out.println(e. getCode());
        }
    }
    }
