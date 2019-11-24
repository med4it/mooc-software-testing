package tudelft.ghappy;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    private GHappy o;

    @BeforeEach
    public void initialize() {
        o = new GHappy();
    }

    @Test
    public void oneNoCharG() {
        boolean result = o.gHappy("f");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void oneGChar() {
        boolean result = o.gHappy("g");
        Assertions.assertEquals(false, result);
    }

    @ParameterizedTest(name = "{0} : {1} = {2}")
    @CsvSource({
//            Two chars string
            "'two G chars', 'gg', true",
            "'g followed by no g char', 'gf', false",
            "'no g char followed by a g', 'ag', false",
            "'string with no g', 'mohammed', false",
            "'string with 2 contiguous g', 'higghi', true",
            "'string with 2 no contiguous g', 'higdghi', false"
    })
    public void twoOrMoreChars(String partition, String str, Boolean expectedResult){
        boolean result = o.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }
}
