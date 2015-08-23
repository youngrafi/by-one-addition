import java.util.ArrayList;
import java.util.Arrays;

public class WithCarryByOneAddition extends ByOneAddition {


    public WithCarryByOneAddition(ArrayList<Integer> number) {
        super(number);
    }

    @Override
    public ArrayList<Integer> getResult() {
        final int size = number.size();

        final ArrayList<Integer> subNumber = size > 1 ?  new ArrayList<Integer>(number.subList(0, size - 1))
                : new ArrayList<Integer>(Arrays.asList(0));
        
        final ArrayList<Integer> integers = ByOneAddition.create(subNumber).getResult();
        integers.add(0);
        return  integers;
    }
}
