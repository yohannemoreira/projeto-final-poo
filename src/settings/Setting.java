package settings;

public class Setting {
	public String personalInformation;
	public String accountStatus;
	public String activityStatus;
	public String helpCenter;
	public String accountManagement;
	public String language;

	public Setting(String personalInformation, String accountStatus, String activityStatus, String helpCenter,
			String accountManagement, String language) {
		super();
		this.personalInformation = personalInformation;
		this.accountStatus = accountStatus;
		this.activityStatus = activityStatus;
		this.helpCenter = helpCenter;
		this.accountManagement = accountManagement;
		this.language = language;
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

	public String getActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	public String getHelpCenter() {
		return helpCenter;
	}

	public void setHelpCenter(String helpCenter) {
		this.helpCenter = helpCenter;
	}

	public String getAccountManagement() {
		return accountManagement;
	}

	public void setAccountManagement(String accountManagement) {
		this.accountManagement = accountManagement;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
private String seePersonalInformation(String personalInformation) {
	
}

private String seeAccountStatus(String accountStatus) {
	
}	

private String seeActivityStatus(String activityStatus) {
	
}

private void changePassword (String newPassword) {
	
}

private void changeName(String newName) {
	
}

private void changeEmail(String newEmail) {
	
}

private void logOut() {
	
}

private void deleteAccount() {
	
}

}
