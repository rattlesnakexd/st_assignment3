package BL;

import org.junit.Test;

import static org.junit.Assert.*;

public class CellTest {

    @Test
    public void checkIs_AliveMethod(){
        Cell cell = new Cell();
        assertTrue(cell.check_IsAlive() == false);
    }

    @Test
    public void checkChangeState(){
        Cell cell = new Cell();
        cell.ChangeState();
        assertTrue(cell.check_IsAlive() == true);
    }

    @Test
    public void checkset_alive(){
        Cell cell = new Cell();
        boolean temp = true;
        cell.setAlive(temp);
        assertTrue(cell.check_IsAlive() == true);
    }

}