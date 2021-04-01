package WarmupOne;

import java.util.Scanner;

public class SortAnIntArray {

    public static void main(String[] args) {
        /*
        {
        //define an array
        int[] intArray = {52, 45, 32, 64, 12, 87, 78, 98, 23, 7};

        System.out.printf("Original Array : %s", Arrays.toString(intArray));

        Arrays.sort(intArray);

        System.out.printf("\n\nSorted Array : %s", Arrays.toString(intArray));
    }
}

         */

        // use 2 loops: You can sort the array using manual sorting like using for loops.
        // What we can do is use two for loops, one to traverse the array from the
        // starting and another for loop inside the outer one to traverse the next element.
        //define original array
        int [] intArray = new int [] {52,45,32,64,12,87,78,98,23,7};
        int temp = 0;

        //print original array
        System.out.println("Original array: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        //Sort the array in ascending order using two for loops
        for (int i = 0; i <intArray.length; i++) {
            for (int j = i+1; j <intArray.length; j++) {
                if(intArray[i] > intArray[j]) {      //swap elements if not in order. if the number in first loop at
                    // position i is greater than that at i + 1 from the j loop,
                    temp = intArray[i]; // the greater number (i) is placed in th temp variable.
                    intArray[i] = intArray[j]; // the j avariable is placed in the i spot,
                    intArray[j] = temp; // and temp is place in the j spot
                }
            }
        }
        //print sorted array-- loop through the
        System.out.println("\nArray sorted in ascending order: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    /**
     * SORT STRING ARRAY IN ORDER
     * public class StringArrayInOrder {
     *    public static void main(String args[]) {
     *       String[] myArray = {"JavaFX", "HBase", "OpenCV", "Java", "Hadoop", "Neo4j"};
     *       int size = myArray.length;
     *
     *       for(int i = 0; i<size-1; i++) {
     *          for (int j = i+1; j<myArray.length; j++) {
     *             if(myArray[i].compareTo(myArray[j])>0) {
     *                String temp = myArray[i];
     *                myArray[i] = myArray[j];
     *                myArray[j] = temp;
     *             }
     *          }
     *       }
     *       System.out.println(Arrays.toString(myArray));
     *    }
     * }
     */
    /*
    Sort String Array In Alphabetical Order
Just like numeric arrays, you can also sort string array
using the sort function. When you pass the string array,
the array is sorted in ascending alphabetical order. To sort
the array in descending alphabetical order, you should provide
the Collections interface method reverseOrder () as the second argument.

The following program demonstrates the sorting of a string array
in ascending as well as descending order.

import java.util.Arrays;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        String str_Array[] = {"Java", "Python", "Perl", "C++", "C#", "AS400"};

        System.out.printf("Original Array: \n%s\n\n", Arrays.toString(str_Array));

        // Sorts str_Array in ascending order
        Arrays.sort(str_Array);
        System.out.printf("Array sorted in ascending order: \n%s\n\n",
               Arrays.toString(str_Array));

        // Sorts str_Array in descending order
        Arrays.sort(str_Array, Collections.reverseOrder());

        System.out.printf("Array sorted in descending order : \n%s\n\n",
              Arrays.toString(str_Array));
    }
}
     */

}