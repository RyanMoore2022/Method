import java.util.Scanner;

public class methods {

    public static void main(String[] args){

    System.out.println("Hello World");
    System.out.println(hello());
    System.out.println(numberMultiplier());
    System.out.println(numberDivider());
    }

    public static String hello(){
        String hello = "Hello ";
        System.out.println("Hello?");
        Scanner keyboard = new Scanner(System.in);
        String word;
        word = keyboard.next();
        return hello+word;
    }

    public  static int numberMultiplier() {
        int numberOne = 10;
        int numberTwo = 2;
        return numberOne * numberTwo;
    }

    public static Double numberDivider() {
        double numberOne = 10;
        double numberTwo = 2;
        return numberOne / numberTwo;
    }




}
