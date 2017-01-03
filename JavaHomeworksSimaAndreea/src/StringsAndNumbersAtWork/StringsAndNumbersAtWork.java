/*
 * Strings and Numbers at work exercise
 */


package StringsAndNumbersAtWork;

/**
 *
 * @author Deea
 */
public class StringsAndNumbersAtWork {
    
     public static void main(String args[]){
       StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");    
       System.out.println(sb.capacity());

        String hannah = "Did Hannah see bees? Hannah did.";
        int nrCharacter = hannah.length();
        char charAtIndex = hannah.charAt(12);
        System.out.println("Answer 2.a. length: "+nrCharacter);
        System.out.println("Answer 2.b. Char at index 12 is: "+charAtIndex);
        System.out.println("Answer 2.c. The index of the letter \"b\" is: "+hannah.indexOf('b'));

        String sentence = "Was it a car or a cat I saw?";
        System.out.println("Answer 3. The substring is: "+sentence.substring(9, 12));

        String hi = "Hi, ";
        String mom = "mom.";
        System.out.println("Answer 4. Method two using concat: "+ hi.concat(mom));
        System.out.println("Answer 4. Method one using \"+\": "+hi+mom);
      
        String myName = "Sima Andreea";
        
        for (int i = 0; i <= myName.length(); i++){
        char name = myName.charAt(i);
        System.out.println(name);
        }
    }
}
    
    
