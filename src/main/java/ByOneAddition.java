import java.util.ArrayList;

public abstract class ByOneAddition {
    protected final ArrayList<Integer> number;

    public static ByOneAddition create(ArrayList<Integer> number) {
        return number.get(number.size() - 1) == 9 ? new WithCarryByOneAddition(number)
                : new NoCarryByOneAddition(number);
    }

    public ByOneAddition(ArrayList<Integer> number) {
        this.number = number;
    }

    public abstract ArrayList<Integer> getResult();
}
