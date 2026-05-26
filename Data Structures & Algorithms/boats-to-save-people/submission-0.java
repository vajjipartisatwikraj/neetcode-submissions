class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int len = people.length;
        int lp = 0;
        int rp = len -1;
        int boats = 0;
        while(lp <= rp){
            if(people[lp] + people[rp] <= limit){
                boats++;
                lp++;
                rp--;
            }else{
                boats++;
                rp--;
            }
        }

        return boats;
    }
}