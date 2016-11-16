public class Array2DPracticeTest
{
    public static void main (String [] args){
        int [][] grid = new int [20][20];
        int sumOfRow = 0;
        int sumOfCol =0;
        int sumOfRowMax =0; 
        int sumOfColMax =0; 
        int line =0;
        int line2 =0; 
        for(int x = 0; x < grid.length; x++){
            for(int y =0; y < grid[x].length; y++){
                grid[x][y]=  (int)(Math.random() * 10);
                System.out.print(grid[x][y]);
                sumOfRow += grid[x][y];
            }
            System.out.print(" \t " + sumOfRow + "\t" + x);
            if( sumOfRow > sumOfRowMax){
                sumOfRowMax = sumOfRow;
                line = x;
            }
            sumOfRow =0;
            System.out.println("\n");
            //System.out.println(SumofRowMax);
        }
        System.out.println("The greatest sum of the row major"+ "\t"+ line);
        System.out.println("\n");
        for (int x =0; x < grid[0].length; x++){
            for(int y=0; y < grid.length;y++){
                System.out.print(grid[y][x]);
                sumOfCol += grid[y][x];
            }
            System.out.print(" \t " + sumOfCol + "\t" + x);
            if( sumOfCol > sumOfColMax){
                sumOfColMax = sumOfCol;
                line2 = x;
            }
            sumOfCol =0;
            System.out.println("\n");
         }
        //for (int i = 0; i < sumOfRow.l
        System.out.println("The greatest sum of the column major"+ "\t"+ line2);
    }
}