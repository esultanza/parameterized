package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("basic_tests")
public class InsightTests {
    static Logger logger = LoggerFactory.getLogger(ParametrizedTests.class);


    @Test
    @Tag("insight_test")
    void paramitrizedStringTest() {
        String item = System.getProperty("item", "thunder"); // from terminal, gradle insight_test -may=reminisce
        logger.info("\nitem = " + item);

        assertEquals("reminisce", item, "item = " + item);
    }
}