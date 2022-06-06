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
public class PersonajesTest {
    
    public PersonajesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setNombre method, of class Personajes.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String _nombre = "";
        Personajes instance = new PersonajesImpl();
        instance.setNombre(_nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Personajes.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Personajes instance = new PersonajesImpl();
        String expResult = "Kevin de Bruyne";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEnergia method, of class Personajes.
     */
    @Test
    public void testSetEnergia() {
        System.out.println("setEnergia");
        int _energia = 0;
        Personajes instance = new PersonajesImpl();
        instance.setEnergia(_energia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEnergia method, of class Personajes.
     */
    @Test
    public void testGetEnergia() {
        System.out.println("getEnergia");
        Personajes instance = new PersonajesImpl();
        int expResult = 100;
        int result = instance.getEnergia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAtaque method, of class Personajes.
     */
    @Test
    public void testSetAtaque() {
        System.out.println("setAtaque");
        int _ataque = 0;
        Personajes instance = new PersonajesImpl();
        instance.setAtaque(_ataque);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAtaque method, of class Personajes.
     */
    @Test
    public void testGetAtaque() {
        System.out.println("getAtaque");
        Personajes instance = new PersonajesImpl();
        int expResult = 24;
        int result = instance.getAtaque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDefensa method, of class Personajes.
     */
    @Test
    public void testSetDefensa() {
        System.out.println("setDefensa");
        int _defensa = 30;
        Personajes instance = new PersonajesImpl();
        instance.setDefensa(_defensa);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDefensa method, of class Personajes.
     */
    @Test
    public void testGetDefensa() {
        System.out.println("getDefensa");
        Personajes instance = new PersonajesImpl();
        int expResult = 30;
        int result = instance.getDefensa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrAC method, of class Personajes.
     */
    @Test
    public void testSetPrAC() {
        System.out.println("setPrAC");
        double _prAC = 0.0;
        Personajes instance = new PersonajesImpl();
        instance.setPrAC(_prAC);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrAC method, of class Personajes.
     */
    @Test
    public void testGetPrAC() {
        System.out.println("getPrAC");
        Personajes instance = new PersonajesImpl();
        double expResult = 0.8;
        double result = instance.getPrAC();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ganador method, of class Personajes.
     */
    @Test
    public void testGanador() {
        System.out.println("ganador");
        Personajes instance = new PersonajesImpl();
        instance.ganador();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of atacado method, of class Personajes.
     */
    @Test
    public void testAtacado() {
        System.out.println("atacado");
        int _ataque = 24;
        Personajes instance = new PersonajesImpl();
        instance.atacado(_ataque);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of evitar method, of class Personajes.
     */
    @Test
    public void testEvitar() {
        System.out.println("evitar");
        Personajes instance = new PersonajesImpl();
        instance.evitar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of gana method, of class Personajes.
     */
    @Test
    public void testGana() {
        System.out.println("gana");
        Personajes instance = new PersonajesImpl();
        boolean expResult = true;
        boolean result = instance.gana();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class PersonajesImpl extends Personajes {

        public void ganador() {
        }
    }
    
}
