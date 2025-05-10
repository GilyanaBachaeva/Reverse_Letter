package com.example;

public final class StringUtil {
    private StringUtil() {
    }

    public static String reverseLetters(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            while (left < right && !Character.isLetter(charArray[left])) {
                left++;
            }
            while (left < right && !Character.isLetter(charArray[right])) {
                right--;
            }
            if (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }
        return new String(charArray);
    }
}
