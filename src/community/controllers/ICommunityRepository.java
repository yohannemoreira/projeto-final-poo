package community;

import java.util.Collection;


public interface ICommunityRepository {
	public void addCommunity(Community community);
	
	public void removeCommunity(Community community);
	
	public Community findCommunityId(Integer id);
	
	public Community findCommunityTitle(String title);
	
	public Collection<Community> list();
}
