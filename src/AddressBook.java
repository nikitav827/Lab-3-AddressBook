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

    public static void main(String[] args) {
        System.out.println("Address Book");
    }




}
