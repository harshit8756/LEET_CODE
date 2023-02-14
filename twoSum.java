public class twoSum {
    public static void main(String[] args) {
        
    }
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan&id=binary-search-i
//numbers = [2,7,11,15], target = 9
// Output: [1,2]
    public int[] twoSum(int[] numbers, int target)
    {
        int s = 0;
        int e = numbers.length -1;
        while(s<e)
        {
            if(numbers[s] + numbers[e] == target)
            {
                int[] result = {s+1, e+1};
                return result;
            }
            else if(numbers[s] + numbers[e] > target)
            {
                e--;
            }
            else
            {
                s++;
            }
        } int[]  a = {-1,-1};
        return a ;
    }
}
