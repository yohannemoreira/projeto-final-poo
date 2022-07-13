/**
 * Classe Account Registration.
 *
 * @author Yohanne Wildnei
 * @version 1.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */
package account;

import java.util.Collection;

import account.exceptions.ExistingUserException;
import account.exceptions.NotFoundException;
import account.exceptions.RegisteredAccountException;

interface AccountRegistration {

	public void addAccount(Account account) throws RegisteredAccountException, ExistingUserException ;

	public void removeAccount(Account account) throws NotFoundException;
	
	public Account findAccount (String email) throws NotFoundException;
	
	public Boolean searchUser(String user) throws ExistingUserException;

	public Collection<Account> list();
}
