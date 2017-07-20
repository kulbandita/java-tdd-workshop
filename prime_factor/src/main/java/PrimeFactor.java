import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> primeNumber = new ArrayList<Integer>();

        if (number % 2 == 0) {
            while (number >= 4) {
                number /= 2;
                primeNumber.add(2);
            }
            primeNumber.add(number);
        } else if (number % 3 == 0) {
            primeNumber.add(number);
        }

        return primeNumber;
    }
}
