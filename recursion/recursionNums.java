public class recursionNums
{
    public static void main (String [] args){
        int [] nums = {0,1,5,4,3,6,7,2,6,9,8,5,4};

        int [] sortNums = new int[nums.length-1];
        sort(nums);
            
    }
    /*public static int[] sort(int [] nums){
        int [] sortNums = new int[nums.length -1];
        int max =0;
        int oldMax =0;
        int min = 0;
        for( int i = 0; i < nums.length; i++){
            if( i == 0 && nums[i] > nums[i++])
            {
                min = nums[i++] = sortNums[0];
                max =nums[i] = sortNums[nums.length-1];
            }
            else if ( nums[i++] > nums[i]){
                max = nums[i++] = sortNums[nums.length -1];
                min= nums[i] = sortNums[0];
            }
            else if (i!= 0 && max > nums[i]){
                max = sortNums[nums.length -1];
            }
            else if( i !=0 && nums[i] > max){
                oldMax= max = sortNums[nums.length -i];
                max = nums[i] = sortNums[nums.length -1];
            }
            else if( i != 0 && nums[i] > min){
                min = sortNums[0];
            }
            else if (i != 0 && min > nums[i]){
                min = sortNums[1];
                nums[i] = min = sortNums[0];
            }
        }
        return sort(sortNums);
    }*/
    
    public static int[] sort(int [] nums){
        int [] sortNums = new int[nums.length-1];
        boolean swap;
        int newNums;
        for(int i =0; i < nums.length; i++){
            if(nums[i] > nums[i++]){
                nums[i] = nums[i++];
                nums[i++] = nums[i];
                swap = true;
            }
            else if ( nums[i++] > nums[i]){
                nums[i] = nums[i++];
                nums[i++] = nums[i];
                swap = true;
            }
            else if (nums[i] < nums[i++]){
                swap = false;
                
            }
        }
        
        return sort(sortNums);
    }
}
