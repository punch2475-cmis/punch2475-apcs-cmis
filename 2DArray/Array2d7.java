import javax.swing.JOptionPane;
public class Array2d7
{
    public static void main ( String [] arg){
        int rowinput = Integer.parseInt(JOptionPane.showInputDialog("Number of row"));
        int columninput = Integer.parseInt(JOptionPane.showInputDialog("Number of column"));
        int [][] grid = new int [rowinput][columninput];
        String [][] grid2 = new String [rowinput][columninput];
        int randomZeroRow = (int)(Math.random() *rowinput);
        int randomZeroCol = (int)(Math.random() *columninput);
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
        for ( int x =0; x < grid2.length; x++){
            for (int y =0; y < grid2[x].length;y++)
            {
                grid[x][y]=  (int)(Math.random() *99)+1;
                //System.out.print( "X");
                grid[randomZeroRow][randomZeroCol] =0;
                System.out.print(grid[x][y] + "  ");
            }
            System.out.println("\n"); 
        } 
        System.out.print ("Zero:" + randomZeroRow + " , "+ randomZeroCol);

        while (p <3){
            int numZeroRow = (Integer.parseInt(JOptionPane.showInputDialog("Guess where is zero? row? ")));
            int numZeroCol = (Integer.parseInt(JOptionPane.showInputDialog("Guess where is zero? col? ")));

            if(grid[numZeroRow][numZeroCol] == 0){
                System.out.println("YAY");
                p =3;
            }
            else if(grid[numZeroRow][numZeroCol] !=0){
                System.out.println("Try again, You are off by" + (randomZeroRow -numZeroRow) + " , " + (randomZeroCol - numZeroCol) );
                p++;
            }
        }
    }
    /*public Array2d7()
    {
    }*/
}
