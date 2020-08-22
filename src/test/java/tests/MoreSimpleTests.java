package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@Tag("just_equal")
public class MoreSimpleTests {

    @Test
    void superPositiveTest() {
        assertEquals(3, 3);
    }

    @Test
    @Tag("negative_equals")
    void superNegativeTest() {
        assertEquals(2, 3);
    }
}
