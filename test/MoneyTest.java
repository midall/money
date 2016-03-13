/* NORMAL TEST */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michalis
 */
public class MoneyTest {
    
    public MoneyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of amount method, of class Money.
     */
    @Test
    public void testAmount() {
        System.out.println("amount");
        Money instance = new Money(10, "USD");
        int expResult = 10;
        int result = instance.amount();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of currency method, of class Money.
     */
    @Test
    public void testCurrency() {
        System.out.println("currency");
        Money instance = new Money(10, "USD");
        String expResult = "USD";
        String result = instance.currency();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of add method, of class Money.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Money m = new Money(10, "USD");
        Money instance = new Money(10, "USD");
        Money expResult = new Money(20, "USD");
        Money result = instance.add(m);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of add method, of class Money.
     */
    @Test
    public void testAdd1() {
        System.out.println("add");
        Money m = new Money(10, "USD");
        Money instance = new Money(10, "EUR");
        Money expResult = new Money(20, "EUR");
        Money result = instance.add(m);
        assertEquals(expResult, result);
        //assertTrue(expResult.equals(result));
       
    }

    /**
     * Test of equals method, of class Money.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anObject = new Money(10, "USD");
        Money instance = new Money(10, "USD");
        boolean expResult = true;
        boolean result = instance.equals(anObject);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
