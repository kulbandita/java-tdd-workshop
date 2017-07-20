import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> primeNumber = new ArrayList<Integer>();

        if (number == 2 || number == 3) {
            primeNumber.add(number);
        } else {
            if (number % 2 == 0) {
                primeNumber.add(2);
                primeNumber.add(number / 2);
            }
        }

        return primeNumber;
    }
}
