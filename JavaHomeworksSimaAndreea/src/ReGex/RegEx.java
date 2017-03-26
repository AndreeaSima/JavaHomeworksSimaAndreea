/*
 * 
 */
package ReGex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Deea
 */

public class RegEx {

    // method to validate date
    public static boolean isValid(String text) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("yyMMdd");
        df.setLenient(false);
        df.parse(text);
        return true;
    } // end method to validate date

    // main method
    public static void main(String[] args) throws ParseException {

        Scanner scannerSourceString = new Scanner(System.in);
        boolean dontExitYet = false;

        do {
            System.out.println("Enter CNP: ");
            String source = scannerSourceString.next();
            
            if (source.length() < 13 || source.length() > 13) {
                System.out.println("Invalid CNP length, please try again.");
            } else {
                    boolean validCNPdigits = false;
                //regular expression tests if all 13 characters are digits
                Pattern patternDigits = Pattern.compile("\\d{13}");
                Matcher matcher = patternDigits.matcher(source);

                while (matcher.find()) {
                    validCNPdigits = true;
                }
               
                if (!validCNPdigits) {
                    System.out.println("CNP should contain only numbers, please try again.");
                } else {
                    // test if the first digit equals 1 or 2
                    Pattern patternFirstDigit = Pattern.compile("^[1-2]");
                    Matcher matcherFirstDigit = patternFirstDigit.matcher(source);
                    boolean found = false;
                    while (matcherFirstDigit.find()) {
                        found = true;
                    }
                    // if first digit ok, extract date
                    if (found) {
                        Pattern patternDate = Pattern.compile("^[1-2]\\d{2}\\d{2}\\d{2}");
                        Matcher matcherDate = patternDate.matcher(source);
                        String resultDate = "";
                        while (matcherDate.find()) {
                            resultDate = String.format(matcherDate.group());
                        }
                        //validate date
                        if (isValid(resultDate.substring(1))) {
                            System.out.println("Congratulations, the CNP entered is correct.");
                            dontExitYet = true;
                        } else {
                            System.out.println("Invalid date in CNP, please try again.");
                        }
                    } else {
                        System.out.println("First digit of CNP should be 1 or 2, please try again.");
                    }
                }
            }
        } while (!dontExitYet);
    }
}
