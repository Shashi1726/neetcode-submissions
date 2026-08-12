class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap();
        for(int i : nums)
        {
            hash.put(i,hash.getOrDefault(i,0)+1);
        }
        List<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : hash.entrySet())
        {
            list.add(new int[]{entry.getKey(), entry.getValue()});
        }
        list.sort((a, b) -> b[1] - a[1]);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i)[0];
        }
        return result;
    }
}
