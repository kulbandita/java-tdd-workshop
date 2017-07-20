public class MyRange {
    public String of(String input) {
        String range = "";
        for (int i = getFirstNumber(input); i <= getLastNumber(input); i++) {
            range += i;
        }
        return range;
    }

    public int getLastNumber(String input) {
        int lastNumber = Character.getNumericValue(input.charAt(3));
        if (isก้ามปูปิด(input)) {
            return lastNumber;
        }
        return lastNumber - 1;
    }

    public boolean isก้ามปูปิด(String input) {
        return input.endsWith("]");
    }

    public int getFirstNumber(String input) {
        int firstNumber = Character.getNumericValue(input.charAt(1));
        if (isก้ามปูเปิด(input)) {
            return firstNumber;
        }
        return firstNumber + 1;
    }

    public boolean isก้ามปูเปิด(String input) {
        return input.startsWith("[");
    }
}
