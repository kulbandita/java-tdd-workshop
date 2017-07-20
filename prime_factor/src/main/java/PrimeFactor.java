import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> primeNumber = new ArrayList<Integer>();

        if (number == 2 || number == 3) {
            primeNumber.add(number);
        }

        return primeNumber;
    }
}
