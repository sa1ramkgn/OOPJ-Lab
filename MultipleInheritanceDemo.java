interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {

  public void showFather() {
        System.out.println("This is Father method.");
    }

    public void showMother() {
        System.out.println("This is Mother method.");
    }

    void showChild() {
        System.out.println("This is Child method.");
    }
 }
 
public class MultipleInheritanceDemo {
    public static void main(String[] args) {

        Child obj = new Child();

        obj.showFather();
        obj.showMother();
        obj.showChild();
    }
}