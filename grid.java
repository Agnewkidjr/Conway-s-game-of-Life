import java.util.*;
public class grid{
    private int width;
    private int height;
    private ArrayList<ArrayList<cell>> defaultGrid;
    public grid(int w ,int h){
        width = w;
        height = h;
        defaultGrid =new ArrayList<ArrayList<cell>>();
        for(int row = 0; row < height;row++){
            defaultGrid.add(new ArrayList<cell>());
            for(int col = 0; col < width; col++){
               (defaultGrid.get(row)).add(new cell());
            }
        }
        
    }
    public int checkSurround(int w,int l){
         int currentSurround = 0;
        if(l == 0 ){
            if(w == 0){
                if(defaultGrid.get(l).get(w+1).ifAlive()){
                    currentSurround++;
                } if(defaultGrid.get(l+1).get(w).ifAlive()){
                    currentSurround++;
                } if(defaultGrid.get(l+1).get(w+1).ifAlive()){
                     currentSurround++;
                }
            }else if(w == width-1){
                if(defaultGrid.get(l).get(w-1).ifAlive()){
                    currentSurround++;
                } if(defaultGrid.get(l+1).get(w).ifAlive()){
                    currentSurround++;
                } if(defaultGrid.get(l+1).get(w-1).ifAlive()){
                     currentSurround++;
                }
            }else{
                if(defaultGrid.get(l).get(w-1).ifAlive()){
                    currentSurround++;
                } if(defaultGrid.get(l+1).get(w).ifAlive()){
                    currentSurround++;
                } if(defaultGrid.get(l+1).get(w-1).ifAlive()){
                     currentSurround++;
                } if(defaultGrid.get(l+1).get(w+1).ifAlive()){
                     currentSurround++;
                }
            }
        }else if(l == height-1){
            if(w == 0){
                if(defaultGrid.get(l).get(w+1).ifAlive()){
                    currentSurround++;
                } if(defaultGrid.get(l-1).get(w).ifAlive()){
                    currentSurround++;
                } if(defaultGrid.get(l-1).get(w+1).ifAlive()){
                     currentSurround++;
                }
            }else if(w == width-1){
                if(defaultGrid.get(l).get(w-1).ifAlive()){
                    currentSurround++;
                } if(defaultGrid.get(l-1).get(w).ifAlive()){
                    currentSurround++;
                } if(defaultGrid.get(l-1).get(w-1).ifAlive()){
                     currentSurround++;
                }
            }else{
                if(defaultGrid.get(l).get(w-1).ifAlive()){
                    currentSurround++;
                } if(defaultGrid.get(l-1).get(w).ifAlive()){
                    currentSurround++;
                } if(defaultGrid.get(l-1).get(w-1).ifAlive()){
                     currentSurround++;
                } if(defaultGrid.get(l-1).get(w+1).ifAlive()){
                     currentSurround++;
                }
            }
        }else if(w == 0){
             if(defaultGrid.get(l).get(w+1).ifAlive()){
                currentSurround++;
            } if(defaultGrid.get(l-1).get(w).ifAlive()){
                currentSurround++;
            } if(defaultGrid.get(l-1).get(w+1).ifAlive()){
                 currentSurround++;
            } if(defaultGrid.get(l+1).get(w).ifAlive()){
                currentSurround++;
            } if(defaultGrid.get(l+1).get(w+1).ifAlive()){
                 currentSurround++;
            }
        }else if(w ==  width-1){
             if(defaultGrid.get(l).get(w-1).ifAlive()){
                currentSurround++;
            } if(defaultGrid.get(l-1).get(w).ifAlive()){
                currentSurround++;
            } if(defaultGrid.get(l-1).get(w-1).ifAlive()){
                 currentSurround++;
            } if(defaultGrid.get(l+1).get(w).ifAlive()){
                currentSurround++;
            } if(defaultGrid.get(l+1).get(w-1).ifAlive()){
                 currentSurround++;
            }
        }else {
            if(defaultGrid.get(l).get(w-1).ifAlive()){
                currentSurround++;
            } if(defaultGrid.get(l).get(w+1).ifAlive()){
                currentSurround++;
            } if(defaultGrid.get(l-1).get(w).ifAlive()){
                currentSurround++;
            } if(defaultGrid.get(l-1).get(w-1).ifAlive()){
                 currentSurround++;
            }if(defaultGrid.get(l-1).get(w+1).ifAlive()){
                currentSurround++;
           } if(defaultGrid.get(l+1).get(w).ifAlive()){
                currentSurround++;
            } if(defaultGrid.get(l+1).get(w-1).ifAlive()){
                 currentSurround++;
            } if(defaultGrid.get(l+1).get(w+1).ifAlive()){
                 currentSurround++;
            } 
        }
        
        return  currentSurround;   
    }
    public void print(){
        ConsoleGrid current = new ConsoleGrid(width);
        for(int row = 0; row < height;row++){
            for(int col = 0; col < width; col++){
                if(defaultGrid.get(row).get(col).ifAlive() == true){
                    current.toggleSquare( row,  col);
                }
            }
        }
        current.displayGrid();
    }
    public void doturn(){
        for(int row = 0; row < height;row++){
            for(int col = 0; col < width; col++){
               defaultGrid.get(row).get(col).setSurrounding(checkSurround(col,row));
            }
        }
        
       
    }
    
    public void setAlives(int x, int y){
        defaultGrid.get(x).get(y).setAlive(true);
    }
    public void setDead(int x, int y){
        defaultGrid.get(x).get(y).setAlive(false);
       
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height; 
    }
    public cell getCell(int row,int col ){
        return defaultGrid.get(row).get(col); 
    }
    
}