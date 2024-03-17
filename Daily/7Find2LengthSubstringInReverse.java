class Solution {
    public boolean isSubstringPresent(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            String pair = s.substring(i, i + 2);
            String reversePair = new StringBuilder(pair).reverse().toString();
            if (s.contains(reversePair)) {
                return true;
            }
        }
        return false;
    }
}