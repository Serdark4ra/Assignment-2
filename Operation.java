import java.util.Random;
import java.util.Scanner;

public class Operation{
    private static int[] array;
    private static Random rand;
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        rand = new Random();
        System.out.println("Enter array size: ");
        int number = scanner.nextInt();

        array = new int[number];
        
        for (int i = 0; i < number; i++) {
            array[i] = rand.nextInt(101);
        }
        

        
    }

    public static void findMaxMin(){

    }
    public static void findAvarage(){

    }
    public static void findSumOfElements(){

    }

}