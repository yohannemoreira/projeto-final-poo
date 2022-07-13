package account;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import account.exceptions.ExistingUserException;
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
    public void addAccount(Account account) throws RegisteredAccountException, ExistingUserException {
    	try {
    		findAccount(account.getEmail());
    		throw new RegisteredAccountException();
    	}
    	catch (NotFoundException e) {
		} 
    	try {
    		searchUser(account.getUser());
    	}
    	catch(ExistingUserException e) {
    		throw new ExistingUserException();
    	}
    	profiles.put(account.getEmail(), account);
    }

    @Override
    public void removeAccount(Account account) throws NotFoundException  {
	findAccount(account.getUser());
	profiles.remove(account.getUser());
    }


    @Override
    public Account findAccount(String email) throws NotFoundException  {
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

	@Override //ver se o wild consegue resolver
	//O wild conseguiu ajeitar :)
	public Account searchUser(String user) throws ExistingUserException{
		Account search = null;
		for(Account account : profiles.values()) {
			if(account.getUser().equalsIgnoreCase(user)) {
				search = account;
				throw new ExistingUserException();
			}
		}
		return search;
	}

}
