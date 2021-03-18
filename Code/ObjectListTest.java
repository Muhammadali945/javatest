import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class ObjectListTest {
    @Test
    void setUp() throws Exception {
    Payment P = new Payment("january", 20);

    assertEquals(20, P.getAmount());


    }

}
