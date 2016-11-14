public class rowCol
{
    public static void main ( String [] arg){
        int [][] grid = new int [10][40];
        
        for (int row =0; row < grid.length; row++){
            for (int col =0; col < grid[row].length;col++)
            {
                grid[row][col] = (int)(Math.random() *100);
            }
        }
        for (int row =0; row < grid.length; row++){
            for (int col =0; col < grid[row].length;col++)
            {
                 System.out.print(grid[row][col]+ " ");
            }
            System.out.println("\n");
        }
    }
}
