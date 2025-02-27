package abstractDemo1;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("a",1);
        System.out.println(f.getName() + " " + f.getAge());
        f.swim();
        f.eat();
    }
}
