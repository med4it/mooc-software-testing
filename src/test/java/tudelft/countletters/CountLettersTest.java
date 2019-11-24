package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CountLettersTest {

    @ParameterizedTest
    @CsvSource({
        "'one word ending with s', 'sas', 1",
        "'one word ending with r', 'near', 1",
        "'one word does not match', 'sa', 0",
        "'two words ending with s', 'cats|dogs', 2",
        "'two words ending with r', 'car|war', 2",
        "'two words does not match', 'case|wall', 0",
    })
    public void testAlgorithm(String partition, String str, int expected) {
        int words = new CountLetters().count(str);
        Assertions.assertEquals(expected, words);
    }

}