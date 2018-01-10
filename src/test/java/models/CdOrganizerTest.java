package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/9/18.
 */
public class CdOrganizerTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createsInstance_true() throws Exception {
        CD cd = new CD("nirvana", "1993");
        assertEquals(true, cd instanceof CD);
    }

    @Test
    public void getAll_returnAmountOfInstances_true() throws Exception {
        CD cd1 = new CD("rem", "1987");
        CD cd2 = new CD("ac/dc", "1976");
        assertEquals(2, CD.getAll().size());
    }

    @Test
    public void getAll_returnArrayOfInstances_true() throws Exception {
        CD cd1 = new CD("rem", "1987");
        CD cd2 = new CD("ac/dc", "1976");
        assertEquals(true, CD.getAll().contains(cd1));
        assertEquals(true, CD.getAll().contains(cd2));
    }
}