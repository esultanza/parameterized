package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("basic_tests")
public class InsightTests {
    static Logger logger = LoggerFactory.getLogger(InsightTests.class);


    @Test
    @Tag("insight_tag")
    void paramitrizedStringTest() {
        String item = System.getProperty("item", "reminisce"); // from terminal, gradle insight_test -Dbbb=reminisce
        logger.info("\nitem = " + item);

        assertEquals("reminisce", item, "item = " + item);
    }
}
