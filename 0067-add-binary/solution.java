class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop from right to left until both strings are processed and no carry remains
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int
                j--;
            }

            // Append the remainder (0 or 1) to the result
            result.append(sum % 2);
            // Calculate the new carry (0 or 1)
            carry = sum / 2;
        }

        // Since we added digits from right to left, the result is backwards
        return result.reverse().toString();
    }
}
