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
        double score1;
        double score2;
        double score3;
        double Average;
        
        
        
        
        
        
        System.out.println("Enter the First Score: ");
        score1 = scanner.nextDouble();
        
        
        System.out.println("Enter the Second Score: ");
        score2 = scanner.nextDouble();
        
        
        System.out.println("Enter the Third Score: ");
        score3 = scanner.nextDouble(); 
        
        Average = ( score1 + score2 + score3 )/3;
        if(Average < 60){
            System.out.printf("The average score is %f, That's A grade F", Average);

        } else if (Average <70 && Average>=60){
            System.out.printf("The average score is %f, That's A grade D", Average);
        }   else if (Average <80 && Average>=70){
            System.out.printf("The average score is %f, That's A grade C", Average);

        }else if (Average <90 && Average>=80){
            System.out.printf("The average score is %f, That's A grade B", Average);
        }else if (Average <100 && Average>=90){
            System.out.printf("The average score is %f, That's A grade A", Average);
        }else  {
        System.out.println("The average score " + Average + ", That's An invalid Average");
    }

        
    }
//    }
    

