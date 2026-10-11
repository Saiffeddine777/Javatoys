

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import  javax.swing.SwingUtilities;
import javax.swing.JFrame;
public class Test {
    public static void createWindow (){
        JFrame frame  = new JFrame("My first Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setVisible(true);
    }

    public static void getNpmVersion(String param){
       try {
        ProcessBuilder builder = new ProcessBuilder(param.split(" "));
        Process process = builder.start();
     
        BufferedReader reader = new BufferedReader(
             new InputStreamReader(
                process.getInputStream()
             )
        );
        String line;

        while ((line = reader.readLine() )!= null){
            System.out.println(line);
        }

        process.waitFor();
       } catch (Exception e) {
        System.err.println(e.getMessage());
        e.printStackTrace();    
    }
         
    }
    
    public static void readFile(){
        try {
           FileReader readerFile = new FileReader("test.txt");
           int i ;
           while ((i  = readerFile.read()) != -1){
                System.out.print((char)(i));
           }
           readerFile.close();

        } catch (IOException e) {
            System.out.println("Error was throw");
            e.printStackTrace();
        }
    }


    public static void deleteFile(){
        try {
            File fileFinder = new File("test.txt");
            if (fileFinder.delete()){
                System.out.println("File has been deleted");
            }
            else{
                System.out.println(("File is not found"));
            }
        } catch (Exception e) {
            System.out.println("Error has occured");
            e.printStackTrace();
        }
    }



    public static void writeInFile(){
      
      try{
        FileWriter testFileWriter = new FileWriter("test.txt");
        testFileWriter.write("fuck your mother");
        testFileWriter.close();
      }
      catch(Exception e){
        System.out.println("An error has been issued");
        e.printStackTrace();
      }
    }



    public static void testFile(){
        try {
            File testFile = new File ("text.txt");
            if (testFile.createNewFile()){
                 System.out.println("The file has been created");
            }
            else{
              System.out.println("the file already exists");
            }
        } catch (Exception e) {
            System.out.println("Error has occured");
            e.printStackTrace();
        }
         
    } 



    public static void main(String[] args){
           SwingUtilities.invokeLater(new Runnable() {
              public void run(){
                createWindow();
              }
           });
    }
    
}