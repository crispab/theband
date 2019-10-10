package se.crisp.mocking.theband.exception;

public class UnAuthorizedException extends RuntimeException {
    public UnAuthorizedException(String message) {
        super("Unauthorized: " + message);
    }
}
