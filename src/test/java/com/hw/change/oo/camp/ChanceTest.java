package java.com.hw.change.oo.camp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChanceTest {
    private Chance chance;
    private Chance operator;

    @Before
    public void setUp() throws Exception {
        chance = new Chance(0.5);
        operator = new Chance(0.4);
    }

    @Test
    public void should_get_not() {
        // given

        // when
        Chance result = chance.not();

        // then
    }

}