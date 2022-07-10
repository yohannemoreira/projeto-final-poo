package Settings;

import package account;
public class Settings {

	public Account account;

	//To see personal informations from the account
	private String seePersonalInformation(){
		System.out.println("Name: " + account.getName() + "/n" + "User: " + account.getUser() + "/n" + "E-mail: " + account.getEmail() + 
				"/n" + "Course: " + account.getCourse() + "/n"  +"Semester: " + account.getSemester());
	}
	
	//To see account status
	private String seeAccountStatus(String accountStatus) {
		System.out.println("Number of Followers " + followers.size() + "/n");
		System.out.println("Number of Posts " + posts.size() + "/n");
		System.out.println("Number of Exams " + exams.size() + "/n");
	}

	private void changePassword(String newPassword) {
		this.account.setPassword(newPassword);
	}
	private void changeUser(String newUser) throws UserAlreadyUsedException{
		for (int i = 0; i < account.size(); i++){
			if (account.get(i).getUser == newUser){
				throw new UserAlreadyUsedException();
			}
		}
		else() {
			this.account.setUser(newUser);
		}
	}
	private void changeName(String newName) {
		this.account.setName(newName);
	}

	private void changeEmail(String newEmail) {
		this.account.setEmail(newEmail);
	}
	
}


