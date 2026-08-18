class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String cur = "";
        int num = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num * 10 + (ch-'0');
            }

            else if(ch=='['){
                numStack.push(num);
                strStack.push(cur);

                num = 0;
                cur = "";
            }
            else if(ch == ']'){
                int repeat = numStack.pop();
                String prev = strStack.pop();

                cur = prev + cur.repeat(repeat);
            }
                else{
                    cur += ch;
                }
            }
            return cur;
    }
}
