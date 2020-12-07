class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0,flag=0,index=0;
        if (target>nums[nums.length-1])
        {
            index=nums.length;
            flag=1;
           
        }

        while(i<nums.length)
        {
            if (target==nums[i]||nums[i]>target)
            {
              index=i;
              flag=1;
              break;
           }
            i++;
        }
        return(index);
    }
}