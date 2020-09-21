/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ
 */
import java.util.Scanner;

public class BankCharges {
    
    
     int UserInput;
    Double Servicefee;
     
 public static void main(String[ ] args ){
      Scanner scanner = new Scanner(System.in);
      Double Servicefee;
      
      System.out.println("please enter the number of checks :");
        int UserInput = scanner.nextInt();
        System.out.println(UserInput);
        if(UserInput< 20) {
            
         Servicefee =  (UserInput*0.10 + 10);
         System.out.printf("The total service fee is : %f ",Servicefee);
            
        }else if(UserInput >=20 && UserInput <39){
         Servicefee =  (UserInput*0.08 + 10);
         System.out.printf("The total service fee is : %f",Servicefee);
        
        }else if(UserInput >=40 && UserInput <59){
         Servicefee =  (UserInput*0.06 + 10);
         System.out.printf("The total service fee is :%f ",Servicefee);
        
        }else if(UserInput >=60){
         Servicefee =  (UserInput*0.08 + 10);
         System.out.printf("The total service fee is : %f",Servicefee);
        }else{
        System.out.println("Input is Invalid");
        }
   
        
        
    }
}
        
    
    
    
 
 
 
    

