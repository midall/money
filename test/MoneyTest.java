/* NORMAL TEST */

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
    
    //SET THE OBJECTS TO USE IN ALL FUNCTIONS
    private Money m12CHF;
    private Money m13CHF;
    private Money m25CHF;
    private Money m14USD;
    private Money m15EUR;
    private Money m16GBP;
    private Money m17GBP;
    private Money m28GBP;
    private Money m33GBP;
    
    //CONSTRUCTOR SAME AS @before
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
        //INITIALIZE TWO OBJECTS
        m12CHF = new Money(12, "CHF");
        m13CHF = new Money(14, "CHF");
        m25CHF = new Money(25, "CHF");
        m14USD = new Money(14, "USD");
        m15EUR = new Money(15, "EUR");
        m16GBP = new Money(16, "GBP");
        m17GBP = new Money(17, "GBP");
        m28GBP = new Money(28, "GBP");
        m33GBP = new Money(33, "GBP");
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
        int expResult = 12;
        int result = m12CHF.amount();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of currency method, of class Money.
     */
    @Test
    public void testCurrency() {
        System.out.println("currency");
        String expResult = "USD";
        String result = m14USD.currency();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of add method, of class Money.
     */
    @Test
    public void testAdd1() {
        System.out.println("add - 1");
        Money expResult = m25CHF;
        Money result = m12CHF.add(m13CHF);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testAdd2() {
        System.out.println("add - 2");
        Money expResult = m28GBP;
        Money result = m12CHF.add(m16GBP);
        assertEquals(expResult, result);
        //assertTrue(expResult.equals(result));
       
    }
    
    @Test
    public void testAdd3() {
        System.out.println("add - 3");
        Money expected = m33GBP;
        Money result = m16GBP.add(m17GBP);
        assertEquals(expected, result);
        
    }
    
    /**
     * Test of equals method, of class Money.
     */
    @Test
    public void testEquals1() {
        System.out.println("equals - 1");
        Object anObject = new Money(10, "USD");
        Money instance = new Money(10, "USD");
        boolean expResult = true;
        boolean result = instance.equals(anObject);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testEquals2() {
        System.out.println("equals - 2");
        Money m12CHF= new Money(12, "CHF");
        Money m14CHF= new Money(14, "CHF");
        assertFalse(m12CHF.equals(null));
        assertEquals(m12CHF, m12CHF);
        assertEquals(m12CHF, new Money(12, "CHF"));
        assertFalse(m12CHF.equals(m14CHF));
    }
    
    @Test
    public void testEquals3() {
        System.out.println("equals - 3");
        assertFalse(m12CHF.equals(null));
        assertEquals(m12CHF, m12CHF);
        assertEquals(m12CHF, new Money(12, "CHF"));
        assertFalse(m12CHF.equals(m13CHF));
    }
        
    
}
