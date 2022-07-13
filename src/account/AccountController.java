/**
 * Classe Account Controller.
 *
 * @author Yohanne e Wildnei
 * @version 1.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */
package account;

import Events.ExamEvents;
import java.util.Collection;

import account.exceptions.ExistingUserException;
import account.exceptions.NotFoundException;
import account.exceptions.RegisteredAccountException;

public class AccountController {
    // atributos
    private AccountCollection accounts;

    public AccountController() {
	super();
	this.accounts = new AccountCollection();
    }

    public AccountCollection getAccounts() {
	return accounts;
    }

    public void setAccounts(AccountCollection accounts) {
	this.accounts = accounts;
    }

    public void addAccount(Account account) throws RegisteredAccountException, ExistingUserException{
	accounts.addAccount(account);
    }

    public void removeAccount(Account account) throws NotFoundException{
	accounts.removeAccount(account);
    }

    public Account findAccount(String email) throws NotFoundException{
	return accounts.findAccount(email);
    }

    public Collection<Account> list() {
	return accounts.list();

    }

}
