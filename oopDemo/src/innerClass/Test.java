package innerClass;

public class Test {
    public static void main(String[] args) {
        Outer o = new Outer();
        Object Inner = o.getInstance();
        System.out.println(o.getInstance());

        Outer.Inner2.print2();// 只要是静态的东西，都可以直接 . 获取
    }
}
