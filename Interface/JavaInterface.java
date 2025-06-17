  package Interface;
 interface Animal{
    public void display();
 }

 public class JavaInterface implements Animal{
    public static void main(String[]args){
        JavaInterface ob=new JavaInterface();
        ob.display();
    }public void display(){
    System.out.println("Cat:Meow....!");
}
 }