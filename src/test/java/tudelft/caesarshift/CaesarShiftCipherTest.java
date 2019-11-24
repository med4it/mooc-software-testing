package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "{0} [{1} + {2}] => {3}")
    @CsvSource({
            "'space', ' ', 0, ' '",
            "'one char in a-z', 'z', 1, 'a'",
            "'invalid pattern', '^ssldfj', 0, 'invalid'",
            "'message with inPoint-shift', 'abc', 1, 'bcd'",
            "'message with outPoint-shift', 'abc', 28, 'cde'",
            "'message with negative outPoint-shift', 'abc', -1, 'zab'",
            "'message with onPoint-shift', 'abc', 26, 'abc",
            "'message with offPoint-shift', 'abc', 27, 'bcd",
            "'message with spaces', 'a b c', 1, 'b c d'"
    })

    void testAlgorithm(String partition, String message, int shift, String expectedResult){
        CaesarShiftCipher crypt = new CaesarShiftCipher();
        String result = crypt.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }
}
