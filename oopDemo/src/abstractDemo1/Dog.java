package abstractDemo1;

public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("dog eat bones");
    }

    @Override
    public void swim() {
        System.out.println("dog swims craps");
    }
}
