import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<BuddyInfo> buddies;
	public AddressBook() {
		this.buddies = new ArrayList<BuddyInfo>();
		
	}
	public void addBuddy(BuddyInfo buddy) {
		if(buddy!=null) buddies.add(buddy);	
	}
	public BuddyInfo removeBuddy(int index) {
		if(index >= 0 && index < this.buddies.size()) 
			return this.buddies.remove(index);
		return null;
	}
	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Homer", "Simpsons", "5345");
		AddressBook book = new AddressBook();
		book.addBuddy(buddy);
		book.removeBuddy(0);
	}

}
	
