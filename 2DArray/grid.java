
public class grid
{
    public static void main (String [] args){
        int [][] grid = new int [][]{{ 0 , 1 ,2 , 3 , 4, 5},
                                     { 6 , 7 , 8 , 9, 10, 11},
                                     {12 ,13 ,14 ,15, 16, 17}};
        /*for(int y = 0; y < grid.length; y++){
            for(int x =0; x < grid[y].length; x++){
                System.out.println(grid[y][x]);
            }
        }*/
        
        
        for(int x = 0; x < grid[0].length; x++){
            for(int y =0; y < grid.length; y++){
                System.out.println(grid[y][x]);
            }
        }
        /*for(int y = 0; y < grid[0].length; y++){
            for(int x =0; x < grid[y].length; x++){
                System.out.print(grid[y][x]);
            }
        }*/
    }
}
