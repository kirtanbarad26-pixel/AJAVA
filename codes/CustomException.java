class InvalidMarksException extends Exception {

    InvalidMarksException(String message) {
        super(message);
    }
}

public class CustomException extends Exception {

    InvalidMarksException(String message) {
        super(message);
    }
}

public class {

    static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0) {
            throw new InvalidMarksException("Marks cannot be negative");
        } else if (marks > 100) {
            throw new InvalidMarksException("Marks cannot be greater than 100");
        } else {
            System.out.println("Marks are valid: " + marks);
        }
    }

    public static void main(String[] args) {
        try {
            checkMarks(-5);   // change value to test
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}
