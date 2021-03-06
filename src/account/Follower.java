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
/**
* Cria um Seguidor usando a "seguida" da conta e o seguidor da conta.
* @param follow "Seguida" da conta.
* @param follower Seguidor da conta.
*/
    public Follower(Account follow, Account follower) {
	this.follow = follow;
	this.follower = follower;
    }
/**
* Recupera a seguida.
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
