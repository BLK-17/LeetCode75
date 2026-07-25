class Solution {
    public int compress(char[] chars) {
        int r = 0;
        int w = 0;
        int n = chars.length;

        while (r < n) {

            char x = chars[r];
            int count = 1;
            r++;

            while (r < n && x == chars[r]) {
                count++;
                r++;
            }

            chars[w++] = x;

            if (count > 1 && count < 10) {
                chars[w++] = (char) (count + '0');
            } else if (count >= 10) {
                int div = 1;
                while (count / div >= 10) {
                    div *= 10;
                }

                while (div > 0) {
                    chars[w++] = (char) (count / div + '0');
                    count = count % div;   // Fixed
                    div /= 10;
                }
            }
        }

        return w;
    }
}
