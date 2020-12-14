class Solution {
    public boolean isPalindrome(int x) {
        boolean flag=true;
        String n = String.valueOf(x);
         for (int i=0,j=n.length()-1;i<(n.length())/2;i++,j--)
        {
            if (n.charAt(i)!=n.charAt(j))
                flag=false;
        }
       return(flag);
        
    }
}
