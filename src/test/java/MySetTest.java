
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {
    @Test
    public void emptySet() {
        MySet set = new MySet();
        assertTrue(set.isEmpty());
        assertEquals(0, set.size());

    }
}
