package abstractDemo2;

public class Person {
    private String name;
    private int age;

    public Person() {
    }
    public Person(String name, int age) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
//                                      Person(name, age)
//                                            |
//                      -------------------------------------------------
//                      |                                               |
//                  Sporter(study)                                  Coach(teach)
//