package ua.epam.shop.dao;

public class SQLRuntimeException extends RuntimeException{
    public SQLRuntimeException() {
    }

    public SQLRuntimeException(String message) {
        super(message);
    }

    public SQLRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public SQLRuntimeException(Throwable cause) {
        super(cause);
    }
}
