package community;

import java.util.ArrayList;

import exceptions.NotFoundCommunityException;

public class CommunityRepository {
	private ArrayList<Community> communityList;

	public CommunityRepository() {
		super();
		this.communityList = new ArrayList<Community>();
	}
	
	//Add new community
	public void addCommmunity(Community community) {
		communityList.add(community);
	}
	
	//Remove community
	public void removeCommunity(Community community) throws NotFoundCommunityException{
		if(searchCommunity(community)) {
			communityList.remove(community);
		}
		else {
			throw new NotFoundCommunityException();
		}
	}
	
	//Checks if the community exists
	public boolean searchCommunity(Community community) {
		if(communityList.contains(community)) {
			return true;
		}
		return false;
	}
	
	
}
