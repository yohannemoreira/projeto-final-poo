package account;

import account.exceptions.NotFoundException;
import account.exceptions.RegisteredAccountException;
import account.facade.FacadeAccount;
import post.Post;

public class Teste {

    public static void main(String[] args) throws NotFoundException {
	AccountController accounts = new AccountController();
	Account conta1 = new Account("Yoh", "yohmoreira", "123", "yohmoreira@alu.ufc.br", "EngComp", "3");
	Account conta2 = new Account("Yoh", "yohmoreira", "123", "yohmoreira@alu.ufc.br", "EngComp", "3");
	
	try{ FacadeAccount.getInstance().addAccount(conta1);
        FacadeAccount.getInstance().addAccount(conta2);
} catch (RegisteredAccountException e){
	    System.out.println("Conta já cadastrada!");
}
	System.out.println(FacadeAccount.getInstance().getAccounts().getProfiles().get(conta1.getEmail()).getName());

    }

}
