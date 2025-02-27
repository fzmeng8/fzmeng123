package abstractDemo2;

public class Pingpang extends Sporter implements English{
    public Pingpang() {
    }

    public Pingpang(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("Pingpang is speaking English");
    }

    @Override
    public void study() {
        System.out.println("Pingpang is studying pingpang");
    }
}
