public class insertionSort
{
    public static void main (String [] arg){
        int [] nums = new int []{5,9,8,2,4,6,3,7,1,10,31,45};
        insertion(nums);
        for (int i =0; i < nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
    }

    public static int[] insertion(int [] nums){
        int sortNum =0;
        for(int i = 0; i < nums.length;i++){
            for (int j = 1; j < nums.length; j++){
                if(nums[j] < nums[j-1]){
                    sortNum = nums[j];  
                    nums[j] = nums[j-1];  
                    nums[j-1] = sortNum; 
                }
                else if( nums[j] >= nums[j-1])  {  
                    nums[j] = nums[j];
                    nums[j-1] = nums[j-1];
                }
            }
        }
        return nums;
    }

}

