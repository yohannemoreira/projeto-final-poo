package account;

import Events.ExamEvents;
import java.util.Collection;

import account.exceptions.NotFoundException;
import account.exceptions.RegisteredAccountException;

public class AccountController {

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

    public void addAccount(Account account) throws RegisteredAccountException {
	accounts.addAccount(account);
    }

    public void removeAccount(Account account) throws NotFoundException {
	accounts.removeAccount(account);
    }


    public Account findAccount(String email) throws NotFoundException {
	return accounts.findAccount(email);
    }

    public Collection<Account> list() {
	return accounts.list();

    }

    public void addExam(Account account, String nameExam, String date, String localization, String description) throws NotFoundException {
	accounts.findAccount(account.getEmail()).addExam(nameExam, date, localization, description);
    }

    public void editNameExam(Account account, String nameExam) throws NotFoundException {
	accounts.findAccount(account.getEmail()).editNameExam(nameExam);
    }

    public void editDateExam(Account account, String nameExam, String DateExam) throws NotFoundException {
	accounts.findAccount(account.getEmail()).editDateExam(nameExam, DateExam);
    }

    public void editLocalizationExam(Account account, String nameExam, String LocalizationExam) throws NotFoundException {
	accounts.findAccount(account.getEmail()).editLocalization(nameExam, LocalizationExam);
    }

    public void editdescription(Account account, String nameExam, String description) throws NotFoundException {
	accounts.findAccount(account.getEmail()).editDescription(nameExam, description);
    }

    public void showExams(Account account) throws NotFoundException {
    accounts.findAccount(account.getEmail()).showExams();
    }

}
