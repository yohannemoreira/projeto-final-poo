package account;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import account.exceptions.NotFoundException;
import account.exceptions.RegisteredAccountException;

public class AccountCollection implements AccountRegistration {

    private Map<String, Account> profiles = new HashMap<String, Account>();

    public Map<String, Account> getProfiles() {
	return profiles;
    }

    public void setProfiles(Map<String, Account> profiles) {
	this.profiles = profiles;
    }

    @Override
    public void addAccount(Account account) throws RegisteredAccountException {
	try {
	    findAccount(account.getEmail());
	    throw new RegisteredAccountException();
	} catch (NotFoundException e) {
	    profiles.put(account.getEmail(), account);
	}

    }

    @Override
    public void removeAccount(Account account) throws NotFoundException {
	findAccount(account.getUser());
	profiles.remove(account.getUser());
    }

    @Override
    public void editAccount(Account account) {

    }

    @Override
    public Account findAccount(String email) throws NotFoundException {
	Account search = profiles.get(email);
	if (search == null) {
	    throw new NotFoundException();
	}
	return search;

    }

    @Override
    public Collection<Account> list() {

	return this.profiles.values();
    }

//    public void addExam(Account account, String nameEv, String date, String localization, String description) throws NotFoundException {
//	findAccount(account.getEmail()).addExam(nameEv, date, localization, description);
//    }
//
//    public void editNameExam(Account account, String nameEv) throws NotFoundException {
//	findAccount(account.getEmail()).editNameExam(nameEv);
//    }
//
//    public void editDateExam(Account account, String nameExam, String DateExam) throws NotFoundException {
//	findAccount(account.getEmail()).editDateExam(nameExam, DateExam);
//    }
//
//    public void editLocalizationExam(Account account, String nameExam, String LocalizationExam) throws NotFoundException {
//	findAccount(account.getEmail()).editLocalization(nameExam, LocalizationExam);
//    }
//
//    public void editdescription(Account account, String nameExam, String description) throws NotFoundException {
//	findAccount(account.getEmail()).editDescription(nameExam, description);
//    }

}
