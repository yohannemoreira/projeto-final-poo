package account;

import java.util.Collection;

import account.exceptions.NotFoundException;
import account.exceptions.RegisteredAccountException;

interface AccountRegistration {

	public void addAccount(Account account) throws RegisteredAccountException ;

	public void removeAccount(Account account) throws NotFoundException;

	public void editAccount(Account account);
	
	public Account findAccount (String user) throws NotFoundException;

	public Collection<Account> list();
}
