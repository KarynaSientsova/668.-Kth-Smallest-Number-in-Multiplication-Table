package org.example;


class Solution {

    public int findKthNum(int m, int n, int k){
        int low = 1;
        int high = m * n;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if ( countLessOrEqual(mid,m,n) < k )
                low = mid + 1;
            else high = mid;
        }

        return low;
    }

    public int countLessOrEqual(int x, int m, int n){
        int result = 0;

        for ( int i = 1 ; i < n+1 ; i++) {
            result += Math.min(x / i, m);
        }

        return result;
    }

}