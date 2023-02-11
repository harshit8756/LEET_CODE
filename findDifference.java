public class findDifference {
    public static void main(String[] args) {

        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d=2;
        System.out.println(findDifferenceintwoarray(arr1, arr2, d));
        
    }

    static int findDifferenceintwoarray(int[] arr1 , int[] arr2 , int d)
    {
      int count = 0;
      for(int i =0;i<arr1.length;i++)
      {
        int x=0;
        for(int j=0;j<arr2.length;j++)
        {
            int difference = Math.abs(i-j);
            if(difference<=d)
            {
                j=arr2.length;
            }
            else{
                x++;
            }
        } if(x==arr2.length)
        {
            count++;
        }
      } return count; 
    }
}
