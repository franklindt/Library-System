// All commented code will be implemented in the future when the dependencies are created

public class Borrower extends User {
	//private Library library;

	public Borrower(String name, String address, int age, String gender, String birthDate, /**Library library**/) {
		super(name, address, age, gender, birthDate);
		//this.library = library;
	}


	
	public static String toString() {
		String user = "Name: " + this.name + "\nAddress: " + this.address + "\nAge: " + this.age + "\nGender: " + this.gender + "\nBirth Date: " + this.birthDate/** + "\nLibrary: " + this.library**/;
		return librarian;
	}
}