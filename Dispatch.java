// Base class A
  class A {
    void callme() {
        System.out.println("Inside callme() of class A");
    }
}

// Subclass B extending A
class B extends A {
    @Override
    void callme() {
        System.out.println("Inside callme() of class B");
    }
}

// Subclass C extending A
class C extends A {
    @Override
    void callme() {
        System.out.println("Inside callme() of class C");
    }

    void callme1() {
        System.out.println("Inside callme1() of class C");
    }
}

// Main class
public class Dispatch {
    public static void main(String[] args) {
        A a = new A();   // object of class A
        B b = new B();   // object of class B
        C c = new C();   // object of class C

        A r; // reference variable of type A

        r = a; // r refers to object of class A
        r.callme(); // invokes A's version

        r = b; // r refers to object of class B
        r.callme(); // invokes B's version

        r = c; // r refers to object of class C
        r.callme(); // invokes C's version
    }
}


