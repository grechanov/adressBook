package service.Impl;

import dao.impl.ContactDaoImpl;

import java.util.Scanner;

public interface CommandLinServiceImpl {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ContactService service = new CommandLinServiceImpl(new ContactDaoImpl());
 //   public  static
}
public class ContactDaoImpl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner();
        String s = scanner.nextLine();
        System.out.println(s);
    }
}