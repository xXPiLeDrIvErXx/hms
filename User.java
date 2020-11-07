public class User {
   private long id;
	private String lastName,firstName,gender,email;
	
	// add rest of the variables
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	// add rest of the getters & setters
	
	//lastName
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//firstName
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String FirstName) {
			this.firstName = firstName;
		}
		
		//mail
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		//gender
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}// code from previous exercise
}