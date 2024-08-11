// Custom exception for age validation
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for name validation
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}
