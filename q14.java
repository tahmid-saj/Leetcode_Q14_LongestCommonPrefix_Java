class Solution {
    public String longestCommonPrefix(String[] strs) {
        // for every i character in strs[0]:
        // -loop through strs[1] until strs[strs.length - 1] using j:
        // if i >= strs[j].length():
        // break
        // -check if strs[0].charAt(i) == strs[j].charAt(i):
        // -if so, res += strs[0].charAt(i)

        if (strs.length == 1) {
            return strs[0];
        }

        String res = "";

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    break;
                }

                if (strs[0].charAt(i) == strs[j].charAt(i)) {
                    if (j + 1 == strs.length) {
                        res += strs[0].charAt(i);
                    }
                } else if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return res;
                }
            }
        }

        return res;
    }
}
