package app;

public class ReverseResult {
    private String reversedString;
    private int characterCount;

    public ReverseResult(String reversedString, int characterCount) {
        this.reversedString = reversedString;
        this.characterCount = characterCount;
    }

    public String getReversedString() {
        return reversedString;
    }

    public int getCharacterCount() {
        return characterCount;
    }

    public static ReverseResult madeReverse(String str) {
        if (str == null || str.isEmpty()) {
            return new ReverseResult("", 0);
        }

        StringBuilder reversedString = new StringBuilder();
        int count = str.length();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }

        return new ReverseResult(new String(reversedString), count);
    }
}
