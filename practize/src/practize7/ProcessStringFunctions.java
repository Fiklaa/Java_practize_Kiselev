package practize7;

public class ProcessStringFunctions implements ProcessString {
    @Override
    public int countAmountChars(String s) {
        return s.replaceAll("[ \\t]", "").length();
    }

    @Override
    public String oddPosChars(String s) {
        if (s.length() < 2 | s.isEmpty()){
            return "";
        }

        StringBuilder res = new StringBuilder();
        int chars_cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char crrChar = s.charAt(i);
            if (crrChar != ' ' && crrChar != '\t') {
                if (chars_cnt % 2 == 0) {
                    res.append(crrChar);
                }
                chars_cnt++;
            }
        }
        return res.toString();
    }

    @Override
    public String reverseString(String s) {
        String reversedString = s.replaceAll("[ \\t]", "");
        return new StringBuilder(reversedString).reverse().toString();
    }
}
