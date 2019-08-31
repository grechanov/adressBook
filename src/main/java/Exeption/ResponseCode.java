package Exeption;

public enum ResponseCode {
    NOT_FOUND(404),
    CONFLICT(409);

    private int code;

    ResponseCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }


    public String getMessege() {
        return getMessege();
    }
}
