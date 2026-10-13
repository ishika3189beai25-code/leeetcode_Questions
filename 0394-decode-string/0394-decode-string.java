class Solution {
    int index = 0;

    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();

        while (index < s.length() && s.charAt(index) != ']') {
            char ch = s.charAt(index);

            if (Character.isDigit(ch)) {
                int k = 0;

                while (Character.isDigit(s.charAt(index))) {
                    k = k * 10 + (s.charAt(index) - '0');
                    index++;
                }

                index++; // Skip '['

                String decoded = decodeString(s);

                index++; // Skip ']'

                for (int i = 0; i < k; i++) {
                    result.append(decoded);
                }
            } else {
                result.append(ch);
                index++;
            }
        }

        return result.toString();
    }
}