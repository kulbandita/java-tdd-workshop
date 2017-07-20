public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
        String digit = "";
        int length = input.length();
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) != '-' && input.charAt(i) != ' ') {
                digit += input.charAt(i);
            }
        }
        return digit;
    }

    public String solution(String input) {
        return null;
    }

}
