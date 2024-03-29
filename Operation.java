import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Operation{
    
    private static int[] array;
    private static Random rand;
    private static Scanner scanner;
    
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        rand = new Random();
        System.out.print("Enter array size: ");
        int number = scanner.nextInt();

        array = new int[number];
        
        for (int i = 0; i < number; i++) {
            array[i] = rand.nextInt(101);
        }
        
    //Menu will take place in here.
        scanner.nextLine();
        int choice;
        do
        {
            System.out.print(
            "1- Find the the element with minimum value\n" +
            "2- Find the the element with maximum value\n" +
            "3- Display how each element of the array differs from the average\n" +
            "4- Find the sum of elements with odd- and even-numbered indexes\n" +
            "5- Exit\n" +
            "Choose the operation that you want: " 
            );
            choice = scanner.nextInt();
            if ( choice == 1)
            {
                findMin();
            }
            else if ( choice == 2)
            {
                findMax();
            }
            else if ( choice == 3)
            {
                findAverage();
            }
            else if ( choice == 4)
            {
                findSumOfElements();
            }
            else if ( choice == 5)
            {
                System.out.println("Exitting...");
            }
        }while( choice != 5 );
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
        }
        System.out.println("Min number is: " + min);
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
        }
        System.out.println("Max number is: " + max);
    }

    /**
     * finds the average of an array and prints the differences 
     * between the initial values of the array and the average
     */
    public static void findAverage()
    { 
        int sum = 0;
        double average;
        for ( int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        if ( array.length != 0)
        {
            average = sum / array.length; 
            System.out.print("{");
            for ( int i = 0; i < array.length; i++)
            {
                System.out.print((int)(array[i] - average));
                if ( i < array.length - 1 )
                {
                    System.out.print(", ");
                } 
            }
            System.out.println("}");

        }
        else
        {
            System.out.println("The array s empty.");
        }
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

    
    

    /*
     * public static void findAverage(int[] array)
    {
        int arraySum = 0;
        int[] updatedArray = new int[array.length];

        for (int i = 0; i < array.length; i++){
            arraySum += array[i];
        }

        int average = arraySum / array.length;

        for (int i = 0; i < array.length; i++){
            updatedArray[i] = array[i] - average;
        }

        System.out.println(Arrays.toString(updatedArray));
    }
     */
