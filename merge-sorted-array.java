class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int j=0;
         for(int i=m;i<m+n;i++)
     {
             if(j<nums2.length)
             {
               nums1[i] = nums2[j];
               j++;   
             }
            
     }
    Arrays.sort(nums1);
    for(int i=0;i<nums1.length;i++)
        System.out.print(nums1[i]+" ");
        
    }
}
