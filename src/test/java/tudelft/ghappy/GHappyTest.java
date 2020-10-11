package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "{0}, {1}, {2}")
    @CsvSource({
            "'Equivalence Testing - happy case with 2 g's ',xxggxx,true",
            "'Equivalence Testing - UNhappy case with a g ?',xxgxx,false",
            "'Equivalence Testing - UNhappy case with 2 g's followed by another letters and 1 g',xxggyygxx,false",
            "'Equivalence Testing - happy case with 2g's followed by another letters and 2 g's',xxggxxgg,true",})
    public void EquivalenceTesting(String outputText, String str, boolean expectedResult){
        boolean result = new GHappy().gHappy(str);
        Assertions.assertEquals(expectedResult,result);
    }

    @ParameterizedTest(name = "{0}, {1}, {2}")
    @CsvSource({
            "'Boundaries Testing - happy case with only 2 g's ',gg,true",
            "'Boundaries Testing - UNhappy case with 1 g followd by another letter ?',gx,false",
            "'Boundaries Testing - UNhappy case with 1 g followd by another letter ?',g,false",
            "'Boundaries Testing - happy case with 3 g's ',ggg,true"})
    public void BoundariesTesting(String outputTextString, String str, boolean expectedResult){
        boolean result = new GHappy().gHappy(str);
        Assertions.assertEquals(expectedResult,result);
    }

}
