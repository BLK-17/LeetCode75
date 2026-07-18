class Solution {
    public String mergeAlternately(String word1, String word2) {
        // StringBuilder ans  = new StringBuilder();
        // int i = 0,j=0;
        // while(i<word1.length()||j<word2.length()){
        //     if(i<word1.length()){
        //         ans.append(word1.charAt(i++));
        //     }
        //     if(j<word2.length()){
        //         ans.append(word2.charAt(j++));
        //     }
        // }
        // return ans.toString();
        StringBuilder ans = new StringBuilder();
        int a = word1.length();
        int b = word2.length();
        int c = Math.max(a,b);
        int i = 0;
        while(i<c){
            if(i<a) {ans.append(word1.charAt(i));}
            if(i<b) {ans.append(word2.charAt(i));}
             i++;
        }
        return ans.toString();
    }
}
