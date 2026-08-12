class Solution {
    public boolean isPalindrome(String s) {
        String gh = s.toLowerCase().replace(" ","");
        StringBuilder sk = new StringBuilder();
        for(char c : gh.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                sk.append(c);
            }
        }
        char[] arr1 = sk.toString().toCharArray();
        char[] arr2 = new char[arr1.length];
        for(int i=0; i<arr2.length; i++)
        {
            arr2[i] = arr1[arr2.length - i -1];
        }
        
        if(Arrays.equals(arr2, arr1)) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
