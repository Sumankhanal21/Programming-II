package FileHandling;
import java.io.*;
public class AppendEx {
    public static void main(String [] args){
    try{
    FileWriter w= new FileWriter("C:/Users/sujan/OneDrive/Desktop/GU/myfile.txt",true);
    w.write(" Ghar Ja vai Ghar Ja.....!");
    w.write(" Ta pagal ho!" );
    w.close();
    System.out.println("append sucessfully");
}
catch(Exception e){
    System.out.println("File not found");
}
}
}