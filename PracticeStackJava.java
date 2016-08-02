package practicestack.java;
import java.util.Scanner;
  /*   NAME: Mark Paul Cañeda
     COARSE: BSIS 2
    ACCOUNT: Github
DATE UPDATE: August 2, 2016
   */

public class PracticeStackJava {
    
    private int capacity;
    private int top = 0;
    private String[] storage;
    
    // Contructor = initialize an object instance of the class
    
    public PracticeStackJava(int size){
    // assign the value of size to capacity
    capacity = size;
    storage = new String[capacity];    
    }
    public void show(){
    // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
    
    for(int h = capacity-1; h >= 0; h--){
        System.out.println("Stack["+ h +"] = " + storage[h]);
        
        /* print like this: 
      stack[9]   = 10th value
      stack[8]   = 9th value
      stack[7]   = 8rd value
      ....  
      stack[1]   = 2nd value
      stack[0]   = 1st value
      */
        
       }
        System.out.println();
    }
    private boolean isEmpty(){
        
        if(storage[0] == null){  
            System.out.println("STORAGE IS EMPTY.");
           System.out.println();
        
        return true;
    }
    return false;
}
    private boolean isFull(){
        if(top == capacity){
            System.out.println("STORAGE IS FULL.");
            System.out.println();
            return true;
            
        }
        return false;
    }
      public void push(String value) {
    if (isFull()) {
      // print error message
      System.out.println("ADD FAILED");
        System.out.println();
    } else {
      System.out.println("... trying to push on stack[" + top + "] ...");
      storage[top] = value;
      top++;
      /* increment or decrement top*/;
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    if (isEmpty()) {
      // print error message
      System.out.println("REMOVE FAILED");
        System.out.println();
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      storage[top] = null;
      top--;
      /* increment or decrement top*/;
      System.out.println(storage[top] + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
    if (storage[top] == storage[0]) {
      System.out.println("PEEK TOP = " + storage[top]);
      System.out.println();
    } else {
      System.out.println("PEEK TOP = " + storage[top-1]);
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
      PracticeStackJava storage = new PracticeStackJava(10);
      
    // construct a new array queue and assign 10 as the integer value for the size limit of the stack
    System.out.println("STORAGE CAPACITY = " + storage.capacity);
    System.out.println();
    storage.show();
    // show empty stack
    storage.pop();
    // try removing on an empty stack
    storage.peek();
    // peek top element of an empty stack
    storage.push("one");
    storage.show();
    // show the updated stack
    storage.peek();
    // peek if top element is "one"
    storage.push("two");
    storage.show();
    // show the updated stack
    storage.peek();
    // peek if top element is "two"
    storage.push("three");
    storage.show();
    // show the updated stack
    storage.peek();
    // peek if top element is "three"
    storage.push("four");
    // show the updated stack
    storage.show();
    storage.push("five");
    storage.show();
    // show the updated stack
    storage.pop();
    // try removing "five"
    storage.push("six"); 
    storage.push("seven"); 
    storage.push("eight"); 
    storage.push("nine"); 
    storage.push("ten"); 
    storage.show();
    storage.push("eleven"); 
    storage.show();
    storage.push("twelve");
    storage.show();  
      }  
}
    

