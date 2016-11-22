public class Test
{
    private int[][] nums;
    public Test(int d){
        nums = new int[d][d];

        /**********************************************************************************************\
         * Modify this constructor method                                                             *
         * it must populate the 2D Array nums with digits from 0-9 inclusive                          *
         * There must be ONE AND ONLY ONE 9 in the array.                                             *
         * The 9 must not be on the edge of the array (i.e. not in the first or last row or column)   *
         * Everything should work for any positive value for d.                                       *
         **********************************************************************************************/
    }
    int randomNineRow = (int)(Math.random() *5);
    int randomNineCol = (int)(Math.random() *5);
    public void showArray(){
        int random = 10;
        // 1pt ------ loops over every item in 2d array
        for ( int y = 0; y < nums.length; y++ ){
            for ( int x = 0; x < nums[y].length; x++ ){
                nums[y][x] = (int)(Math.random() * 10);// 1pt ------ sets item to correct possible value
                if(nums[y][x] == 9){
                    nums[y][x] = (int)(Math.random() * 6);
                }
                // 1pt ------ sets exactly 1 random item to 9
                if (randomNineRow == 0 ){
                    randomNineRow = (int)(Math.random() *6);
                    randomNineCol = (int)(Math.random() *6);
                }
                else if (randomNineRow==9){
                    randomNineRow = (int)(Math.random() *5);
                    randomNineCol = (int)(Math.random() *5);
                }
                else if ( randomNineCol== 0 || randomNineCol == 9){
                    randomNineRow = (int)(Math.random() *5);
                    randomNineCol = (int)(Math.random() *5);
                }
                nums[randomNineRow][randomNineCol] = 9;        // 1pt ------ sets exactly 1 random item to 9
                System.out.print(nums[y][x]);
            }
            System.out.println();
            // 1pt ------ prints out 2d array in row major order
        }
        System.out.println(randomNineRow + "\t"+ (randomNineCol));
    }  

    public int[][] getNineAndFriends(){
        int[][] result = new int[3][3];
        int index =0;
        int [][]Newresult = new int [3][3];
        int ValueofNineRow =0;
        int ValueofNineCol =0;
        // 1pt ------ correctly determines location of 9
        for ( int y = 0; y < result.length; y++ ){
            for ( int x = 0; x < result[y].length; x++ ){
                ValueofNineRow =randomNineRow -index;
                ValueofNineCol =randomNineCol -index;
                //Newresult[y][x]= result[ValueofNineRow][ValueofNineCol];
            }
            //result = Newresult;
        }
        // 0pt ------- gets correct numbers in 2d result array
        // 0pt ------- gets numbers in column major order in 2d result array 

        //Modify this method so that it returns the 9 and the 8 digits surrounding it in column major order
        return result;
    }

    public static void main(String[] args){
        Test test = new Test(10);
        test.showArray();
        int[][] nine = test.getNineAndFriends();
        for( int y = 0; y < nine.length; y++){
            for( int x = 0; x < nine.length; x++){
                System.out.print(nine[y][x]);

            }
            System.out.println();
        }

    }
}
