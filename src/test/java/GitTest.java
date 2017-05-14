import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Moni on 5/14/2017.
 */
public class GitTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getName() throws Exception {

        Git pers = new Git();

        assertEquals(pers.getName(), "Ana");
    }

}