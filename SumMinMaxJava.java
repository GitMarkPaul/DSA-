/*
SOURCE CODE: Sum-Min-Max
AUTHOR NAME: Mark Paul A. Cañeda
GITHUB URL: github.com
LAST UPDATE: September 21, 2016
*/

package sum.min.max.java;

public class SumMinMaxJava {

    public static void main(String[] args) {
        
        int[] numbers = {44,34,45,65,77,55,100,76,88,99};
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] < min)
                min = numbers[i];
            if(numbers[i] > max)
                max = numbers[i];
        }
        System.out.println("Smallest number is " + min);
        System.out.println("Largest number is " + max);
        }
    
}
