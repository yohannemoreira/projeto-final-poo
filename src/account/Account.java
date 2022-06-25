package account;

import post.Post;
import post.PostRepository;

public class Account {
	private String name;
	private String user;
	private String password;
	private String email;
	private String course;
	private String semester;
	private PostRepository posts;
	private int followers=0;
	public Account(String name, String user, String password, String email, String course, String semester, PostRepository posts,
			int followers) {
		super();
		this.name = name;
		this.user = user;
		this.password = password;
		this.email = email;
		this.course = course;
		this.semester = semester;
		this.posts = posts;
		this.followers = followers;
	}
	public String getUser() {
		return name;
	}
	public void setUser(String user) {
		this.name = user;
	}
	public String getLogin() {
		return user;
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
	public PostRepository getPosts() {
		return posts;
	}
	public void setPosts(PostRepository posts) {
		this.posts = posts;
	}
	public int getFollowers() {
		return followers;
	}
	public void setFollowers(int followers) {
		this.followers = followers;
	}
	
	
	

}
