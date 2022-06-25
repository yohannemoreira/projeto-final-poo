package account;

import exceptions.RegisteredAccountException;
import post.Post;
import post.PostRepository;

public class Teste {
	
	public static void main(String[] args) {
		AccountCollection accounts = new AccountCollection();
		Account p = new Account("yohmoreira", "yohannem", "12345", "yoholiveira06@gmail.com", "EngComp", "3°", new PostRepository(), 0);
		try {
			accounts.addAccount(p);
		} catch (RegisteredAccountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(accounts.getProfiles().toString());
	}

}
