class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int ast : asteroids){
            boolean al = true;
            while(al && !st.isEmpty() && st.peek() > 0 && ast < 0){
                if(st.peek() < -ast){
                    st.pop();
                }
                else if(st.peek() == -ast){
                    st.pop();
                    al = false;
                }
                else    al = false;
            }
            if(al){
                st.push(ast);
            }
        }
        int[] res = new int[st.size()];
        for(int i=0;i<st.size();i++){
            res[i] = st.get(i);
        }
        return res;
    }
}
