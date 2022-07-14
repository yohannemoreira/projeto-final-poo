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
/**
* Adiciona uma conta.
* @param account Objeto do tipo conta.
* @exception RegisteredAccountException Exceção que ocorre quando uma conta já é registrada.
* @exception ExistingUserException Exceção que ocorre quando o usuario já existe.
*/
	public void addAccount(Account account) throws RegisteredAccountException, ExistingUserException ;
/**
* Remove uma conta.
* @param account Objeto do tipo de conta.
* @exception NotfoundException Exceção que ocorre quando o usuario não é encontrado.
*/
	public void removeAccount(Account account) throws NotFoundException;
/**
* Procura uma conta.
* @param email Email da conta.
* @exception NotfoundException Exceção que ocorre quando o email não é encontrado.
*/	
	public Account findAccount (String email) throws NotFoundException;
/**
* Procura um usúario.
* @param user Usúario da conta.
* @exception ExistingUserException Exceção que ocorre quando o usúario já existe.
*/
	public Account searchUser(String user) throws ExistingUserException;
/**
* Faz uma lista da coleção de contas.
*/
	public Collection<Account> list();
}
