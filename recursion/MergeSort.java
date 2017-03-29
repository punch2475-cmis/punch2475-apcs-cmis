import java.util.Arrays;
public class MergeSort
{
    public static void main(String[] arg){
        int [] nums = new int []{8,6};
        int count =0;
        int count2= 0;
        sort(nums);
        /*for (int i =0; i < nums.length; i++){
        System.out.print(nums[i]+ " ");
        }
        for(int i = 0; i < nums.length;i++){
        count++;
        }*/
        int [] RArray = Arrays.copyOf(nums, nums.length/2); 
        for( int i = 0; i < RArray.length;i++){
            System.out.println(RArray[i]);

        }
        int [] SecArray = Arrays.copyOf(RArray, RArray.length/2);
        for(int i =0; i < SecArray.length; i++){
            System.out.println(SecArray[i]);
        }
        int [] left;
        int [] right;

    }

    /*public static int [][] split (int [] nums){
    int i =0;
    int Dnums = nums.length/2;
    int [] RArray;

    }
    /*while( i <= nums.length){
    RArray = Arrays.copyOf(nums, nums.length/2); 
    }

    }*/
    public static int[] sort(int [] nums){
        if (nums.length == 1 || nums.length == 0){
            return nums;
        }
        else{
            int sortNum = 0;
            if (nums.length/2 == 1){
                for(int i=0; i < nums.length; i++){  
                    for(int j=1; j < (nums.length-i); j++){  
                        if(nums[j-1] > nums[j]){  
                            //swap numbers  
                            sortNum = nums[j-1];  
                            nums[j-1] = nums[j];  
                            nums[j] = sortNum;  
                        }  
                    } 
                }

            }
            return nums;
        }
    }
    /*public static int [] merge(int [] nums){

    }

    /*public  void getLeast(int[] nums){
    while(nums.length > 0){
    for(int i =0; i < nums.length;i++){
    if(nums.length > 0){
    int [] RArray = Arrays.copyOf(nums, nums.length/2); 
    System.out.println(RArray[i]);
    }
    }
    System.out.println(nums.length);
    }
    }

    if(nums[j-1] > nums[j]){  
    //swap numbers  
    SortNum = nums[j-1];  
    nums[j-1] = nums[j];  
    nums[j] = SortNum;  
    }   
     */

    /*
     * 
     */
    /*public static int[] sort(int[] nums){
    int count =2;
    int SortNum =0;
    while(count > 0){
    for(int i =0; i < nums.length/2;i++){
    if(nums.length > 0){

    }
    else if(nums.length == 1){
    if(nums[i-1] > nums[i]){  
    //swap numbers  
    SortNum = nums[i-1];  
    nums[i-1] = nums[i];  
    nums[i] = SortNum;  
    } 
    }

    }
    count =0;
    }
    return nums;
    }*/
}
