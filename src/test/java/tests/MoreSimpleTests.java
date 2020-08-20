package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@Tag("asdadas_more_simple_tests")
public class MoreSimpleTests {

    @Test
    void superPositiveTest() {
        assertEquals(3, 3);
    }

    @Test
    @Tag("not_you")
    void superNegativeTest() {
        assertEquals(2, 3);
    }
}
