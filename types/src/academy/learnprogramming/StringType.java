package academy.learnprogramming;

public class StringType {

    public static void main(String[] args) {

        String greeting = "Mathias";
        greeting = greeting + ", and i am 21 years old";
        System.out.println("Hello my name is " + greeting);

        String numbers = "250.55";
        numbers = numbers + "49.95";
        System.out.println(numbers);

        String numStr = "10";
        int myInt = 50;
        numStr = numStr + myInt;
        System.out.println(numStr);

    }
}
