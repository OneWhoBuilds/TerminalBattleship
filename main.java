
/**
 * @title Seek and Destroy
 * @description
 *      A battleship clone, Played against the computer
 * @author Aidan Cox
 * @version 5 06/21/2025
 */

import java.util.Scanner;

public class main
{
    public static void main(String[] args) throws InterruptedException , java.io.IOException
    {
        
        //gird[0][x] is x coord. //grid[1][x] is y coord
        boolean[][] grid = new boolean[10][10];
        boolean[][] gridAI = new boolean[10][10];
        //grids tracking which spaces have been attacked
        boolean[][] hitGrid = new boolean[10][10];
        boolean[][] hitGridAi = new boolean[10][10];
        
        int[][] boatTracker = new int[10][10]; //first xy, and last xy, checks all in between, if all true battleship sunk
        int[][] boatTrackerAI = new int[10][10];
        
        //setLoc(arr);
        //tester(hit);
        
        printGrid(grid, hitGrid, false);
        
        //printGrid(hit, arr, missiles, true);
        System.out.println("\n\nInput 0 to Quit\n");
        Scanner input = new Scanner(System.in);
        String in;
        
        //printGrid(hit, arr, missiles, switchCase());
        
        System.out.print("\nSelect a coordinate: ");
        
        in = input.nextLine().toUpperCase().trim();
        
        if(in.length() == 3)
            {
                if(Character.isLetter(in.charAt(0)) && Character.isDigit(in.charAt(1)) && 
                Integer.parseInt(Character.toString(in.charAt(1))) != 0 && Character.isDigit(in.charAt(2)) && Integer.parseInt(Character.toString(in.charAt(2))) == 0)
                {
                    //missiles = switchCase(hit, in, missiles, false, 0);
                }
                else
                    System.out.print("\nInput Valid Coordinate: ");
            }
            else if(in.length() == 2)
            {
                if(Character.isLetter(in.charAt(0)) && Character.isDigit(in.charAt(1)) && Integer.parseInt(Character.toString(in.charAt(1))) != 0)
                {
                    //missiles = switchCase(hit, in, missiles, false, 0);
                }
                else
                    System.out.print("\nInput Valid Coordinate: ");
            }
            else
            {
                System.out.print("\nInput Valid Coordinate: ");
            }
        
        clearScreen();

        input.close();
    }
    
    public static void setShipLocations(boolean[][] grid, int[][] shipTracker)
    {
        int length = 2;
        boolean valid = false;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++)  //2 2 space, 1 3 space, 1 4 space, 1 5 space.
        {
            if(i > 0) 
            {
                length += i - 1;
            }
            System.out.println("Ship Length: " + length);
            System.out.print("Select Bow Coordinate: ");
        
            //check to make sure spot isn't taken and there is suitable room for ship of that length in any cardinal direction
            do
            {
                
                
                
                for(int j = 0;  j < length;j++)//this will check cardinal directions
                {
                    
                }
            }            
            while(!valid);
            
            System.out.print("Select Stern Coordinate: ");
            
            //check to make sure ship isn't diagonal, and ship length is in valid spot
            
        }

        input.close();
    }

    public static void clearScreen() throws InterruptedException , java.io.IOException
    {
        if (System.getProperty("os.name").contains("Windows")) {
            // Windows command
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            // Unix/Linux/Mac command
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }
    }
    
    public static boolean switchCase(boolean[][] hit, String in, boolean mode, int dir)
    {
        hit[(Integer.parseInt(in) + 1) % 10][in.charAt(0) - 64] = true;
        
        return(mode);
    }
    
    public static void printGrid(boolean[][] grid, boolean[][] hitGrid, boolean bool)
    {
        StringBuilder gridString =  new StringBuilder();
        if(bool)
            gridString.append("Defence Terminal\n");
        else
            gridString.append("Attack Terminal\n");
            
        
        gridString.append("  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |\n");
        for(int j = 0; j < grid[1].length; j++)//goes to 9 in ther y
        {
           for(int i = 0; i < grid[0].length; i++)//goes to 9 in the x
           {
                if(i == 0)
                {
                    gridString.append((char)(65 + j) + " |");//this is based on J
                    
                    if(grid[0][i] == hitGrid[0][i] && 
                    grid[1][i] == hitGrid[1][i] && grid[0][i] && grid[1][i])
                    {
                        gridString.append(" X |");
                    }
                    else if(grid[0][i] && grid[1][i] && bool)
                    {
                        gridString.append(" S |");
                    }
                    else if (hitGrid[0][i] && hitGrid[1][i])
                        gridString.append(" O |");
                    else
                        gridString.append("   |");
                }
                else if(i == 9)
                {
                    if(grid[0][i] == hitGrid[0][i] && 
                    grid[1][i] == hitGrid[1][i] && grid[0][i] && grid[1][i])
                    {
                        gridString.append("  X |");
                    }
                    else if(grid[0][i] && grid[1][i] && bool)
                    {
                        gridString.append("  S |");
                    }
                    else if (hitGrid[0][i] && hitGrid[1][i])
                        gridString.append("  O |");
                    else
                        gridString.append("    |");
                        
                    gridString.append("\n");
                }
                else
                {
                    if(grid[0][i] == hitGrid[0][i] && 
                    grid[1][i] == hitGrid[1][i] && grid[0][i] && grid[1][i])
                    {
                        gridString.append(" X |");
                    }
                    else if(grid[0][i] && grid[1][i] && bool)
                    {
                        gridString.append(" S |");
                    }
                    else if (hitGrid[0][i] && hitGrid[1][i])
                        gridString.append(" O |");
                    else
                        gridString.append("   |");
                }
           }
        }
        System.out.print(gridString.toString());
    }
    
    
    
    public static void setAILoc(boolean[][] grid, int[][] shipTracker)
    {
        
        
    }
    
    public static int checkCoords(int coord, boolean[] arr, int dir, int i)
    {
        
        return(0);
    }
    
    private static int nextHit = -1, lastDirection = -1;
    //private static boolean prevAttempt;
    
    public static void AI(boolean[] aiHit, boolean[] arr)
    {
        
    }
    
    public static void highScore(int score) //read and save to file for scores, compare current scores with previos scores to find its place.
    {
        int highScores[] = new int[10], temp, i;
        
        //read - scores should be given dates as well
        
        for(i = 0; i < highScores.length; i++)//done after reading
        {
            if(score > highScores[i])
            {
                if(i == 0)
                {
                    highScores[i] = score;
                }
                else
                {
                    temp = highScores[i];
                    highScores[i - 1] = temp;
                    highScores[i] = score;
                }
            }
        }
        
        
        //print out high scores - new score should also be there and easily identifiable, even if not in top 10.
        //save
    }
}