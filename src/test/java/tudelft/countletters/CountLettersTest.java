package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastWordhasAnX() {
        int words = new CountLetters().count("cat|tar");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastWordhasAnR() {
        int words = new CountLetters().count("car|taxi");
        Assertions.assertEquals(1, words);
    }

}