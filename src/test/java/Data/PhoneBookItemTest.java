/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Data;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author steve
 */
public class PhoneBookItemTest {
    
    public PhoneBookItemTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
    
    

    /**
     * Test of getContactName method, of class PhoneBookItem.
     */
    @Test
    public void testGetContactName() {
        System.out.println("getContactName");
        PhoneBookItem instance = new PhoneBookItem("","");
        String expResult = "";
        String result = instance.getContactName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class PhoneBookItem.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        String _contactName = "";
        String _contactNumber = "";
        PhoneBookItem instance = new PhoneBookItem("","");;
        boolean expResult = false;
        boolean result = instance.equals(_contactName, _contactNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContactName method, of class PhoneBookItem.
     */
   

    /**
     * Test of getContactNumber method, of class PhoneBookItem.
     */
    @Test
    public void testGetContactNumber() {
        System.out.println("getContactNumber");
        PhoneBookItem instance = new PhoneBookItem("","");;
        String expResult = "";
        String result = instance.getContactNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContactName method, of class PhoneBookItem.
     */
    @Test
    public void testSetContactName() {
        System.out.println("setContactName");
        String ContactName = "";
        PhoneBookItem instance = new PhoneBookItem("","");;
        instance.setContactName(ContactName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContactNumber method, of class PhoneBookItem.
     */
    @Test
    public void testSetContactNumber() {
        System.out.println("setContactNumber");
        String ContactNumber = "";
        PhoneBookItem instance = new PhoneBookItem("","");;
        instance.setContactNumber(ContactNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
   
    
}
