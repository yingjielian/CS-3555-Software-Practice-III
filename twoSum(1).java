class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> store = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            iza1f(!store.containsKey(nums[i]))
            {
                store.put((target - nums[i]), i);
            }
            else{
                return new int[]{i, store.get(nums[i])};
            }
        }
        
        throw new IllegalArgumentException("No avaliable output!");
        
    }
}