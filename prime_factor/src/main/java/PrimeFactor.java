import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> primeNumber = new ArrayList<Integer>();

        if (number == 2) {
            primeNumber.add(number);
        }

        return primeNumber;
    }
}
