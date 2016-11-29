/*
 * Implementation of the involved classes
 */
package CarsFactory;

import java.util.ArrayList;



/**
 *
 * @author Deea
 */
public class CarsFactory {
     /**
     * Will test the implementation of all involved classes
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a new car with attributes:Mercedes, RED
        Car firstCar= new Car("Mercedes",Car.Color.RED);
        System.out.println(firstCar.getName() + firstCar.getColor());
        System.out.println(firstCar.getName() + firstCar.getColor() + " was delivered ");
        
        //Create a new car with attributes:Renault,YELLOW
          Car secondCar = new Car("Renault",Car.Color.YELLOW);
          System.out.println(secondCar.getName() + secondCar.getColor());
          
        //Create a new car with attributes:Dacia,RED
        Car thirdCar = new Car("Dacia",Car.Color.RED);
        System.out.println(thirdCar.getName() + thirdCar.getColor());
        
         //Create a new car with attributes:Dacia,WHITE
        Car fourthCar = new Car("Dacia",Car.Color.WHITE);
        System.out.println(fourthCar.getName() + fourthCar.getColor());
        
           //Create a new car with attributes:Mercedes, WHITE
        Car fifthCar = new Car("Mercedes",Car.Color.WHITE);
        System.out.println(fifthCar.getName() + fifthCar.getColor());
        ArrayList<String> obj = new ArrayList<>();
        obj.add("RED MERCEDES");
        obj.add("YELLOW RENAULT");      
        obj.add("RED DACIA");
        obj.add("WHITE DACIA");
        obj.add("WHITE MERCEDES");
        System.out.println("The arraylist contains the following elements: "+ obj);
        System.out.println("Retrieving items with loop using index and size list");
        for (int i = 0; i < obj.size(); i++) {
        System.out.println("Index: "+i+ "- Item " + obj.get(i));
        
        }
        
        
   }
    
}


