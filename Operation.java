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
        
    //Menu will take place in here.
        
    }
    
    /**
     * finds the min element and prints it.
     */
    public static void findMin()
    {
        int min = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < array[0])
            {
                min = array[i];
            }

            System.out.println("Min number is: " + min);
        }
    }
    
    /**
     * finds the max element and prints it
     */
    public static void findMax()
    {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > array[0])
            {
                max = array[i];
            }

            System.out.println("Max number is: " + max);
        }
    }

    public static void findAvarage()
    {

    }
    public static void findSumOfElements()
    {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        
        for (int i = 0; i < array.length; i++)
        {
            if ( i % 2 == 0)
            {
                sumOfEven += array[i];
                
            }
            else if ( i % 2 == 1)
            {
                sumOfOdd += array[i];
            }        
        }
        System.out.println( "Sum of even indexed numbers is " + sumOfEven);
        System.out.println( "Sum of odd indexed numbers is " + sumOfOdd);
        
        

    }

}
