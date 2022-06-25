package account;

import java.util.Collection;

import exceptions.NotFoundException;
import exceptions.RegisteredAccountException;

interface AccountRegistration {

	public void addAccount(Account account) throws RegisteredAccountException ;

	public void removeAccount(Account account) throws NotFoundException;

	public void editAccount(Account account);
	
	public Account findAccount (String user) throws NotFoundException;

	public Collection<Account> list();
}
