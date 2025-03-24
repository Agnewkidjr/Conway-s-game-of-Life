import java.util.*;
public class turns{
    private  int amountTurnsPassed;
    private grid grid1;
    private grid grid2;
    private int height;
    private int width;
    
    
    public turns(int h,int w){
        this.height = h;
        this.width =  w;
        this.amountTurnsPassed = 0;
        this.grid1 = new grid(w,h);
        this.grid2 = new grid(w,h);
    }
    
    public void setAlive(int row,int col){
        if (amountTurnsPassed == 0){
            grid1.setAlives(row,col);
        }else if (amountTurnsPassed %2 ==0){
            grid2.setAlives(row,col);
        }else{
            grid1.setAlives(row,col);
        }
        //System.out.println("amount of turns passed " + amountTurnsPassed);
    }
    public void setDead(int row,int col){
        
        if (amountTurnsPassed == 0){
            grid1.setDead(row,col);
        }else if (amountTurnsPassed %2 ==0){
            grid2.setDead(row,col);
        }else{
            grid1.setDead(row,col);
        }
        
    }
    public void printgrid(){
        grid1.print();
    }
    public void doTurn(){
        cell currnetCell;
        if (amountTurnsPassed %2 ==0){
            grid1.doturn();
            for(int row = 0; row < height;row++){
                for(int col = 0; col < width; col++){
                   currnetCell = (grid1.getCell(row,col));
                   
                   currnetCell.nextTurn();
                   if(currnetCell.ifAlive()){
                    //System.out.println(currnetCell.ifAlive());
                       grid2.setAlives(row,col);
                   }else{
                       grid2.setDead(row,col);
                   }
                   currnetCell = null;
                   
                }
            }
           
            grid2.print();
        }else{
             grid2.doturn();
            for(int row = 0; row < height;row++){
                for(int col = 0; col < width; col++){
                   currnetCell = (grid2.getCell(row,col));
                   currnetCell.nextTurn();
                   //System.out.println("currnetCell is; "+ currnetCell);
                   if(currnetCell.ifAlive()){
                       grid1.setAlives(row,col);
                   }else{
                       grid1.setDead(row,col);
                   }
                   currnetCell = null;
                   
                }
            }
            //System.out.println("currnet grid  is;  grid 1");
            grid1.print();
        }
        amountTurnsPassed++;
    }
            
        
    
}