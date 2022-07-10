	package Settings;

import package account;

public class Settings {
	public String personalInformation;
	public String accountStatus;
	public String accountManagement;
<<<<<<< Updated upstream
	publilc Account account;

	public Settings(String personalInformation, String accountStatus, String activityStatus, String accountManagement) {
=======
<<<<<<< HEAD
<<<<<<< HEAD
	

	public Setting(String personalInformation, String accountStatus, String activityStatus, String helpCenter,
			String accountManagement) {
=======
	publilc Account account;

	public Settings(String personalInformation, String accountStatus, String activityStatus, String accountManagement) {
>>>>>>> 1642173a97d6267bb5ad21b4d91c36f74683b638
=======
	publilc Account account;

	public Settings(String personalInformation, String accountStatus, String activityStatus, String accountManagement) {
>>>>>>> 1642173a97d6267bb5ad21b4d91c36f74683b638
>>>>>>> Stashed changes
		super();
		this.personalInformation = personalInformation;
		this.accountStatus = accountStatus;
		this.accountManagement = accountManagement;
	}

	public String getPersonalInformation() {
		return personalInformation;
	}

	public void setPersonalInformation(String personalInformation) {
		this.personalInformation = personalInformation;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getAccountManagement() {
		return accountManagement;
	}

	public void setAccountManagement(String accountManagement) {
		this.accountManagement = accountManagement;
	}
	
	
private String seePersonalInformation(String personalInformation) {
	
}

private String seeAccountStatus(String accountStatus) {
	
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


