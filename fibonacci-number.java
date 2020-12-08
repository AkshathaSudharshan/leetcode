class Solution {
    public int fib(int N) {
        int fib0=0,fib1=1,fib=0;
        if(N==0)
            fib=0;
        else if (N==1||N==2)
            fib=1;
        else
        {
           for (int i=2;i<=N;i++)
           {
              fib=fib1+fib0;
              fib0 = fib1;
              fib1 = fib;
           } 
        }
        
        return(fib);
    }
}