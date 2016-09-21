package binarysearch.java;
import java.util.Scanner;
public class BinarySearchJava {
    /*  NAME: Mark Paul Cañeda
     COARSE: BSIS 2
    ACCOUNT: Github
DATE UPDATE: August 2, 2016
    SUBJECT: DSA
    */

    public static void main(String[] args) {
        
        
    int i,
        left,
        right,
        middle,
        a,
        search, 
        array[];
 
    Scanner markpaul = new Scanner(System.in);
    
    System.out.println("Enter number of elements");
           a = markpaul.nextInt(); 
           array = new int[a];
 
    System.out.println("Enter " + a + " integers");
 
 
    for (i = 0; i < a; i++)
           array[i] = markpaul.nextInt();
 
    System.out.println("Enter value to find");
           search = markpaul.nextInt();
 
    left  = 0;
    right   = a - 1;
    middle = (first + last)/2;
 
    while( left <= right )
    {
      if ( array[middle] < search )
           left = middle + 1;    
      else if ( array[middle] == search ) 
      {
        System.out.println(search + " found at location " + (middle + 1) + ".");
        break;
      }
      else
           left = middle - 1;
 
           middle = (left + right)/2;
   }
   if ( left > right )
           System.out.println(search + " is not present in the list.\n");
  }
}
    
    

