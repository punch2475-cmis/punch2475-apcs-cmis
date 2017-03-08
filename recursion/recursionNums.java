public class recursionNums
{
    public static void main (String [] args){
        int [] nums = {0,1,5,4,3,6,7,2,6,9,8,5,4};

        
            
    }
    public static int[] sort(int [] nums){
        int max =0;
        int min = 0;
        for( int i = 0; i < nums.length; i++){
            if( i == 0 && nums[i] > nums[i++])
            {
                min = nums[i++] = nums[0];
                max =nums[i] = nums[nums.length-1];
            }
            else if ( nums[i++] > nums[i]){
                max = nums[i++] = nums[nums.length -1];
                min= nums[i] = nums[0];
            }
            else if (i!= 0 && max > nums[i]){
                max = max;
            }
            
        }
    }
}
