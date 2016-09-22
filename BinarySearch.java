/*******************************************************************************
 * BINARY SEARCH 
 *  - is a "Divide and Conquer" algorithm
 *  - it compares the item with the middle element of a sorted(ascending) array.
 *  - each step, the size of array is reduced to half until one single.
 ******************************************************************************/
/*
  SOURCE CODE: BinarySearch
  AUTHOR NAME: Mark Paul A. Cañeda
  GITHUB URL:  github.com
  LAST UPDATE: September 22, 2016
 */
package binarysearch;
import java.util.Scanner;
import java.util.Random;
public class BinarySearch {
    
    private int left;
    private int right;
    private int middle;
    private int search;
    private int capacity;
    private int array[];
    
    private BinarySearch(int size){
        capacity = size;
        array = new int[capacity];
    }
    private void getArray(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        for(int i = 0; i < capacity; i++){
            int x = rand.nextInt(100);
            array[i] = x;
        }
        System.out.println();
    }
    public void show(){
        int y = 0;
        for(int i = 0; i < capacity; i++){
            System.out.print(array[i] + " ");
            y += 1;
            if(y == 10){
                System.out.println();
                y = 0;
            }
        }
    }
    private void search(){
        Scanner input = new Scanner(System.in);
        int left,
            right,
            middle,
            search;
        
        left = 0;
        right = 0;
        middle = 0;
        
        System.out.println("\n\nPlease enter a number to find:");
        search = input.nextInt();
        
        while(left <= right){
            middle = (left + right)/2;
            if(array[middle] == search){
                System.out.println("The value found at array["+middle+"]");
                break;
            }
            else if(array[middle] < search){
                left = middle + 1;
            }
            else{
                right = middle - 1;
            }
            if(array[middle] != search){
                System.out.println("The value not found!!!");
            }
        }
    }
    public static void main(String[] args) {
        
        int size;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of elements:");
        size = input.nextInt();
       
        
        BinarySearch demo = new BinarySearch(size);
        
        demo.getArray();
        demo.show();
        demo.search();
    }
    
}
