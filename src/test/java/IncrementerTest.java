import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;


/**
 * Created by lika on 8/13/15.
 */
@SuppressWarnings({"DefaultFileTemplate", "unchecked"})
public class IncrementerTest {
    @Test
    public void allZeroes() throws Exception {
        ArrayList number = new ArrayList(Arrays.asList(0));
        ArrayList result = Incrementer.incrementNumberByOne(number);
        assertThat(result, is(equalTo(new ArrayList(Arrays.asList(1)))));
    }

    @Test
    public void noNines() throws Exception {
        ArrayList number = new ArrayList(Arrays.asList(1,0,0));
        ArrayList result = Incrementer.incrementNumberByOne(number);
        assertThat(result, is(equalTo(new ArrayList(Arrays.asList(1,0,1)))));
    }

    @Test
    public void nineInLastDigit() throws Exception {
        ArrayList number = new ArrayList(Arrays.asList(9,9));
        ArrayList result = Incrementer.incrementNumberByOne(number);
        assertThat(result, is(equalTo(new ArrayList(Arrays.asList(1,0,0)))));
    }

    @Test
    public void nineInLastDigit3Digits() throws Exception {
        ArrayList number = new ArrayList(Arrays.asList(2,7,9));
        ArrayList result = Incrementer.incrementNumberByOne(number);
        assertThat(result, is(equalTo(new ArrayList(Arrays.asList(2,8,0)))));
    }
    @Test
    public void nineInMiddleDigit() throws Exception {
        ArrayList number = new ArrayList(Arrays.asList(1,9,9));
        ArrayList result = Incrementer.incrementNumberByOne(number);
        assertThat(result, is(equalTo(new ArrayList(Arrays.asList(2,0,0)))));
    }

    @Test
    public void nineInAllDigits() throws Exception {
        ArrayList number = new ArrayList(Arrays.asList(9,9,9));
        ArrayList result = Incrementer.incrementNumberByOne(number);
        assertThat(result, is(equalTo(new ArrayList(Arrays.asList(1,0,0,0)))));
    }

    @Test
    public void zero() throws Exception {
        ArrayList number = new ArrayList(Arrays.asList(0));
        ArrayList result = Incrementer.incrementNumberByOne(number);
        assertThat(result, is(equalTo(new ArrayList(Arrays.asList(1)))));
    }

    @Test
    public void singleNonZeroDigit() throws Exception {
        ArrayList number = new ArrayList(Arrays.asList(0));
        ArrayList result = Incrementer.incrementNumberByOne(number);
        assertThat(result, is(equalTo(new ArrayList(Arrays.asList(1)))));
    }

    @Test
    public void veryLongNumber() throws Exception {
        ArrayList number = new ArrayList(Arrays.asList(9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9));
        ArrayList result = Incrementer.incrementNumberByOne(number);
        assertThat(result, is(equalTo(new ArrayList(Arrays.asList(1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)))));
    }
}