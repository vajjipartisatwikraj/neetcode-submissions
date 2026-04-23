class Solution {
    public static boolean isMatches(int[] arr1, int[] arr2){
        for(int i=0; i<26; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()){
            return false;
        }

        int lp = 0;
        int rp = s1.length() - 1;

        int[] target = new int[26];
        int[] window = new int[26];

        for(int i=0; i<s1.length(); i++){
            target[s1.charAt(i) - 'a']++;
        }

        for(int i=0; i<=rp; i++){
            window[s2.charAt(i) - 'a']++;
        }

        while(true){

            if(isMatches(target, window)){
                return true;
            }

            if(rp == s2.length() - 1){
                break;
            }

            window[s2.charAt(lp) - 'a']--;
            lp++;

            rp++;
            window[s2.charAt(rp) - 'a']++;
        }

        return false;
    }
}