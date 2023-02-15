import java.util.Arrays;

public class missingNumber{
    
    public static void main(String[] args) {

        // int[] arr  = { 5,3,4,2,1};
        // cycle(arr);
        // System.out.println(Arrays.toString(arr));
        
    }

    static void cycle(int[] nums)
    {
        // now we consider a index pointer
        int i =0;
        while(i<nums.length)
        {
            int correctIndex = nums[i];
            if(nums[i] < nums.length && nums[i]!= nums[correctIndex])
            {
                swap(nums , i , correctIndex);
            }
            else{
                i++;
            }
        }  
        // search for first missing number
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j)
            {
                return j;
            }
            
        } return nums.length;
    }

    static void swap(int[] arr  , int first , int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
