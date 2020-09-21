
import java.util.Scanner;


public class SumOfNumbers {
    public static void main(String[ ] args ) {
        int number = -7;
        int sum =  0;
        Scanner scanner = new Scanner(System.in);
        
        
        
        while( number < 1){
             System.out.println(" Please enter a positive nonzero integer value :"  );
             number = scanner.nextInt();
        }
        for(int i = 1; i <= number; i++ ){
            sum = sum + i ;
             System.out.println("the sum of numbers from 1  to " +  i  +    "  is  "    +   sum );
             
             
             
        }
        
       
    }
}
