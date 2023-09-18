import java.util.ArrayList;
import java.util.Collections;

public class AddressBook {

    ArrayList<BuddyInfo> buddyList = new ArrayList<BuddyInfo>();

    public void addBuddy(BuddyInfo newBuddy){
       buddyList.add(newBuddy);
    }

    public void removeBuddy (BuddyInfo killBuddy){
        buddyList.remove(killBuddy);
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Andrew", "Carleton University", 613);
        AddressBook addressList = new AddressBook();
        addressList.addBuddy(buddy);
        addressList.removeBuddy(buddy);


    }
}
