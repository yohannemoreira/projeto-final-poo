package Settings;

import package account;
public class Settings {

	public Account account;

	//To see personal informations from the account
	private String seePersonalInformation(){
		System.out.println("Name: " + account.getName() + "/n" + "User: " + account.getUser() + "/n" + "E-mail: " + account.getEmail() + 
				"/n" + "Course: " + account.getCourse() + "/n"  +"Semester: " + account.getSemester() );
	}
	
	//To see account status
	private String seeAccountStatus(String accountStatus) {
		System.out.println("Number of Followers " + followers.size() + "/n");
		System.out.println("Number of Posts " + posts.size() + "/n");
		System.out.println("Number of Exams " + exams.size() + "/n");
	}	

	private void changePassword (String newPassword) {
		account.findAccount(account.setPassword(password)).changePassword(password);
	}

	private void changeName(String newName) {
		account.findAccount(account.setName(name)).changeName(name);
	}

	private void changeEmail(String newEmail) {
		account.findAccount(account.setEmail(email)).changeEmail(email);
	}

	private void logOut() {
	
	}

	private void deleteAccount() {
	
	}
	
}


