package test.task1;

import com.company.task1.CrazyLogger;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by Ira on 20.01.2016.
 */
public class TestCrazyLogger {

    @Test
    public void testCrazyLogger(){
        CrazyLogger crazyLogger = new CrazyLogger();
        crazyLogger.appendMessage("start");
        crazyLogger.appendMessage("log_info");
        crazyLogger.showLogInfo();
        assertTrue(crazyLogger.findMessageBySubstring("l"));
        assertFalse(crazyLogger.findMessageBySubstring("q"));

    }

}
