package account;

import account.exceptions.NotFoundException;
import account.exceptions.RegisteredAccountException;
import post.Post;

public class Teste {

    public static void main(String[] args) throws NotFoundException {
	AccountController accounts = new AccountController();
	Account conta1 = new Account("Yoh", "yohmoreira", "123", "yohmoreira@alu.ufc.br", "EngComp", 3);
	Account conta2 = new Account("Yoh", "yohmoreira", "123", "yohmoreira@alu.ufc.br", "EngComp", 3);
	try {
	    accounts.addAccount(conta1);
	    System.out.println("Registro Feito");
	    accounts.addAccount(conta2);
	} catch (RegisteredAccountException e) {
	    System.out.println("Conta já registrada");
	}
	System.out.println(accounts.getAccounts().getProfiles().get(conta1.getEmail()).getName());

	conta1.addExam("Trabalho de POO", "12/07/2022", "Bloco Anexo", "Trabalho de Final de Disciplina");
	conta1.addExam("Trabalho de ED", "12/07/2022", "Bloco Anexo", "Trabalho de Final de Disciplina");
	accounts.showExams(conta1);
    }

}
