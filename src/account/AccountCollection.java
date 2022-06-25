package account;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import exceptions.NotFoundException;
import exceptions.RegisteredAccountException;

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
			findAccount(account.getUser());
			throw new RegisteredAccountException();
		} catch (NotFoundException e) {
			profiles.put(account.getUser(), account);
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
	public Account findAccount(String user) throws NotFoundException {
		Account search = profiles.get(user);
		if (search == null) {
			throw new NotFoundException();
		}
		return search;

	}
	
	public String toString(String user) throws NotFoundException {
		
		return "user" + findAccount(user).getUser();
	}

	@Override
	public Collection<Account> list() {
		
		return this.profiles.values();	}

}
