package phone;

public class PersonInfo {
    public static void main(String[] args) {
        String id = "340401200008192517";
        String year = id.substring(6,10);
        String month = id.substring(11,12);
        String day = id.substring(13,14);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

        char sex = id.charAt(16);
        int sexNum = sex - 48;
        if (sexNum % 2 == 0) {
            System.out.println("female");
        } else {
            System.out.println("male");
        }

        String talk = "you are noob";
        String[] dirtytalk = {"noob", "dump" , "nerd"};
        String result = talk.replace("noob","****");
        System.out.println(result);

        for (int i = 0; i < dirtytalk.length; i++) {
            talk = talk.replace(dirtytalk[i], "****");
        }
        System.out.println(talk);
    }
}
