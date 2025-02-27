package extendExcersize;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("001","a",1000.1,2000.1);
        System.out.println(m.getId() + " " + m.getName() + " " + m.getSalary() + " " + m.getBonus());

        Cooker c = new Cooker("002","b",2000.2);
        System.out.println(c.getId() + " " + c.getName() + " " + c.getSalary());
    }
}
