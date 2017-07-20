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
        StringBuilder phoneNumber = new StringBuilder(input);
        int length = input.length();

        for (int i = 0; i < length; i++) {
            if(i == 3 || i == 7){
                phoneNumber.insert(i, "-");
            }
        }
        return phoneNumber.toString();
    }

}
