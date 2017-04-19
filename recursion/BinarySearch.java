
public class BinarySearch
{
    public static void main (String [] args){
        int [] nums = new int []{1,2,3,5,7,8,17,20,25,27,29,30,37,50,57,77};
        int searchNum = 17;
        System.out.println(binarySearch(nums, 77));

    }

    public static int binarySearch(int [] nums, int searchNum){
        int first =0;
        int last = nums.length;
        int middle = (first + last)/2;

        while( first <= last){
            if(nums[middle] < searchNum){
                first = middle +1;

            }
            else if( nums[middle] == searchNum){

                return first;

            }
            else if( nums[middle] > searchNum){
                last = middle -1;
            }
            middle = (first+ last)/2;
            
        }


        return first;
    }
    // return nums;

}

