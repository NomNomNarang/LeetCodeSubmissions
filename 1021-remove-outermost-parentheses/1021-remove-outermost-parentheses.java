class Solution {
    public String removeOuterParentheses(String s) {
        char[] ans = new char[s.length()];
        int count = 0;
        int depth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) ans[count++] = c;
            depth++;
            } 
            else {
                depth--;
                if (depth > 0) {
                    ans[count++] = c;
            }
        }
    }
    return new String(ans, 0, count);
    }
}