package Exeption;

import entity.Contact;
//**Создаем класс addressBookException для обработки наших исключений */
public class addressBookException extends Exception {
    private ResponseCode code;
    private String message;
    public static final String NOT_FOUND_MESSAGE = "Contact not found";


    public addressBookException(ResponseCode code) {
        this.code = code;
    }

    public addressBookException(ResponseCode code, String message) {
        this.code = code;
        this.message = message;
    }

    public addressBookException() {
        this.code = ResponseCode.NOT_FOUND;
        this.message = NOT_FOUND_MESSAGE;
    }

    public addressBookException(Contact contact) {
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
