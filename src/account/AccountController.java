package account;

import java.util.Collection;

import exceptions.NotFoundException;
import exceptions.RegisteredAccountException;

public class AccountController {
	
	private AccountRegistration accountRegistration;
	
	
	
	public AccountController(AccountRegistration accountRegistration) {
		super();
		this.accountRegistration = accountRegistration;
	}

	public void addAccount(Account account) throws RegisteredAccountException{
		accountRegistration.addAccount(account);
	}

	public void removeAccount(Account account) throws NotFoundException{
		accountRegistration.removeAccount(account);
	}

	public void editAccount(Account account){
		
	}
	
	public Account findAccount (String user) throws NotFoundException{	
		return accountRegistration.findAccount(user);
	}

	public Collection<Account> list(){
		return accountRegistration.list();
		
	};
	
	

}
