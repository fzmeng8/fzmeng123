package abstractDemo2;

public class Pingpangcoach extends Coach implements English{
    public Pingpangcoach() {
    }

    public Pingpangcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("Teaching Pingpangcoach");
    }

    @Override
    public void speakEnglish() {
        System.out.println("Speaking English");
    }
}
