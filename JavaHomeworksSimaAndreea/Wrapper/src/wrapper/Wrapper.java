
 */
package wrapper;

/**
 *
 * @author Deea
 */
public class Wrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Float f = 15.6F;  // Float wrapper object with value 15.6
    Long l = new Long("526");  // Long wrapper object with value 526
    Character c = '@';  // Character object with value @
    Boolean b = Boolean.valueOf("TRUE");   // Boolean object with value true
    System.out.printf(" Result: f=%.2f, l=%d, c=%c, b=%b", f, l, c, b );  

            
    }
    
}
