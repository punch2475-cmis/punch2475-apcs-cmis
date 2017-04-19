public class sequentialSearch
{
    public static void main (String arg[]){
         int [] nums = new int []{1,2,3,5,7,8,17,20,25,27,29,30,37,50,57,77};
         int searchNum = 17;
         System.out.println(sequentialSearch(nums, 17));
    }
    public static int sequentialSearch(int [] nums, int searchNum){
        int i =0;
        for ( i = 0; i < nums.length; i++){
            if( nums[i] == searchNum){
                return i;
                
            }
            
        }
        return i;
    }
}
