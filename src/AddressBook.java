import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfoList;

    public AddressBook(){
        buddyInfoList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddyInfo){
        buddyInfoList.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo){
        buddyInfoList.remove(buddyInfo);
    }

    public void buddyListSize(){
        System.out.println(buddyInfoList.size());
    }

    public static void main(String[] args) {
        System.out.println("Address Book");

        BuddyInfo buddy = new BuddyInfo("Tom");
        BuddyInfo buddy2 = new BuddyInfo("John");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.addBuddy(buddy2);
        addressBook.removeBuddy(buddy);
        addressBook.removeBuddy(buddy2);
        addressBook.buddyListSize();

    }




}
