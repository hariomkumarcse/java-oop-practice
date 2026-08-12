class InvalidMarksException extends Exception {

    InvalidMarksException(String message) {
        super(message);
    }
}

class Student {

    private String name;
    private int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void validateMarks() throws InvalidMarksException {

        if (marks < 0 || marks > 100) {

            throw new InvalidMarksException(
                    "Marks must be between 0 and 100."
            );
        }
    }

    void displayResult() throws InvalidMarksException {

        validateMarks();

        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);

        if (marks >= 40) {

            System.out.println("Result: PASS");

        } else {

            System.out.println("Result: FAIL");
        }
    }
}

public class StudentResultSystem {

    public static void main(String[] args) {

        Student student1 = new Student("Hariom", 85);

        try {

            student1.displayResult();

        } catch (InvalidMarksException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}