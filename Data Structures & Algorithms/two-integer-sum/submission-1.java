class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<int[]> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            arr.add(new int[]{nums[i], i});
        }
        arr.sort((a,b)-> Integer.compare(a[0],b[0]));
        int left = 0;
        int right = nums.length - 1;
        ArrayList<Integer> sd = new ArrayList<>();
        while(left < right)
        {
            int sum = arr.get(left)[0] + arr.get(right)[0];
            if(sum == target)
            {
                if(arr.get(left)[1] < arr.get(right)[1])
                {
                    sd.add(arr.get(left)[1]);
                    sd.add(arr.get(right)[1]);
                    break;
                }
                else
                {
                    sd.add(arr.get(right)[1]);
                    sd.add(arr.get(left)[1]);
                    break;
                }
            }
            else if(sum < target)
            {
                left++;
            }
            else if(sum > target)
            {
                right--;
            }
        }
        int[] result = new int[sd.size()];
        for (int i = 0; i < sd.size(); i++) 
        {
            result[i] = sd.get(i);
        }
    return result;
    }
}

