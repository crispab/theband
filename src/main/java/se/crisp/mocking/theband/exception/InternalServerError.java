package se.crisp.mocking.theband.exception;

public class InternalServerError extends RuntimeException {
    public InternalServerError(String message) {
        super("Internal server error: " + message);
    }
}
