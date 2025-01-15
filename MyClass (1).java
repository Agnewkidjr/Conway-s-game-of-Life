
import java.util.*;
public class MyClass {
  public static void main(String args[]) {
   
    turns test = new turns(10,10);
    Scanner question = new Scanner(System.in);
    boolean continues =true;
    
    int x;
    int y;
    
    String continued;
    
    while(continues){
        System.out.println("Would you like to add alive points");
        continued = question.nextLine();
        if(continued.equals("Yes")){
            System.out.println("What is the row");
            x = question.nextInt();
            System.out.println("What is the col");
            y = question.nextInt();
           test.setAlive( x, y);
        }else if(continued.equals("no")){
            continues = false;
        }
    }
    while(true){
        test.doTurn();
        continued = question.nextLine();
    }
    
    
  }
}