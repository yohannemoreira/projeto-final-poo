package community;

import java.util.ArrayList;

public class Community {
	private String title;
	private String theme;
	private String description;
	private int id;
	private ArrayList<Account> listAccounts;
	
	public Community(String title, String theme, String description, int id) {
		super();
		this.title = title;
		this.theme = theme;
		this.description = description;
		this.id = id;
		this.listAccounts = new ArrayList<Account>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Account> getListAccounts() {
		return listAccounts;
	}

	public void setListAccounts(ArrayList<Account> listAccounts) {
		this.listAccounts = listAccounts;
	}

}

