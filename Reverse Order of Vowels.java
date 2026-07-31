class Solution {
    public String reverseVowels(String s) {
        if(s==null||s.length()==0)  return s;

        char[] ch = s.toCharArray();
        int l = 0, r = ch.length-1;

        String vow = "aeiouAEIOU";

        while(l<r){
            while(l<r&&vow.indexOf(ch[l])==-1)    l++;
            while(l<r&&vow.indexOf(ch[r])==-1)    r--;

            if(l<r){
                char t = ch[l];
                ch[l] = ch[r];
                ch[r] = t;
            }

            l++;
            r--;
        }
        return new String(ch);
    }
}
