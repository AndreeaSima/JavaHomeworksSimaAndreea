/*
 * Implements the HelloWorldAnonymousClasses class without anonymous classes.
 */
package HelloWorldAnonymousClasses;

/**
 *
 * @author Deea
 */
public class HelloWorldWithoutAnonymousClasses {
    
   
    
    public static void main(String[] args) {

        HelloWorldWithoutAnonymousClasses myApp =

            new HelloWorldWithoutAnonymousClasses();

        myApp.sayHello();

    }           

 //HelloWorld interface

    interface HelloWorld {


        public void greet();


        public void greetSomeone(String someone);


    }

   

    public void sayHello() {


        // Local class EnglishGreeting implements HelloWorld
        
        class EnglishGreeting implements HelloWorld {

            String name = "world";


            @Override
            public void greet() {

                greetSomeone("world");

            }


            @Override
            public void greetSomeone(String someone) {

                name = someone;

                System.out.println("Hello " + name);

            }

        }         
        
        
        // Local class FrenchGreeting implements HelloWorld
        
        class FrenchGreeting implements HelloWorld {

            String name = "tout le monde";
            

            @Override
            public void greet() {

                greetSomeone("tout le monde");

            }


            @Override
            public void greetSomeone(String someone) {

                name = someone;

                System.out.println("Salut " + name);

            }
            
        }
        
        
        // Local class SpanishGreeting implements HelloWorld

        class SpanishGreeting implements HelloWorld {

            String name = "mundo";
            

            @Override
            public void greet() {

                greetSomeone("mundo");

            }

            @Override
            public void greetSomeone(String someone) {

                name = someone;

                System.out.println("Hola, " + name);

            } 

        }
        
        HelloWorld englishGreeting = new EnglishGreeting();
        HelloWorld frenchGreeting = new FrenchGreeting();
        HelloWorld spanishGreeting =  new SpanishGreeting();
        
        
        englishGreeting.greet();

        frenchGreeting.greetSomeone("Fred");

        spanishGreeting.greet();

    }        

}

    

