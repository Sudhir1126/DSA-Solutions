import java.io.*;
import java.util.*;

class chocolatedistributionproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // Assign the input value to array elements
            }
            int m = sc.nextInt();

            Solution ob = new Solution();

            System.out.println(ob.findMinDiff(arr, n, m));
        }
    }
}

class Solution {
    public long findMinDiff(int[] arr, int n, int m) {
        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i <= n - m; i++) {
            int minw = arr[i];
            int maxw = arr[i + m - 1];
            int gap = maxw - minw;

            if (gap < ans) {
                ans = gap;
            }
        }
        return ans;
    }
}

