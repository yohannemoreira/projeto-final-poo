package community;

import java.util.HashMap;
import java.util.Map;

public class Community {
	private String title;
	private String theme;
	private String description;
	private Integer id;
	private Map<String, Account> profiles;

	
	public Community(String title, String theme, String description, Integer id) {
		super();
		this.title = title;
		this.theme = theme;
		this.description = description;
		this.id = id;
		this.profiles = new HashMap<String, Account>();
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Map<String, Account> getProfiles() {
		return profiles;
	}

	public void setProfiles(Map<String, Account> profiles) {
		this.profiles = profiles;
	}

	@Override
	public String toString() {
		return "Community [title=" + title + ", theme=" + theme + ", description=" + description + ", id=" + id
				+ ", profiles=" + profiles + "]\n";
	}
	
	
	
}


