package Inheritance.multiLevelInheritance;

public class semester extends faculty {
    public void sem(){
        System.out.println("There are total 8 semester and project should be done in each even Semester");
    }
    public static void main(String args[]){
        semester se=new semester();
        se.gandaki();
        se.bit();
        se.sem();
    }
}
