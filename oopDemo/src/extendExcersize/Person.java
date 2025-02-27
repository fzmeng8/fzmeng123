package extendExcersize;

public class Person {
    private String id;
    private String name;
    private double salary;

    public Person() {
    }

    public Person(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void work() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void eat() {
        System.out.println("Eating...");
    }
}
