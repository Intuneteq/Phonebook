package Data;

import UI.PhoneBkGUI;

import java.util.ArrayList;
import java.beans.PropertyChangeListener;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author steve
 */
public class PhoneBkDataTest {

    @Test
    public void testAddPropertyChangeListener() {
        System.out.println("addPropertyChangeListener");

        // Instantiate a listenr
        PhoneBkGUI phonBkGui = new PhoneBkGUI();

        // mock the implementation of PropertyChangeListener
        PropertyChangeListener expectedResult = phonBkGui;

        // Instantiate observer object
        PhoneBkData instance = new PhoneBkData();

        // Add the listener to the observer
        instance.addPropertyChangeListener(expectedResult);

        // Retrieve actual result
        PropertyChangeListener actualResult = instance.getPropertyChangeListener();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test of addContact method, of class PhoneBookData.
     */
    @Test
    public void testAddContact_nullContactName_nullContactNumber() {
        System.out.println("addContactNullContactNumberNullContactName");

        String _contactName = null;
        String _contactNumber = null;

        PhoneBkData instance = new PhoneBkData();

        boolean result = instance.addContact(_contactName, _contactNumber);

        assertFalse(result);
    }

    @Test
    public void testAddContact_emptyContactName() {
        System.out.println("addContactEmptyContactName");

        String _contactName = "";
        String _contactNumber = "1234567";

        PhoneBkData instance = new PhoneBkData();

        boolean result = instance.addContact(_contactName, _contactNumber);

        assertFalse(result);
    }

    @Test
    public void testAddContact_NumberLessThanSeven() {
        System.out.println("addContactNumberLessThanSeven");

        String _contactName = "Tester";
        String _contactNumber = "123456";

        PhoneBkData instance = new PhoneBkData();

        boolean result = instance.addContact(_contactName, _contactNumber);

        assertFalse(result);
    }

    @Test
    public void testAddContact_NumberDigits() {
        System.out.println("addContactNumberDigits");

        String _contactName1 = "Tester 1";
        String _contactName2 = "Tester 2";
        String _contactName3 = "Tester 3";

        String _contactNumber = "123456A";
        String _contactNumber2 = "-12344589";
        String _contactNumber3 = "12344589.";

        PhoneBkData instance = new PhoneBkData();

        boolean result1 = instance.addContact(_contactName1, _contactNumber);
        boolean result2 = instance.addContact(_contactName2, _contactNumber2);
        boolean result3 = instance.addContact(_contactName3, _contactNumber3);

        assertFalse(result1);
        assertFalse(result2);
        assertFalse(result3);
    }

    @Test
    public void testAddContact() {
        System.out.println("addContact");

        String _contactName = "Tester";
        String _contactNumber = "1234567";

        PhoneBkData instance = new PhoneBkData();

        boolean result = instance.addContact(_contactName, _contactNumber);

        assertTrue(result);
    }

    @Test
    public void DontAllowDuplicateNames() {
        System.out.println("DontAllowDuplicateNames");

        String contactName = "Tester";

        PhoneBkData instance = new PhoneBkData();

        // Add first item
        boolean isAddContact1 = instance.addContact(contactName, "12345678");

        // Assert first name added
        assertTrue(isAddContact1);

        ArrayList<PhoneBkItem> list = instance.getContactList();

        // The first item should be isAddContact1
        PhoneBkItem item1 = list.getFirst();

        // Assert name is actually in the list
        assertEquals(contactName, item1.getContactName());

        // Attempt to add second contact item with same name
        boolean isAddContact2 = instance.addContact(contactName, "12345679");

        // assert second name added
        assertFalse(isAddContact2);

        // assert list size is one
        assertEquals(1, instance.getSize());
    }

    /**
     * Test of getSize method, of class PhoneBookData.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");

        PhoneBkData instance = new PhoneBkData();

        assertEquals(0, instance.getSize());

        instance.addContact("Tester 1", "12345679");

        assertEquals(1, instance.getSize());

        instance.addContact("Tester 2", "12345680");

        assertEquals(2, instance.getSize());
    }

    /**
     * Test of findContactAt method, of class PhoneBookData.
     */
    @Test
    public void testFindContactAt_contactNotFound() {
        System.out.println("findContactAtContactNotFound");

        String _contactName = "Tester";
        String _contactNumber = "1234567";

        PhoneBkData instance = new PhoneBkData();

        int result = instance.findContactAt(_contactName, _contactNumber);

        assertEquals(-1, result);
    }

    @Test
    public void testFindContactAt() {
        System.out.println("findContactAt");

        String _contactName = "Tester";
        String _contactNumber = "1234567";

        PhoneBkData instance = new PhoneBkData();

        instance.addContact(_contactName, _contactNumber);

        int result = instance.findContactAt(_contactName, _contactNumber);

        assertEquals(0, result);
    }

    @Test
    public void testFindContactAt_contactNotFound_1arg() {
        System.out.println("findContactAtContactNotFound1Arg");

        String _contactName = "Tester";

        PhoneBkData instance = new PhoneBkData();

        int result = instance.findContactAt(_contactName);

        assertEquals(-1, result);
    }

    @Test
    public void testFindContactAt_1arg() {
        System.out.println("findContactAt1Arg");

        String _contactName = "Tester";
        String _contactNumber = "1234567";

        PhoneBkData instance = new PhoneBkData();

        instance.addContact(_contactName, _contactNumber);

        int result = instance.findContactAt(_contactName);

        assertEquals(0, result);
    }

    /**
     * Test of deleteContact method, of class PhoneBookData.
     */
    @Test
    public void testDeleteContact_ContactNotFound() {
        System.out.println("deleteContactNotFound");

        String _contactName = "rana";
        String _contactNumber = "1234567";

        PhoneBkData instance = new PhoneBkData();

        boolean result = instance.deleteContact(_contactName, _contactNumber);

        assertFalse(result);
    }

    @Test
    public void testDeleteContact() {
        System.out.println("deleteContact");

        String _contactName = "Tester";
        String _contactNumber = "1234567";

        PhoneBkData instance = new PhoneBkData();

        instance.addContact(_contactName, _contactNumber);

        boolean result = instance.deleteContact(_contactName, _contactNumber);

        assertTrue(result);
        assertEquals(0, instance.getSize());
    }

    /**
     * Test of getContactList method, of class PhoneBookData.
     */
    @Test
    public void testGetContactList() {
        System.out.println("getContactList");

        PhoneBkData instance = new PhoneBkData();

        ArrayList<PhoneBkItem> result = instance.getContactList();

        assertEquals(0, result.size());

        String _contactName = "Tester";
        String _contactNumber = "1234567";

        instance.addContact(_contactName, _contactNumber);

        assertEquals(1, result.size());
        assertEquals(_contactName, result.getFirst().getContactName());
        assertEquals(_contactNumber, result.getFirst().getContactNumber());
    }

    /**
     * Test of setContactList method, of class PhoneBookData.
     */
    @Test
    public void testSetContactList() {
        System.out.println("setContactList");
        
        ArrayList<PhoneBkItem> expectReslt = new ArrayList();
        
        PhoneBkData instance = new PhoneBkData();
        
        instance.setContactList(expectReslt);
        
        ArrayList<PhoneBkItem> result = instance.getContactList();
        
        assertEquals(expectReslt, result);
    }
}