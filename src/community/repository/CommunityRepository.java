package community;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class CommunityRepository implements ICommunityRepository{
	//Atributes
  private Map<Integer, Community> communityList;
	
  //Constructor
	public CommunityRepository() {
		this.communityList = new HashMap<Integer, Community>();
	}

	//Add new community
	@Override
	public void addCommunity(Community community){
		communityList.put(community.getId(), community);
	}
	
	//Remove community
	@Override
	public void removeCommunity(Community community){
		communityList.remove(community.getId());
	}
	
	//Checks community id
	@Override
	public Community findCommunityId(Integer id){
		return (Community) communityList.get(id);
	}
	
	//Checks community title
	@Override
	public Community findCommunityTitle(String title) {
		Community search = null;
		for(Community community : communityList.values()) {
			if(community.getTitle().equalsIgnoreCase(title)) {
				search = community;
				break;
			}
		}
		return search;
		
	}
	
	//Community list
	@Override
	public Collection<Community> list(){
		return this.communityList.values();
	}
	
	
}
