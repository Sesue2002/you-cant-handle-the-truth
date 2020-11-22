import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        List<String> input = getStringTestCases();
        ArrayList<String> wordChoice = wordForTest();
        List<Boolean> isItThere = doesContainVal();

        for(String actual : input){
            System.out.println(HandleTruth.wordCount(actual));
            for(int i = 0; i < 4; i++) {
                assertEquals(HandleTruth.wordCount(actual).containsValue(wordChoice.get(i)), isItThere);
            }
        }

    }

    private List<String> getStringTestCases(){
        List<String> tCases = new ArrayList<>();

        tCases.add("this is the first test case");//6 words

        tCases.add("repeat repeat repeat testing repeated words");//6 words

        tCases.add("");// 0 words
        //bug in the code, if no words are inputted it shows that none words appears once to be exact 1 = [] instead of 0

        tCases.add("a long list of no repeating words for various reasons this could be a pickle 4 me");//17 words
        //also with a number in the string!

        tCases.add("a long list with repeated values so we can test if there is an error when the size gets larger and larger making the function go through stress like me a long list with repeated values so we can test if there is an error when the size gets larger and larger making the function go through stress like me");
        //repeats itself
        //60 words

        return tCases;
    }
    private ArrayList<String> wordForTest(){
        ArrayList<String> wFT = new ArrayList<>();

        wFT.add("this");
        wFT.add("not");
        wFT.add("words");
        wFT.add("various");
        wFT.add("because");

        return wFT;
    }
    private List<Boolean> doesContainVal(){
        List<Boolean> exVal = new ArrayList<>();

        exVal.add(true);
        exVal.add(false);
        exVal.add(false);
        exVal.add(true);
        exVal.add(false);

        return exVal;
    }
    private List<Integer> correctCount(){
        List<Integer> exKey = new ArrayList<>();

        exKey.add(0);
        exKey.add(7);
        exKey.add(9);

        return exKey;
    }
}