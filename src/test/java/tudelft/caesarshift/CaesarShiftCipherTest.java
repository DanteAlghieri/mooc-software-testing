package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.ghappy.GHappy;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "{0}, {1}, {2}")
    @CsvSource({
            "'Equivalence Testing - shift abc with 3 resulting in def', abc, 3"})
    public void EquivalenceTesting(String outputText, String text, int shift){
        String result = new CaesarShiftCipher().CaesarShiftCipher(text, shift);
        Assertions.assertEquals("def",result);
    }

    @ParameterizedTest(name = "{0}, {1}, {2}")
    @CsvSource({
            "'Equivalence Testing - shift abc with 3 resulting in def', a  b cdefg, 3"})
    public void EquivalenceTestingWithSpaces(String outputText, String text, int shift){
        String result = new CaesarShiftCipher().CaesarShiftCipher(text, shift);
        Assertions.assertEquals("d  e fghij",result);
    }

    @ParameterizedTest(name = "{0}, {1}, {2}")
    @CsvSource({
            "'Boundaries Testing - shift xyz with 3 resulting in abc', xyz, 3"})
    public void BoundariesTesting(String outputText, String text, int shift){
        String result = new CaesarShiftCipher().CaesarShiftCipher(text, shift);
        Assertions.assertEquals("abc",result);
    }

    @ParameterizedTest(name = "{0}, {1}, {2}")
    @CsvSource({
            "'Boundaries Testing - shift z with 1 resulting in a', z, 1"})
    public void BoundariesTestingOnPoint(String outputText, String text, int shift){
        String result = new CaesarShiftCipher().CaesarShiftCipher(text, shift);
        Assertions.assertEquals("a",result);
    }

    @ParameterizedTest(name = "{0}, {1}, {2}")
    @CsvSource({
            "'Boundaries Testing - shift y with 1 resulting in z', y, 1"})
    public void BoundariesTestingInPoint(String outputText, String text, int shift){
        String result = new CaesarShiftCipher().CaesarShiftCipher(text, shift);
        Assertions.assertEquals("z",result);
    }

    @ParameterizedTest(name = "{0}, {1}, {2}")
    @CsvSource({
            "'Boundaries Testing - shift / with 1 resulting in  invalid ', /, 1"})
    public void BoundariesTestingOutPoint(String outputText, String text, int shift){
        String result = new CaesarShiftCipher().CaesarShiftCipher(text, shift);
        Assertions.assertEquals("invalid",result);
    }


}
