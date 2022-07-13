/**
 * Classe Account Collection.
 *
 * @author Yohanne e Wildnei.
 * @version 2.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */
package account;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import account.exceptions.NotFoundException;
import account.exceptions.RegisteredAccountException;


public class AccountCollection implements AccountRegistration {

    private Map<String, Account> profiles = new HashMap<String, Account>();

	/**
* Recupera o perfil da conta.
* @return O perfil da conta.
*/
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
	}catch (NotFoundException e) {
	    profiles.put(account.getEmail(), account);
	} 
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
	public Boolean searchUser(String user) {
		return null;
	}

}
