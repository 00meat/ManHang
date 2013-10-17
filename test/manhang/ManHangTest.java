/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manhang;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 */
public class ManHangTest {
    
    public ManHangTest() {
    }

    /**
     * Test of main method, of class ManHang.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ManHang.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menu method, of class ManHang.
     */
    @Test
    public void testMenu() {
        System.out.println("menu");
        ManHang.menu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of randInt method, of class ManHang.
     */
    @Test
    public void testRandInt() {
        System.out.println("randInt");
        int min = 0;
        int max = 0;
        int expResult = 0;
        int result = ManHang.randInt(min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of game method, of class ManHang.
     */
    @Test
    public void testGame() {
        System.out.println("game");
        int expResult = 0;
        int result = ManHang.game();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}