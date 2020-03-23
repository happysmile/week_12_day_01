import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("James Bond", "qewerh33", 60000, "CIB", 400000);
    }

    @Test
    public void canGetBudget(){
        assertEquals(400000, director.getBudget(), 0);
    }

    @Test
    public void showBonus(){
        assertEquals(1200, director.payBonus(), 0);
    }

}
