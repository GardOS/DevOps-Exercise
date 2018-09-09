package gardos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;

public class AppTest {
    @Test
    public void assertIsTrue() {
        assertTrue(true);
    }

    @Test
    public void assertIsFalse() {
        assertFalse(false);
    }

    @Test
    @Ignore
    public void testWillFail() {
        fail();
    }
}
