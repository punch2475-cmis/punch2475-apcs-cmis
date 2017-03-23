import java.util.Arrays;
public class MergeSort
{
    public static void main(String[] arg){
        int [] nums = new int []{0,1,5,4,3,6,7,2,6,9,8,5,4,454,5,45,4,4,8,125479,455,45,};
        for(int i = 0; i < nums.length;i++){
            //System.out.println(nums[i]);
        }
         int [] RArray = Arrays.copyOf(nums, 1); 
         for( int i = 0; i < RArray.length;i++){
             System.out.println(RArray[i]);
            }
    }
    /*public static int [][] split (int [] nums){
        int i =0;
        int Dnums = nums.length/2;
        int [] RArray;
        while( i <= nums.length){
           RArray = Arrays.copyOf(nums, nums.length/2); 
        }

        
    }
    public static int[] sort(int [] nums){
        
        
    }
    public static int [] merge(int [] nums){
        
    }*/
}
