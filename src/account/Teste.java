package account;

import account.exceptions.NotFoundException;
import account.exceptions.RegisteredAccountException;
import account.facade.FacadeAccount;
import post.Post;

public class Teste {

	public static void main(String[] args) throws NotFoundException {
		AccountController accounts = new AccountController();
		Account conta1 = new Account("Yoh", "yohmoreira", "123", "yohmoreira@alu.ufc.br", "EngComp", "3");
		Account conta2 = new Account("Yoh", "yohmoreira", "123", "yoyoyoyyooh", "EngComp", "3");
		Account conta3 = new Account("Yoh", "yohmoreira", "123", "yoyoyoyyooh", "EngComp", "3");



	}
}
