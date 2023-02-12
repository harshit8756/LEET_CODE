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
      for(int i=0;i<arr1.length;i++)
      { 
        int first = arr1[i];
        boolean flag = false;
        for(int j=0;j<arr2.length;j++)
        {
            int second = arr2[j];
            if(Math.abs(second  - first) <= d)
            {
               flag= true;
               break;
            }

        }
        if(flag==false)
        {
            count ++;
        }
      } return count;
    }
}
