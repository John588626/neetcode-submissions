class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> num = new HashSet<>();
       for(int i=0;i<nums.length;i++){
            num.add(nums[i]);
       }

       int Length = num.size();
       int arrayLength = nums.length;
       if(arrayLength==Length){
        return false;
       }

       else{
         return true;
       }
    }
        
}