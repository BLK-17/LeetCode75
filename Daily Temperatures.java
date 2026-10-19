class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        int[] st = new int[n];
        int top = -1;

        for(int i=0;i<n;i++){
            while(top >= 0 && temp[i] > temp[st[top]]){
                int p = st[top--];
                ans[p] = i - p;
            }
            st[++top] = i;
        }
        return ans;
    }
}
