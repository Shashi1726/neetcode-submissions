class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>sf = new HashMap<>();
        Map<Character, Integer> hash = new HashMap();
        for(char c : s.toCharArray())
        {
            sf.put(c,sf.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray())
        {
            hash.put(c, hash.getOrDefault(c,0)+1);
        }
        if(sf.equals(hash))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
