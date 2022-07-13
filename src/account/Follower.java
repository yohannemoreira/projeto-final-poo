/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Classe Follower.
 *
 * @author Yohanne e Wildnei
 * @version 2.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */
package account;
class Follower {

    // atributos
    private Account follow;
    private Account follower;

    public Follower(Account follow, Account follower) {
	this.follow = follow;
	this.follower = follower;
    }
/**
* Recupera a seguida .
* @return A seguida.
*/
    public Account getFollow() {
	return follow;
    }

    public void setFollow(Account follow) {
	this.follow = follow;
    }
/**
* Recupera o seguidor.
* @return O seguidor.
*/
    public Account getFollower() {
	return follower;
    }

    public void setFollower(Account follower) {
	this.follower = follower;
    }

    

}
