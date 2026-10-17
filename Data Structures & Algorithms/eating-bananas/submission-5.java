class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int L = 1;
        int R = piles[piles.length - 1];
        int RES = R;

        while(L <= R){
            int K = L + (R - L) / 2;

            long T = 0;

            for(int P: piles){
                T += Math.ceil((double) P / K);
            }

            if(T <= h){
                RES = K;
                R = K - 1;
            } else
                L = K + 1;
        }
        return RES;
    }
}
