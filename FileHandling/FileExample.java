package FileHandling;
import java.io.*;
public class FileExample{
    public static void main(String[] arg){
        try{
        File f = new File("C:/Users/sujan/OneDrive/Desktop/GU/myfile.txt");
        FileWriter w= new FileWriter(f);
        w.write("Pagal Ho");
        w.write("Data is written in file");
        w.close();
        System.out.println("Data written sucessfully");
        }
        catch(Exception e){
            System.out.println("File cannot created");
        }

    }
}
