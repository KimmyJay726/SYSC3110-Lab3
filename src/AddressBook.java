import java.util.ArrayList;


public class AddressBook {
    public AddressBook(ArrayList<BuddyInfo> buddyList) {
        buddyList = new ArrayList<BuddyInfo>();
    }

    public class addBuddy{
        BuddyInfo buddy = new BuddyInfo("Andrew", "Carleton University", 613);

    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
