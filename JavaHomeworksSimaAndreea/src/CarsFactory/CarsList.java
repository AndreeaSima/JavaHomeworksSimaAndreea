/*
 *
 */
package CarsFactory;



/**
 *
 * @author Deea
 */
public class CarsList {
    
    public static void main (String args[]){
        ArrayList<String> obj = new ArrayList<>();
        obj.add("RED MERCEDES");
        obj.add("YELLOW RENAULT");      
        obj.add("RED DACIA");
        obj.add("WHITE DACIA");
        obj.add("WHITE MERCEDES");
        
    System.out.println("The arraylist contains the following elements:"+ obj);
    System.out.println("Retrieving items with loop using index and size list");
    for (int i = 0; i < obj.size(); i++) {
    System.out.println("Index: "+i+ "- Item " + obj.get(i));
        
    }
    
}

}
