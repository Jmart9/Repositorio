/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package portafolio;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jerson Martinez
 */
public class leoMessiTest {
    
    public leoMessiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of subirAtaque method, of class leoMessi.
     */
    @Test
    public void testSubirAtaque() {
        System.out.println("subirAtaque");
        leoMessi instance = new leoMessi();
        instance.subirAtaque();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ganador method, of class leoMessi.
     */
    @Test
    public void testGanador() {
        System.out.println("ganador");
        leoMessi instance = new leoMessi();
        instance.ganador();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
