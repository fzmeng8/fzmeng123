package innerClass;

public class Outer {
    String name;
    private int a = 10;
    static int b = 50;

    // 成员内部类
    // 不能有静态方法和静态变量
    private class Inner {
        private int a = 20;
        public void print() {
            int a = 30;
            System.out.println("10 is "+ a);// 就近
            System.out.println("20 is "+ this.a);// 这个Inner类的地址
            System.out.println("30 is "+ Outer.this.a);
        }
    }

    public Inner getInstance() {
        return new Inner();
    }

    // 静态内部类
    static class Inner2 {
        public void print1() {
            Outer o = new Outer();
            System.out.println(o.a);// 如果访问外部非静态类需要创建对象
            System.out.println(b);// 静态内部类只能访问外部类的静态变量和方法
            System.out.println("非静态方法被调用");
        }

        static void print2() {
            System.out.println("静态方法被调用");
        }
    }

    // 局部内部类
    public void show() {
        int a = 20; // 局部变量 不能用public protected修饰
        class Inner3 {
            String name;
            int age;

            public void method1() {
                System.out.println("局部内部类");
            }

            public static void method2() {
                System.out.println("局部内部类静态方法");
            }
        }

        // 创建局部内部类的对象
        Inner3 i = new Inner3();
        System.out.println(i.name);
    }
}
