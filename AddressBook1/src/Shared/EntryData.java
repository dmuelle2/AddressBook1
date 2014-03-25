package Shared;

import java.io.Serializable;

@PersistenceCapable(identityType=IdentityType.APPLICATION)
public class EntryData implements Serializable {
	private static final long serialVersionUID = 1L;
/*
	@PrimaryKey
	// Need to define the key this way so that a Seller can be passed
	// as data through RPC services.   
	// See https://developers.google.com/appengine/docs/java/datastore/jdo/creatinggettinganddeletingdata#Keys
	@Persistent(valueStrategy=IdGeneratorStrategy.IDENTITY)
	@Extension(vendorName = "datanucleus", key = "gae.encoded-pk", value = "true")
	private String id;

	@Persistent
	private String title="no title";
	@Persistent
	private String description="empty";
	@Persistent
	private double price=0.0;

	// Need to define the Seller and Buyer as "Unowned" child objects, 
	//  as they do not disappear when PostData object is deleted. 
	@Persistent
	@Unowned
	private Seller seller=null;
	@Persistent
	@Unowned
	private Buyer buyer=null;
**/
	// GWT serializable Objects need a no=argument constructor
	public EntryData() {}

	public EntryData(String n, String a, String c, String s, int z, String e, int p){
		name = n;
		address = a;
		city = c;
		state = s;
		zip = z;
		email = e;
		phone = p;
		
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public int getZip(){
		return zip;
	}

	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}
/*
	public String toString() {
		return "Post title = "+ title +
				"\n description = "+description +
				"\n price = "+ price;
	}
**/
}