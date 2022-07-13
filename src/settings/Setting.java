/**
 * Classe Setting.
 *
 * @author Bruna e Gabriela
 * @version 1.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */
package settings;

public class Setting {
	// atributos
	public String personalInformation;
	public String accountStatus;
	public String activityStatus;
	public String helpCenter;
	public String accountManagement;
	

	public Setting(String personalInformation, String accountStatus, String activityStatus, String helpCenter,
			String accountManagement) {
		super();
		this.personalInformation = personalInformation;
		this.accountStatus = accountStatus;
		this.activityStatus = activityStatus;
		this.helpCenter = helpCenter;
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
