public class cell {
    private boolean alive;
    private int numberOfSurroundingAlive;
    
    public cell(){
        this.alive = false;
        this.numberOfSurroundingAlive = 0; 
    }
    public boolean nextTurn(){
        boolean outputAlive = this.alive; 
        //System.out.println("updated alive "+ this.alive);
        if(this.alive){
            if(numberOfSurroundingAlive ==2){
                outputAlive = true;
            }else if(numberOfSurroundingAlive<2){
                outputAlive = false;
            }else if(numberOfSurroundingAlive>3){
                outputAlive = false;
            }
            
        }else if(!this.alive){
            if(numberOfSurroundingAlive == 3){
                outputAlive = true;
            }
        }
        this.alive = outputAlive;
        return outputAlive;
    }
    public void setSurrounding(int numSurrounding){
         this.numberOfSurroundingAlive = numSurrounding;
    }
    public boolean ifAlive(){
        return this.alive;
    }
    public void setAlive(boolean a){
        this.alive = a;
    }
    public String toString(){
        if(this.alive){
            return "Alive";
            
        }else{
            return "dead";
        }
    }
}