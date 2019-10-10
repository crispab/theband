package se.crisp.mocking.theband.exception;

public class ConflictExecption extends RuntimeException {
    public ConflictExecption(String message) {
        super("Conflict " + message);
    }
}
