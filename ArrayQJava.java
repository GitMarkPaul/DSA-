package arrayq.java;
import java.util.Scanner;
public class ArrayQJava {
    /* NAME: Mark Paul Cañeda
     COARSE: BSIS 2
    ACCOUNT: Github
DATE UPDATE: August 2, 2016
    SUBJECT: DSA
    */
    Scanner inputDevice = new Scanner(System.in);
    
    public int array[];
    public int deq;
    public int front;
    
    
    public void Dequeue(int size2){
        
        System.out.print("********** DEQUEUEING **********");
        System.out.print("\nHow many do you want to remove?");
		deq = inputDevice.nextInt();
		for(int w = 0; w < deq; w++){
			for(int e = 0; e < size2-1 ;e++){
				array[e]= array[e+1];
			}
                }
                        for(int e = size2-deq; e < size2; e++ ){
			array[e]=0;
                        }
                }
     public void Enqueue(int size3){
         
        System.out.print("\n********** ENQUEUEING **********"); 
        System.out.println("\nPlease Fill Again: ");
		for(int r = size3 - deq; r < size3; r++){
			System.out.print("Queue [" + (r+1) + "]: ");
			array[r] = inputDevice.nextInt();
		}

		
    }
    
    public static void main(String[] args) {
        
        System.out.println("********** ARRAY QUEUE JAVA APPLICATION **********");
        
        int size = 0;
        
        ArrayQJava AQJ = new ArrayQJava();
        
        System.out.println("Please Input the Number of Array Size:");
        size = AQJ.inputDevice.nextInt();
        AQJ.array = new int[size];
        
        System.out.print("Please Input Again: \n");
		
		for(int q = 0; q < size; q++){
			System.out.print("Queue [" + (q+1) + "]: ");
			AQJ.array[q] = AQJ.inputDevice.nextInt();
                        
                }
                
                AQJ.Dequeue(size);
		
		for(int q = 0; q < size; q++){
			System.out.print("\nQueue [" + (q+1) + "]: " + AQJ.array[q]);
		}
		AQJ.Enqueue(size);
                
                System.out.print("********** NEW ARRAY QUEUE **********");
		System.out.println("\nThis is new:");
		for(int q = 0; q < size; q++){
			System.out.print("\nQueue [" + (q+1) + "]: " + AQJ.array[q]);
		}
		
    }
    
}
