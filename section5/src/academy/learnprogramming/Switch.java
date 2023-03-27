package academy.learnprogramming;

public class Switch {

    public static final String NOT_FOUND = "Not found";

    public static void main(String[] args) {

        System.out.println(charSwitch('M'));
        System.out.println(stringSwitch("January"));
    }

    public static String charSwitch(char letter) {
        switch(letter) {
            case 'A':
                return "It was A";
            case 'B':
                return "It was B";
            case 'M':
                return "It was M";
            default:
                return NOT_FOUND;

        }
    }

    public static String stringSwitch(String month) {
        switch(month.toLowerCase()) {
            case "january": case "february":
                return "It is cold";
            case "june": case "july":
                return "It is warm";
            default:
                return NOT_FOUND;
        }
    }
}
