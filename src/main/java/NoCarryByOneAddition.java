import java.util.ArrayList;

public class NoCarryByOneAddition extends ByOneAddition {

    public NoCarryByOneAddition(ArrayList<Integer> number) {
        super(number);
    }

    @Override
    public ArrayList<Integer> getResult() {
        final int minDigit = number.size() - 1;

        number.set(minDigit, number.get(minDigit) + 1);

        return number;
    }
}
