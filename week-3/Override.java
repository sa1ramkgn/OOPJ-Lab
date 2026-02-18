// Superclass A
class A {
    int i, j; // instance variables

    // Parameterized constructor
    A(int a, int b) {
        i = a;
        j = b;
    }

    // Method to display i and j
    void show() {
        System.out.println("i = " + i + ", j = " + j);
    }
}

// Subclass B extending A
class B extends A {
    int k; // subclass variable

    // Parameterized constructor
    B(int a, int b, int c) {
        super(a, b); // initialize i and j using superclass constructor
        k = c;       // initialize subclass variable
    }

    // Overridden show() method
    @Override
    void show() {
        System.out.println("k = " + k);
    }
}

// Main class
public class Override {
    public static void main(String[] args) {
        // Create object of subclass B with three integer values
        B subOb = new B(10, 20, 30);

        // Call the overridden show() method
        subOb.show();
    }
}
