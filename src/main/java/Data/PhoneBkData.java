package Data;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

/**
 *
 * @author Stiv
 */
public class PhoneBkData {

    private ArrayList<PhoneBkItem> contactList;
    public PropertyChangeListener pcl;

    public PhoneBkData() {
        contactList = new ArrayList<>();
    }

    /**
     * @return the contactList
     */
    public ArrayList<PhoneBkItem> getContactList() {
        return contactList;
    }

    /**
     * @param contactList the contactList to set
     */
    public void setContactList(ArrayList<PhoneBkItem> contactList) {
        this.contactList = contactList;
    }

    public void addPropertyChangeListener(PropertyChangeListener outsidePcl) {
        pcl = outsidePcl;
    }

    /**
     * Getter method for property change listener
     *
     * @return property change listener
     */
    public PropertyChangeListener getPropertyChangeListener() {
        return this.pcl;
    }

    public boolean addContact(String _contactName, String _contactNumber) {
        //if is a phone number it must be at least 7 digits
        //for name it 
        if (_contactName == null || _contactNumber == null) {
            return false;
        }

        if (_contactName.equals("")) {
            return false;
        }

        if (_contactName.length() <7)
        {
            return false;
        }
        if (_contactNumber.length() < 7) {
            return false;
        }

        //check if given phone number allows + sign
        if (!_contactNumber.matches("^\\+?[0-9]{7,}$")) {            
            return false;
        }

        // check for duplicate name and return false if found
        if (findContactAt(_contactName) != -1) {
            return false;
        }

        // check for duplicate number and return false if found
        if (findContactAt(_contactNumber) != -1) {
            return false;
        }

        // Check for duplicate number and return false if found
        PhoneBkItem pbi = new PhoneBkItem(_contactName, _contactNumber);

        getContactList().add(pbi);

        if (pcl != null) {
            pcl.propertyChange(new PropertyChangeEvent(this, "contactAdded", null, this));
        }

        return true;
    }

    public int getSize() {
        return getContactList().size();
    }

    public int findContactAt(String _contactName, String _contactNumber) {
        for (int i = 0; i < getContactList().size(); i++) {
            if (getContactList().get(i).equals(_contactName, _contactNumber)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Find contact index by contact name or contact number
     *
     * @param _contactInfo contact's name pr number
     * @return contact index
     */
    public int findContactAt(String _contactInfo) {
        for (int i = 0; i < getContactList().size(); i++) {
            if (getContactList().get(i).getContactName().equals(_contactInfo) || getContactList().get(i).getContactNumber().equals(_contactInfo)) {
                return i;
            }
        }

        return -1;
    }

    public boolean deleteContact(String _contactName, String _contactNumber) {
        int at = findContactAt(_contactName, _contactNumber);

        if (at < 0) {
            return false;
        }

        getContactList().remove(at);

        if (pcl != null) {
            pcl.propertyChange(new PropertyChangeEvent(this, "contactDeleted", null, this));
        }

        return true;

    }
}
