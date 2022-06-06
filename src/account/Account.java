package account;

import post.Post;

public class Account {
	private String user;
	private String login;
	private String password;
	private String email;
	private String course;
	private String semester;
	private Post posts;
	private int followers=0;
	public Account(String user, String login, String password, String email, String course, String semester, Post posts,
			int followers) {
		super();
		this.user = user;
		this.login = login;
		this.password = password;
		this.email = email;
		this.course = course;
		this.semester = semester;
		this.posts = posts;
		this.followers = followers;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
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
	public Post getPosts() {
		return posts;
	}
	public void setPosts(Post posts) {
		this.posts = posts;
	}
	public int getFollowers() {
		return followers;
	}
	public void setFollowers(int followers) {
		this.followers = followers;
	}
	
	
	

}
