class Solution {
public String decodeString(String s) {
return decode(s, new int[]{0});
}


public String decode(String s, int[] index) {
    String result = "";

    while (index[0] < s.length() && s.charAt(index[0]) != ']') {
        char ch = s.charAt(index[0]);

        if (Character.isDigit(ch)) {
            int k = 0;

            while (Character.isDigit(s.charAt(index[0]))) {
                k = k * 10 + (s.charAt(index[0]) - '0');
                index[0]++;
            }

            index[0]++; 

            String decoded = decode(s, index);

            index[0]++; 

            for (int i = 0; i < k; i++) {
                result += decoded;
            }
        } else {
            result += ch;
            index[0]++;
        }
    }

    return result;
}


}
