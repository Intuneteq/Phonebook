package Data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author steve
 */
public class PhoneBkItemTest {

    /**
     * Test of getContactName method, of class PhoneBookItem.
     */
    @Test
    public void testGetContactName() {
        System.out.println("getContactName");

        // Declare and assign exepected result
        String expResult = "Tester";

        // create an instance of PhoneBkItem
        PhoneBkItem instance = new PhoneBkItem(expResult, "1234567");

        // Retrive name of instance
        String result = instance.getContactName();

        // Assert expected result is equals to result
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class PhoneBookItem.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");

        // Declare and assign variables
        String _contactName = "Tester";
        String _contactNumber = "12345678";

        // Instantiate a phone book instance
        PhoneBkItem instance = new PhoneBkItem(_contactName, _contactNumber);

        // test for correct value
        boolean expectTrue = instance.equals(_contactName, _contactNumber);

        // test for incorrect value
        boolean expectFalse = instance.equals("wrong name", "wrong number");

        // Assert
        assertTrue(expectTrue);
        assertFalse(expectFalse);
    }

    /**
     * Test of getContactNumber method, of class PhoneBookItem.
     */
    @Test
    public void testGetContactNumber() {
        System.out.println("getContactNumber");

        // Declare and assign exepected result
        String expResult = "1234567";

        // create an instance of PhoneBkItem
        PhoneBkItem instance = new PhoneBkItem("Tester", expResult);

        // Retrive name of instance
        String result = instance.getContactNumber();

        // Assert expected result is equals to result
        assertEquals(expResult, result);
    }

    /**
     * Test of setContactName method, of class PhoneBookItem.
     */
    @Test
    public void testSetContactName() {
        System.out.println("setContactName");

        // Declare and assign exepected result
        String expResult = "Tester";

        // create an instance of PhoneBkItem
        PhoneBkItem instance = new PhoneBkItem("InitialName", "1234567");

        // Set contact name
        instance.setContactName(expResult);

        // Assert
        assertEquals(expResult, instance.getContactName());
    }

    /**
     * Test of setContactNumber method, of class PhoneBookItem.
     */
    @Test
    public void testSetContactNumber() {
        System.out.println("setContactNumber");

        // Declare and assign exepected result
        String expResult = "1234567";

        // create an instance of PhoneBkItem
        PhoneBkItem instance = new PhoneBkItem("Tester", expResult);

        // Set contact number
        instance.setContactNumber(expResult);

        // Assert
        assertEquals(expResult, instance.getContactNumber());
    }
}
