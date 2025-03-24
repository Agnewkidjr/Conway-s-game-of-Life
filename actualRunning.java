
import java.util.*;
public class actualRunning {
  
  public static void running(int numTurns, turns currentTurn){
    Scanner turnsContinue = new Scanner(System.in);
    boolean continuing = true;
    String answer;
    while(continuing){
      
      for(int i = 0; i< numTurns;i++){
        currentTurn.doTurn();
        System.out.println("");
       }
      System.out.println("Would you like to do another "+ numTurns + " turns ?");
      answer = turnsContinue.nextLine();
       if(answer.equals("Yes")||answer.equals("yes")){
        continuing = true;
       }else if(answer.equals("no")||answer.equals("No")){
        continuing = false;

       }
    }
    turnsContinue.close();
    
  }
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
        if(continued.equals("Yes")||continued.equals("yes")){
            System.out.println("What is the row");
            x = question.nextInt();
            System.out.println("What is the col");
            y = question.nextInt();
           test.setAlive( x, y);
        }else if(continued.equals("no")||continued.equals("No")){
          test.printgrid();
          System.out.println("");
          continues = false;
        }
    }
    running( 10,  test);
    
    question.close();
  }
}