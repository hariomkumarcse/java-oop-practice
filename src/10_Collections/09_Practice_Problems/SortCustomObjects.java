import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

    private int id;
    private String name;
    private int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class SortCustomObjects {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Hariom", 88));
        students.add(new Student(102, "Rahul", 72));
        students.add(new Student(103, "Aman", 95));

        Collections.sort(students, Comparator.comparing(Student::getMarks));

        System.out.println("Students Sorted by Marks:");

        for(Student student : students) {
            System.out.println(student);
        }
    }
}