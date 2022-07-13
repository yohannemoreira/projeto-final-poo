/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

/**
 *
 * @author Yohanne
 */
class Follower {

    private Account follow;
    private Account follower;

    public Follower(Account follow, Account follower) {
	this.follow = follow;
	this.follower = follower;
    }

    public Account getFollow() {
	return follow;
    }

    public void setFollow(Account follow) {
	this.follow = follow;
    }

    public Account getFollower() {
	return follower;
    }

    public void setFollower(Account follower) {
	this.follower = follower;
    }

    

}
