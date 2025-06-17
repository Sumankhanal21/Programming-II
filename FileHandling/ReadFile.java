package FileHandling;

import java.io.*;

public class ReadFile {
    public static void main(String[] args){
        try{
        FileReader f=new FileReader("C:/Users/sujan/OneDrive/Desktop/GU/myfile.txt");
        BufferedReader bf=new BufferedReader(f);
        String data;
        while ((data=bf.readLine())!= null) {
            System.out.println(data);
        }
        f.close();

    }
    catch(Exception e){
        System.out.println("File not found");
    }
}
}
