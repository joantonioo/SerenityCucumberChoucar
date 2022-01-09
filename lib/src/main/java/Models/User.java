package Models;

public class User {
	String mail;
	String firstname;
	String lastname;
	String pass;

	public User(String mail, String firstname, String lastname, String pass) {
		super();
		this.mail = mail;
		this.firstname = firstname;
		this.lastname = lastname;
		this.pass = pass;

	}

	public String getMail() {
		return mail;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getPass() {
		return pass;
	}

}
