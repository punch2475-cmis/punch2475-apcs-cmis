import javax.swing.JOptionPane;
public class Array2D3
{
    public static void main (String [] arg){
        int rowinput = Integer.parseInt(JOptionPane.showInputDialog("Number of row"));
        int columninput = Integer.parseInt(JOptionPane.showInputDialog("Number of column"));
        int grid [][] = new int[rowinput][columninput];
        
        for (int index = 0; index < columninput; index++)
        {
            System.out.print(index + "  ");
        }
        System.out.print("\n");
        for (int x = 1; x <grid.length; x++){
            System.out.print( x + "  ");
            for (int y = 1; y< grid[x].length; y++){
                grid[x][y] = x*y;
                System.out.print( grid[x][y] + "  ");
            }
            System.out.println("\n");
        }
        
    }
}

