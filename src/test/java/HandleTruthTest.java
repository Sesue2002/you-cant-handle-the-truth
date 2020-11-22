import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {


    }

    private List<String> getStringTestCases(){
        List<String> tCases = new ArrayList<>();

        tCases.add("this is the first test case");

        tCases.add("repeat repeat repeat testing repeated words");

        tCases.add("");

        tCases.add("a long list of no repeating words for various reasons this could be a pickle 4 me");
        //also with a number in the string!

        tCases.add("a long list with repeated values so we can test if there is an error when the size gets larger and larger making the function go through stress like me a long list with repeated values so we can test if there is an error when the size gets larger and larger making the function go through stress like me");
        //repeats itself

        return tCases;
    }
}