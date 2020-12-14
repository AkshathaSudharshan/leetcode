import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashMap<Integer,Integer> map = new HashMap<>();
         boolean flag=false;
        for (int i=0;i<nums.length;i++)
        {
            int count=0;
            if (map.containsKey(nums[i]))
            {
                flag=true;
                break;
            }
            else
                map.put(nums[i],count);
        }
       return(flag);
        
    }
}
