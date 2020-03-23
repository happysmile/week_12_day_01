import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Peter Kelly", "23evb", 50000, "Asset Management");
    }

    @Test
    public void canGetName(){
        assertEquals("Peter Kelly", manager.getName());
    }

    @Test
    public void canGetNin(){
        assertEquals("23evb", manager.getNin());
    }

    @Test
    public void canGetSalary(){
        assertEquals(50000, manager.getSalary(), 0);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Asset Management", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(500);
        assertEquals(50500, manager.getSalary(), 0);
    }

    @Test
    public void showPayBonus(){
        assertEquals(500, manager.payBonus(), 0);
    }


}
