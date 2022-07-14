/** @author Yohanne
 * @version 2.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */
package account.facade;

import account.Account;
import account.AccountCollection;
import account.AccountController;
import account.exceptions.ExistingUserException;
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
/**
* Recupera as contas.
* @return As contas.
*/
   public AccountCollection getAccounts() {
	return cntrlAccount.getAccounts();
    }
/**
* Adiciona uma conta.
* @param account Objeto do tipo de conta.
* @exception RegisteredAccountException Exceção que ocorre quando uma conta já é registrada.
* @exception ExistingUserException Exceção que ocorre quando o usuario já existe.
*/
    public void addAccount(Account account) throws RegisteredAccountException, ExistingUserException{
	cntrlAccount.addAccount(account);
    }
/**
* Remove uma conta.
* @param account Objeto do tipo de conta.
* @exception NotfoundException Exceção que ocorre quando o usuario não é encontrado.
*/
    public void removeAccount(Account account) throws NotFoundException {
	cntrlAccount.removeAccount(account);
    }
/**
* Procura uma conta.
* @param email Email da conta.
* @exception NotfoundException Exceção que ocorre quando o email não é encontrado.
*/
    public Account findAccount(String email) throws NotFoundException {
	return cntrlAccount.findAccount(email);
    }
 /**
* Faz uma lista da coleção de conta.
* @return lista de conta.
*/
    public Collection<Account> list() {
	return cntrlAccount.list();

    }

}
