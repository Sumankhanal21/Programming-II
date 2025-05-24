//4. Swap two numbers
public class Swap {
    void temp(){
         int a=10;
        int b=20;
        int c;
        System.out.println("Before : a="+a +"b="+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After : a="+a +"b="+b);
    }
    void withouttemp(){
        int a=10;
        int b=20;
        System.out.println("Before : a="+a +"b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After : a="+a +"b="+b);
    }
    public static void main(String[] args){
       Swap ob= new Swap();
       ob.temp();
       
    }
}
