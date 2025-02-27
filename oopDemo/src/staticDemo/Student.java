package staticDemo;

public class Student {
    private String name;
    private int age;
    private String school;

    public Student() {
        // 空参构造中this直接调用另一个带参构造
        this("null",0,"bupt");
    }

    public Student(String name,  int age,String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public String getGender() {
        return school;
    }

    public void setGender(String gender) {
        this.school = school;
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

    public void study() {
        System.out.println(name + " Student study");
    }

    public void show(){
        System.out.println(name + " " + age + " " + school);
    }
}
