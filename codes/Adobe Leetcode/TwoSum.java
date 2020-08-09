//leetcode 1 Two sum
//solution

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int check=target-nums[i];
            if(map.containsKey(check)){
                return new int[]{map.get(check),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solutions");
    }
}