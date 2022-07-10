/**
 * @author Yohanne Moreira
 * version 1.0
 * since 05-06-2022
 */
package account;

import Events.ExamEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import post.Post;

public class Account {

    private String name;
    private String user;
    private String password;
    private String email;
    private String course;
    private String semester;
    private List<Follower> followers;
    private List<Post> posts;
    private Map<String, ExamEvents> exams;
//  Construtor Padrão

    public Account(String name, String user, String password, String email, String course, String semester) {
	super();
	this.name = name;
	this.user = user;
	this.password = password;
	this.email = email;
	this.course = course;
	this.semester = semester;
	this.followers = new ArrayList();
	this.posts = new ArrayList();
	this.exams = new HashMap<String, ExamEvents>();
    }

// Métodos Getters e Setters
    public String getUser() {
	return user;
    }

    public void setUser(String user) {
	this.user = user;
    }

    public String getName() {
	return name;
    }

    public void setLogin(String login) {
	this.user = login;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getCourse() {
	return course;
    }

    public void setCourse(String course) {
	this.course = course;
    }

    public String getSemester() {
	return semester;
    }

    public void setSemester(String semester) {
	this.semester = semester;
    }

    public List<Follower> getFollowers() {
	return followers;
    }

    public void setFollowers(List<Follower> followers) {
	this.followers = followers;
    }

    public List<Post> getPosts() {
	return posts;
    }

    public void setPosts(List<Post> posts) {
	this.posts = posts;
    }

}
