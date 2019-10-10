package se.crisp.mocking.theband.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super("Not Found: " + message);
    }
}
