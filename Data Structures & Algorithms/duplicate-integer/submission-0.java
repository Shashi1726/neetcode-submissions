class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> sd = new HashSet<>();
        for(int i : nums)
        {
            sd.add(i);
        }
        int x = sd.size();
        int y = nums.length;
        if(x==y)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}