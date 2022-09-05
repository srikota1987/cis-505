/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Test Fan App to display the toString results.
    Created by Srilakshmi Kota
*/ 
public class TestFanApp {


     public static void main(String []args){
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.MEDIUM, true, 8.0, "Blue");
        
        
        System.out.println(fan1);
        System.out.println(fan2);
        
     }
}
