import java.util.Scanner;

public class methods {

    public static void main(String[] args){

    System.out.println("Hello World");
    System.out.println("---------------------------------------");
    System.out.println(hello());
        System.out.println("---------------------------------------");
    System.out.println(numberMultiplier());
        System.out.println("---------------------------------------");
    System.out.println(numberDivider());
        System.out.println("---------------------------------------");
    System.out.println(higherNumber());
        System.out.println("---------------------------------------");
    System.out.println(flipWord());
        System.out.println("---------------------------------------");

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

    public static double numberDivider() {
        double numberOne = 10;
        double numberTwo = 2;
        double finalNumber = numberOne / numberTwo;
        return finalNumber;
    }

    public static double higherNumber(){
       double highestNumber;
        Scanner keyboard = new Scanner(System.in);
       System.out.println("Give a number");
        double numberOne;
            numberOne = keyboard.nextDouble();
       System.out.println("Give another number");
        double numberTwo;
            numberTwo = keyboard.nextDouble();
        if (numberOne>numberTwo){
            highestNumber = numberOne;
        }
        else if (numberOne < numberTwo){
            highestNumber = numberTwo;
        }
        else {
            highestNumber = 0;
        }
        return highestNumber;
    }
    public static String flipWord(){
        String wordOne;
        wordOne = " Hello ";
        String wordTwo;
        wordTwo = " World ";
        System.out.println("Hello World");
        return wordTwo+wordTwo;
    }

}
