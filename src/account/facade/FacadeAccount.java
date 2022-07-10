/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

    public void addExam(Account account, String nameExam, String date, String localization, String description) throws NotFoundException {
	cntrlAccount.findAccount(account.getEmail()).addExam(nameExam, date, localization, description);
    }

    public void editNameExam(Account account, String nameExam) throws NotFoundException {
	cntrlAccount.findAccount(account.getEmail()).editNameExam(nameExam);
    }

    public void editDateExam(Account account, String nameExam, String DateExam) throws NotFoundException {
	cntrlAccount.findAccount(account.getEmail()).editDateExam(nameExam, DateExam);
    }

    public void editLocalizationExam(Account account, String nameExam, String LocalizationExam) throws NotFoundException {
	cntrlAccount.findAccount(account.getEmail()).editLocalization(nameExam, LocalizationExam);
    }

    public void editdescription(Account account, String nameExam, String description) throws NotFoundException {
	cntrlAccount.findAccount(account.getEmail()).editDescription(nameExam, description);
    }

    public void showExams(Account account) throws NotFoundException {
	cntrlAccount.findAccount(account.getEmail()).showExams();
    }

}
