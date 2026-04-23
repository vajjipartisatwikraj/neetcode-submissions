class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lp = 0;
        int rp = 0;
        
        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();

        while(lp <= rp && rp < s.length()){
            char right = s.charAt(rp);

            System.out.println("LP:" + lp + " RP:" + rp);
            
            while(!set.add(right)){
                char left = s.charAt(lp);
                if(set.contains(left)){
                    set.remove(left);
                }
                lp++;
            }

            rp++;
            maxLen = Math.max(maxLen, rp - lp);
            
        }

        return maxLen;
    }
}
