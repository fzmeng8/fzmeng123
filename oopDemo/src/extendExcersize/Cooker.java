package extendExcersize;

public class Cooker extends Person {
    public Cooker() {}

    public Cooker(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("I am cooking");
    }
}
