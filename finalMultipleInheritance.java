// Base class: Student
  final class Student {
    int rollNumber;

    final void getNumber(int n) {
        rollNumber = n;
    }

    void printNumber() {
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Derived class: Test (extends Student)
class Test extends Student {
    float part1, part2;

    void getMarks(float a, float b) {
        part1 = a;
        part2 = b;
    }

    void putMarks() {
        System.out.println("Marks obtained:");
        System.out.println("Part1 = " + part1);
        System.out.println("Part2 = " + part2);
    }
}

// Sports interface
interface Sports {
    float sportwt = 6.0f; // sports weightage

    void putwt();
}

// Results class inherits Test and implements Sports
class Results extends Test implements Sports {
    public void putwt() {
        System.out.println("Sports Marks = " + sportwt);
    }

    void display() {
        float total = part1 + part2 + sportwt;
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Score = " + total);
    }
}

// Main class
public class finalMultipleInheritance {
    public static void main(String[] args) {
        Results studentResult = new Results();

        // Assign roll number
        studentResult.getNumber(101);
        studentResult.printNumber();

        // Assign marks
        studentResult.getMarks(75.5f, 85.2f);
        studentResult.putMarks();

        // Display sports marks
        studentResult.putwt();

        // Display total marks
        studentResult.display();
    }
}
