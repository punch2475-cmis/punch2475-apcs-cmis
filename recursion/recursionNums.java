public class recursionNums
{
    public static void main (String [] args)
    {
        int [] nums = {0,1,5,4,3,6,7,2,6,9,8,5,4,454,5,45,4,4,8,125479,455,45,};
        sort(nums);
        for (int i =0; i < nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
    }
    public static int[] sort(int [] nums)
    {
        boolean order = true;
        int min =0;
        while(order){
            for(int i=0; i < nums.length; i++){  
                for(int j=1; j < (nums.length-i); j++){  
                    if(nums[j-1] > nums[j]){  
                        //swap numbers  
                        min = nums[j-1];  
                        nums[j-1] = nums[j];  
                        nums[j] = min;  
                    }  
                } 
            }
            order = false;
        }
        return nums;
    }
}
