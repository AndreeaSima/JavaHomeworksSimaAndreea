/*
 * Car class
 */
package CarsFactory;



/**
 *
 * @author Deea
 */
class Car {

         
    


   //create enumeration
    public enum Color {RED,YELLOW,WHITE};
      // create attributes for car
    private String name;
    private Color color;
    
    //first constructor - the default constructor
        public Car(){
        name= "Default car name";
        color= Color.RED;
   
  }
        //second constructor - with 2 parameters
        public Car(String newName,Color newColor){
        name=newName;
        color=newColor;
        
 
   }
        
public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}