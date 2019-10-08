import java.util.Scanner;

public class methods {

    public static void main(String[] args){

    System.out.println("Hello World");
    }

    public static String hello(){
        String hello = "Hello ";
        System.out.println("Hello?");
        Scanner keyboard = new Scanner(System.in);
        String word;
        word = keyboard.next();
        return hello+word;
    }








}
