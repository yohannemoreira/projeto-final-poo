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
import account.exceptions.ExistingUserException;
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
/**
* Adiciona uma conta.
* @param account Objeto do tipo de conta.
* @exception RegisteredAccountException Exceção que ocorre quando um email já é registrada.
* @exception NotfoundException Exceção que ocorre quando o email não é encontrado.
*/
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
/**
* Remove uma conta.
* @param account Objeto do tipo de conta.
* @exception NotfoundException Exceção que ocorre quando o usuario não é encontrado.
*/
    @Override
    public void removeAccount(Account account) throws NotFoundException  {
    findAccount(account.getEmail());
	profiles.remove(account.getEmail());
    }

/**
* Procura uma conta.
* @param email Email da conta.
* @exception NotfoundException Exceção que ocorre quando o email não é encontrado.
*/
    @Override
    public Account findAccount(String email) throws NotFoundException  {
	Account search = profiles.get(email);
	
	if (search == null) {
	    throw new NotFoundException();
	}
	return search;

    }
/**
* Faz uma lista de coleção de contas.
* @return pega valores que estão dentro da coleção de contas.
*/
    @Override
    public Collection<Account> list() {

	return this.profiles.values();
    }
/**
* Procura usúario.
* @param user Usúario da conta.
* @exception ExistingUserException Exceção que ocorre quando o usúario já existe.
*/
	@Override
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
