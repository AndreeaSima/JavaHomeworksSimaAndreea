/*
 * FilesManagement having four methods
 */
package FilesManagement;


import java.util.Scanner;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.File;
import java.nio.charset.StandardCharsets;
/**
 * The FileManagement class implements methods that can read and write files
 */
public class FilesManagement {
    
    private static final Charset UTF8 = StandardCharsets.UTF_8;
    
    
   /**
     * Adds a new line of text 
     * 
     * @param path      the path name of the file
     * @param content   the content of the new line
     */
    
    public static void writeToFile(String path, String content) {
        
        content += '\n';
        
        File targetFile = new File(path);
        
        try{
            
            Files.write(targetFile.toPath(), content.getBytes(UTF8), 
                    StandardOpenOption.APPEND);
            
            
        } catch (IOException e) {
            
            System.out.println(path + " could not be found.");
        } 
    }
    
    /**
     * Replaces the text content of the specified file with new content
     * 
     * @param path      the path name of the file
     * @param content   the String that will replace the old content
     */
    public static void overwriteToFile(String path, String content) {
        
        File targetFile = new File(path);
        
        try{
            
            Files.write(targetFile.toPath(), content.getBytes(UTF8), 
                    StandardOpenOption.TRUNCATE_EXISTING);            
                        
        } catch (IOException e) {
            
            System.out.println(path + " could not be found.");
        } 
    }
    
    /**
     * Returns the text content of the specified file
     * 
     * @param path the path name of the file
     * @return  a String representing the content of the file
     * @throws IOException 
     */
    public static String readFromFile(String path) throws IOException {
        
        String content = "";

        Scanner contentOfFile;
                                    
        contentOfFile = new Scanner(Paths.get(path), UTF8.toString());
        
        
        while (contentOfFile.hasNextLine() == true) {
            
            content += contentOfFile.nextLine() + '\n';
        }
        
        return content;
    }
    
    /**
     * Removes all text content of the specified file
     * 
     * @param path the path name of the file
     */
    public static void deleteFromFile(String path) {
        
        String emptyString = "";
        
        overwriteToFile(path, emptyString);
    }
    
    
    public static boolean createFile(String name) throws IOException {                
        
        File newFile = new File(name);
                           
        return newFile.createNewFile();
        
    }
    
    public static boolean deleteFile(String path) throws IOException {
        
        return Files.deleteIfExists(Paths.get(path));
    }
}
