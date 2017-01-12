/*
 * The TestFileManagement class can create files, add text to files  and read from files
 * 
 * 
 */
package FilesManagement;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Deea
 */
public class TestFileManagement {
    
    private static final int EXIT = 0;
    private static final int NEW_FILE = 1;
    private static final int WRITE  = 2;
    private static final int DELETE_FILE = 3;
    private static final int READ = 4;
    private static final int OVERWRITE =5;
    private static final int DELETE = 6;
    
    
    private static int getOption() {        
           
        String option;
        String optionRegEx = "^[0-6]$";
        
        Scanner input;        
        
        while (true) {
                
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1. Create a new file");
            System.out.println("2. Add a line to a file" );
            System.out.println("3. Delete an existing file ");
            System.out.println("4. Read from a file");
            System.out.println("5. Ovewrite a file");
            System.out.println("6. Delete content of a file");
            System.out.println("0. Exit");
            System.out.print("->");
            
            input = new Scanner(System.in);
            option = input.nextLine();
            
            if(option.matches(optionRegEx)) {
                break;
            }
            else {
                System.out.println("No such option!");
            }
        }
        
        return Integer.parseInt(option);
    }
    
   
    private static String getText() {
        
        String text = "";
        Scanner input;
        
        while (text.isEmpty()) {
            
            input = new Scanner(System.in);
            
            text = input.nextLine();
        }
        
        return text;
    }
       
    /**
     * The main method
     * @param args arguments of the application
     */
   
    public static void main(String[] args) throws IOException {
        
        int option;
        String fileName;
        String text;
        
        do {
            
            option = getOption();
            
            switch(option) {
                
                case NEW_FILE:
                    System.out.print("Name of the file: ");
                    fileName = getText();
                    
                    try {
                        if (FilesManagement.createFile(fileName)) {
                            System.out.println(fileName + " was created!");
                        }
                        else {
                            System.out.println(fileName + " already exists!");
                        }
                    }
                    catch (Exception e) {
                        System.out.println("File could not be created.");
                    }
                    
                    break;
                    
                case DELETE_FILE:
                    System.out.print("Name of the file: ");
                    fileName = getText();
                    
                    try {
                        if (FilesManagement.deleteFile(fileName)) {
                            System.out.println("File was deleted.");
                        }
                        else {
                            System.out.println(fileName + " could not be found.");
                        }                        
                    }                    
                    catch (Exception e) {
                        System.out.println("File could not be deleted.");
                    }
                    
                    break;
                    
                case WRITE:
                    System.out.print("Name of the file: ");
                    fileName = getText();
                    
                    System.out.print("Text: ");
                    text = getText();
                    
                    FilesManagement.writeToFile(fileName, text);
                    
                    break;
                    
                case OVERWRITE:
                    System.out.print("Name of the file: ");
                    fileName = getText();
                    
                    System.out.print("Text: ");
                    text = getText();
                    
                    FilesManagement.overwriteToFile(fileName, text);
                    
                    break;
                    
                case READ:
                    System.out.print("Name of the file: ");
                    fileName = getText();
                    
                    text = FilesManagement.readFromFile(fileName);
                    System.out.println(text.isEmpty() ? "File is empty." : text);
                    
                    break;
                    
                case DELETE:
                    System.out.print("Name of the file: ");
                    fileName = getText();
                    
                    FilesManagement.deleteFromFile(fileName);
                    
                default:
            }
        } while (option != EXIT);
        
    }
}