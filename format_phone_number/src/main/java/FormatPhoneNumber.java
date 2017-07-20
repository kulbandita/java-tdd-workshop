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
        String phoneNumber = "";
        String digit = removeNonDigit(input);
        int length = digit.length();
        int remain = length;

        for (int i = 0; i < length; i++) {
            if (remain < 4 && length % 3 == 1) {
                phoneNumber += digit.charAt(i);
                remain--;
                if (remain == 2) {
                    phoneNumber += "-";
                }
            } else {
                if (i % 3 == 0 && i != 0) {
                    phoneNumber += "-";
                }
                phoneNumber += digit.charAt(i);
                remain--;
            }
        }
        return phoneNumber;
    }

}
