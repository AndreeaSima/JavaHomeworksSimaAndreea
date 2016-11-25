package javahomeworkssimaandreea;

import java.util.Scanner;

/*
 * Calculator homework
 */

/**
 *
 * @author Deea
 */
public class Calculator {
    public static void main(String arr[]){ 
        System.out.println("Enter the first number"); 
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble(); 
        System.out.println("Enter the second number");
        double y=sc.nextDouble(); 
        System.out.println("Enter 1 to add both the numbers "); 
        System.out.println("Enter 2 to substract both the numbers "); 
        System.out.println("Enter 3 to multiply both the numbers "); 
        System.out.println("Enter 4 to divide both the numbers ");
      int calculator=sc.nextInt(); 
     switch (calculator){ 
         
         case 1: 
             
          System.out.println("Sum of the number is:"+(x+y)); 
          break;
           case 2: 
               
               System.out.println("If you want to substract the first number from the second number enter 1"); 
               System.out.println("If you want to substract the second number from the first number enter 2 "); 
               int number=sc.nextInt(); 
               switch (number){ 
                   case 1:
                       
                       System.out.println("Substraction of the first number from the second number: "+(x-y));
                       break;
                       case 2:
                           
                           System.out.println("Substraction of the second number from the first number: "+(y-x)); 
                           break;
               }
                      break;
                       case 3: 
                           
                           System.out.println("Multiplication of the number is:"+(x*y));
                           break; 
                           case 4: 
                               
                                System.out.println("If you want to divide the first number from the second number enter 1"); 
                                System.out.println("If you want to divide the second number from the first number enter 2 "); 
                                int division=sc.nextInt();
                                
               switch (division){
                   
                   case 1:
                       
                       System.out.println("Division of the first number from the second number: "+(x/y)); 
                        break; 
                        
                        case 2:
                         System.out.println("Division of the second number from the first number: "+(y/x));
                         
                         break;
                         
               }
                break;
                default:
                    System.out.println("You are not choosing the correct option"); } 
  
                
            
        
    }
}
    