/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Classe Facade Account.
 *
 * @author Yohanne
 * @version 2.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */
package account.facade;

import account.Account;
import account.AccountCollection;
import account.AccountController;
import account.exceptions.NotFoundException;
import account.exceptions.RegisteredAccountException;
import java.util.Collection;

public class FacadeAccount {

    private static FacadeAccount instance;
    private account.AccountController cntrlAccount;

    public static FacadeAccount getInstance() {
    if (instance == null){
	instance = new FacadeAccount();
    } 
    return instance;
    }

    private FacadeAccount(){
	cntrlAccount = new AccountController();
    }

   public AccountCollection getAccounts() {
	return cntrlAccount.getAccounts();
    }

    public void addAccount(Account account) throws RegisteredAccountException {
	cntrlAccount.addAccount(account);
    }

    public void removeAccount(Account account) throws NotFoundException {
	cntrlAccount.removeAccount(account);
    }

    public Account findAccount(String email) throws NotFoundException {
	return cntrlAccount.findAccount(email);
    }

    public Collection<Account> list() {
	return cntrlAccount.list();

    }

}
