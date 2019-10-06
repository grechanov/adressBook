package Exeption;

import entity.Contact;
public class AddressBookException extends Exception {
    private ResponseCode code;
    private String message;
    public static final String NOT_FOUND_MESSAGE = "Contact not found";


    public AddressBookException(ResponseCode code) {
        this.code = code;
    }

    public AddressBookException(ResponseCode code, String message) {
        this.code = code;
        this.message = message;
    }

    public AddressBookException() {
        this.code = ResponseCode.NOT_FOUND;
        this.message = NOT_FOUND_MESSAGE;
    }

    public AddressBookException(Contact contact) {
        System.out.println("Contact is present with ID " + contact);
    }

    public ResponseCode getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
