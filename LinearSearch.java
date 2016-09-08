
package binarysearch.java;
import java.util.Scanner;
import java.util.Random;
public class LinearSearch {
    
    Scanner in = new Scanner (System.in);
    
    private int size, search, array[], capacity;
    
    public void linearSearch(int size){
        capacity = size;
        array = new int[capacity];
    }
    public void search(int values){
        search = values;
        int x;
        for(x = 0; x<capacity; x++){
            if(array[x]==search){
                System.out.println("Found At Index["+(x+1)+"]");
        }
    }
        if(x == capacity){
            System.out.println("No more indexes found!");
        }
    }
        public void declare(){
            Random rand = new Random();
            for(int x = 0; x < capacity; x++){
                array[x] = rand.nextInt(capacity);
            }
            
        }
        public void show(){
            for(int x = 0; x <capacity; x++){
                System.out.println("INDEX ["+(x+1)+"]:" + array[x]);
            }
        } 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       int size; int value;
        
       
        System.out.println("Enter Array Size:");
        size = input.nextInt();
        linearSearch action = new linearSearch(size);   
        System.out.println("Enter number to find:");
        value = input.nextInt();
       
        action.declare();
        action.search(value);
        action.show();
         }
}
