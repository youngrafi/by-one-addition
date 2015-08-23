import java.util.ArrayList;

public class Incrementer {
    public static ArrayList<Integer> incrementNumberByOne(ArrayList<Integer> number) {
        return ByOneAddition.create(number).getResult();
    }
}
