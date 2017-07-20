public class FizzBuzz {
    public String say(int input) {
        if (input % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(input);
    }
}
