class Solution {
    public int[] plusOne(int[] digits) {
         int sum=0 , n=digits.length;
         for (int i=(n-1);i>=0;i--)
        {
           int power =  (int)Math.pow(10,i);
           sum  = sum + digits[n-i-1]*power;
        }
        sum = sum+1;
          System.out.print(sum);
        String temp = Integer.toString(sum);
        int[] arr = new int[temp.length()];
        for (int i=0;i<temp.length();i++)
        {
            arr[i] = temp.charAt(i) - '0';
        }
        return(arr);
    }
}