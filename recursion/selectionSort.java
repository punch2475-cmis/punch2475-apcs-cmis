public class selectionSort
{
    public static void main (String [] arg){
        int [] nums = new int []{45,656,565,48,96,155,98,8,86,9,8958,878,76};
        selection(nums);
    }

    public static int[] selection(int[] nums){
        int min = nums[0];
        int stored = 0;
        int limit = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                if( limit < min )
                {
                    min = nums[i];
                }
            }
            //System.out.print(nums[i] + " ");
        }
        System.out.println("Min: " + min);
        //System.out.println("=,=");
        for(int i = 0; i < nums.length; i++){
            if( nums[i] == min )
            {
                stored = nums[0];
                //System.out.print("Stored " + stored + " ");
                nums[0] = nums[i];
                //System.out.print("nums[0] " + nums[0] + " ");
                nums[i] = stored;
                limit = min;
                nums[0] = min;
            }
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        return nums;
    }

}
