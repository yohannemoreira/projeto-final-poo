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

		try {
			System.out.println("Adicionando a conta 1");
			FacadeAccount.getInstance().addAccount(conta1);
			System.out.println("deu certo");
			System.out.println("Adicionando a conta 2");
			FacadeAccount.getInstance().addAccount(conta2);
			System.out.println("deu certo");
			System.out.println("Adicionando a conta 3");
			FacadeAccount.getInstance().addAccount(conta3);
			System.out.println("deu certo");
		} catch (RegisteredAccountException e) {
			System.out.println("Conta já existe!");
		}

	}
}
