import javax.swing.JOptionPane;
public class Array2d7
{
    public static void main ( String [] arg){
        int [][] grid = new int [10][40];
        String [][] grid2 = new String [10][40];
        int x =0;
        int y =0;
        int p =0;
        /*for (int row =0; row < grid.length; row++){
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
        }*/
        for ( x =0; x < grid2.length; x++){
            for ( y =0; y < grid2[x].length;y++)
            {
                grid[x][y]=  (int)(Math.random() *100);
                grid2[x][y] = "X";
            }
        }
        for ( x =0; x < grid2.length; x++){
            for ( y =0; y < grid2[x].length;y++)
            {
                System.out.print(grid[x][y]);
                System.out.print(grid2[x][y]+ " ");
            }
            System.out.println("\n");       
        }
        int numZeroRow = (Integer.parseInt(JOptionPane.showInputDialog("Guess where is zero? row? ")));
        int numZeroCol = (Integer.parseInt(JOptionPane.showInputDialog("Guess where is zero? col? ")));
        if(grid[numZeroRow][numZeroCol] == 0){
            System.out.println("YAY");
        }
        else if(grid[numZeroRow][numZeroCol] !=0){
            System.out.println("Try again");
        }

    }
    /*public Array2d7()
    {
    }*/
}
