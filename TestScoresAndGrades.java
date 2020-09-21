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
public class TestScoresAndGrades {
    public static void main(String[ ] args ){
        Scanner scanner = new Scanner(System.in);
        float scoreone;
        double scoretwo;
        double scorethree;
        double Avg;
        
        
        
        
        
        
        System.out.println("Enter the 1st Score: ");
        scoreone = scanner.nextFloat();
        
        
        System.out.println("Enter the 2nd Score: ");
        scoretwo = scanner.nextDouble();
        
        
        System.out.println("Enter the 3rd Score: ");
        scorethree = scanner.nextDouble(); 
        
        Avg = ( scoreone + scoretwo + scorethree )/3;
        if(Avg < 60)
        {
            System.out.println("The average score for  grade is F: "+Avg);

        }
        else if (Avg <70 && Avg>=60)
        {
            System.out.println("The average score for grade is D: "+Avg);
        }  
        else if (Avg <80 && Avg>=70)
        {
            System.out.println("The average score for grade is C: "+ Avg);

        }else if (Avg <90 && Avg>=80)
        {
            System.out.println("The average score for grade is B: "+ Avg);
        }else if (Avg<100 && Avg>=90)
        {
            System.out.println("The average score for grade is A: "+ Avg);
        }else  
        {
        System.out.println( " not a valid number");
    }

        
    }
    }
    

