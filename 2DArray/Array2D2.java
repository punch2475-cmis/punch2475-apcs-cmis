public class Array2D2
{
    public static void main (String [] main){
            int [][] grid = new int [3][5];
            int num = 1;
            int totalsum =0;  
            int colnum =1;


        for(int y = 0; y < grid.length; y++){
            int rowsum =0;
            for(int x =0; x < grid[y].length; x++){
                grid[y][x] = num;
                System.out.print(grid[y][x]+ "  ");
                rowsum += num ; 
                num++;
                totalsum += grid[y][x];
            }
            System.out.println("\n");
            System.out.println("Row total " + rowsum);
            System.out.println ("total sum" + totalsum);
            }
         for(int x = 0; x < grid[0].length; x++){
             int colsum =0;
            for(int y =0; y < grid.length; y++){
                colsum += grid[y][x];
            }
            System.out.println("Col total " + colsum + " ");
        }
        }

    }

