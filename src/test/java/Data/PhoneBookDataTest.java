/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Data;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
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
public class PhoneBookDataTest {
    
    public PhoneBookDataTest() {
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
     * Test of addPropertyChangeListener method, of class PhoneBookData.
     */
    @Test
    public void testAddPropertyChangeListener() {
        System.out.println("addPropertyChangeListener");
        PropertyChangeListener outsidePcl = null;
        PhoneBookData instance = new PhoneBookData();
        instance.addPropertyChangeListener(outsidePcl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addContact method, of class PhoneBookData.
     */
    @Test
    public void testAddContact() {
        System.out.println("addContact");
        String _contactName = "";
        String _contactNumber = "";
        PhoneBookData instance = new PhoneBookData();
        boolean expResult = false;
        boolean result = instance.addContact(_contactName, _contactNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class PhoneBookData.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        PhoneBookData instance = new PhoneBookData();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findContactAt method, of class PhoneBookData.
     */
    @Test
    public void testFindContactAt() {
        System.out.println("findContactAt");
        String _contactName = "";
        String _contactNumber = "";
        PhoneBookData instance = new PhoneBookData();
        int expResult = 0;
        int result = instance.findContactAt(_contactName, _contactNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteContact method, of class PhoneBookData.
     */
    @Test
    public void testDeleteContact() {
        System.out.println("deleteContact");
        String _contactName = "";
        String _contactNumber = "";
        PhoneBookData instance = new PhoneBookData();
        boolean expResult = false;
        boolean result = instance.deleteContact(_contactName, _contactNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContactList method, of class PhoneBookData.
     */
    @Test
    public void testGetContactList() {
        System.out.println("getContactList");
        PhoneBookData instance = new PhoneBookData();
        ArrayList<PhoneBookItem> expResult = null;
        ArrayList<PhoneBookItem> result = instance.getContactList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContactList method, of class PhoneBookData.
     */
    @Test
    public void testSetContactList() {
        System.out.println("setContactList");
        ArrayList<PhoneBookItem> contactList = null;
        PhoneBookData instance = new PhoneBookData();
        instance.setContactList(contactList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
