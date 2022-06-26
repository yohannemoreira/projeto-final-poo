package community;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import exceptions.NotFoundCommunityException;
import exceptions.RegisteredCommunityException;

public class CommunityCollection implements CommunityRegistration{
	private Map<Integer, Community> communityList;

	public CommunityCollection() {
		super();
		this.communityList = new HashMap<Integer, Community>();
	}
	
	
	public Map<Integer, Community> getCommunityList() {
		return communityList;
	}

	public void setCommunityList(Map<Integer, Community> communityList) {
		this.communityList = communityList;
	}



	//Add new community
	@Override
	public void addCommunity(Community community) throws RegisteredCommunityException{
		try {
			findCommunity(community.getId());
			throw new RegisteredCommunityException();
		}
		catch(NotFoundCommunityException error) {
			communityList.put(community.getId(), community);
		}
	}
	
	//Remove community
	@Override
	public void removeCommunity(Community community) throws NotFoundCommunityException{
		if(findCommunity(community.getId())!= null) {
			communityList.remove(community.getId());
		}
	}
	
	//Checks if the community exists
	@Override
	public Community findCommunity(Integer id) throws NotFoundCommunityException{
		Community search = communityList.get(id);
		if(search == null) {
			throw new NotFoundCommunityException();
		}
		return search;
	}
	
	//Community list
	@Override
	public Collection<Community> list(){
		return this.communityList.values();
	}
	
	
}
