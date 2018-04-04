package logger;

import io.qameta.allure.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class LogMessageTest {
    private static final Logger logger = LoggerFactory.getLogger(LogMessageTest.class);

    @Test
    @Description("Allure description")
    public void testLogMessage() {
        logger.debug("This is a test log message");
    }
}
