package extendDemo;

public class SharPei extends Dog{
    @Override
    public void eat() {
        super.eat();
        System.out.println("SharPei eat bones");
    }
}
