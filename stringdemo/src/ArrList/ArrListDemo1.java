package ArrList;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrListDemo1 {
    public static void main(String[] args) {
        ArrayList<Student> lists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("input name: ");
            Student stu = new Student();
            String name = sc.next();
            stu.setName(name);

            System.out.println("input age: ");
            int age = sc.nextInt();
            stu.setAge(age);

            lists.add(stu);
        }


        for(Student student : lists) {
            System.out.println(student.getName()+" "+student.getAge());
        }

    }
}
