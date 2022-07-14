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
 // atributos
public class AccountController {

   private AccountCollection accounts;
	
/** Faz um conttrolador de conta
*/
    public AccountController() {
	super();
	this.accounts = new AccountCollection();
    }
/**
* Recupera a conta.
* @return A conta.
*/
    public AccountCollection getAccounts() {
	return accounts;
    }

    public void setAccounts(AccountCollection accounts) {
	this.accounts = accounts;
    }
/**
* Adiciona uma conta.
* @param account Objeto do tipo de conta.
* @exception RegisteredAccountException Exceção que ocorre quando uma conta já é registrada.
* @exception ExistingUserException Exceção que ocorre quando o usuario já existe.
*/
    public void addAccount(Account account) throws RegisteredAccountException, ExistingUserException{
	accounts.addAccount(account);
    }
/**
* Remove uma conta.
* @param account Objeto do tipo de conta.
* @exception NotfoundException Exceção que ocorre quando o usuario não é encontrado.
*/
    public void removeAccount(Account account) throws NotFoundException{
	accounts.removeAccount(account);
    }
/**
* Procura uma conta.
* @param email Email da conta.
* @exception NotfoundException Exceção que ocorre quando o email não é encontrado.
*/
    public Account findAccount(String email) throws NotFoundException{
	return accounts.findAccount(email);
    }
/** Faz uma lista da coleção de conta.
* @return Lista de contar.
*/
    public Collection<Account> list() {
	return accounts.list();

    }

}
