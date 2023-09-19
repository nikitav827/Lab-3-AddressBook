public class BuddyInfo {

    private String name;

    public BuddyInfo(){
        this.name = "Bob";
    }
    public BuddyInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Homer");
        System.out.println("Hello " + buddyInfo.getName());
    }
}
