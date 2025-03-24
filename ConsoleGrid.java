import java.util.Scanner;
/*
this class was written by chat gpt so the displaying of the grid works with the correct formula
I have also made modifications so that it meats my uses
 */
public class ConsoleGrid {

    private  int GRID_SIZE;           
    private static final char BLACK = '■';            // Black square
    private static final char WHITE = '□';            // White square
    private char[][] grid;                            // Grid array

    public ConsoleGrid(int inpGridSize) {
        GRID_SIZE = inpGridSize;
        initializeGrid();
        //run();
    }

    // Method to initialize the grid with alternating black and white squares
    private void initializeGrid() {
        grid = new char[GRID_SIZE][GRID_SIZE];

        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                grid[row][col] = WHITE;
            }
        }
    }

    // Method to display the grid in the console
    public void displayGrid() {
        System.out.println("\nGrid:");
        System.out.print("   ");
        
        // Column headers
        for (int col = 0; col < GRID_SIZE; col++) {
            System.out.print(col + " ");
        }
        System.out.println();

        for (int row = 0; row < GRID_SIZE; row++) {
            
            System.out.print(row + " | ");  // Row header
            for (int col = 0; col < GRID_SIZE; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    

    // Method to toggle a square's color
    public void toggleSquare(int row, int col) {
        if (grid[row][col] == BLACK) {
            grid[row][col] = WHITE;
        } else {
            grid[row][col] = BLACK;
        }
    }
    
    
}
