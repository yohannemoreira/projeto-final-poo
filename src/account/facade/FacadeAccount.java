/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account.facade;

import account.AccountController;

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

}
