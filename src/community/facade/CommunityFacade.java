package facade;

import java.util.Collection;

import community.Community;
import community.CommunityRepository;
import community.ICommunityRepository;
import exceptions.InexistentCommunityException;
import exceptions.NotFoundCommunityException;
import exceptions.RegisteredCommunityException;
import controllers.CommunityController;

public class CommunityFacade {
	private CommunityController communityController;
	
	static private CommunityFacade instance = null;
	
	public static CommunityFacade getInstance() {
		if(instance == null) {
			instance = new CommunityFacade();
		}
		return instance;
	}
	
	private CommunityFacade() {
		ICommunityRepository repCommunity = new CommunityRepository();
		this.communityController = new CommunityController(repCommunity);
	}
	
	public void addCommunity(Community community) throws RegisteredCommunityException {
		communityController.addCommunity(community);
	}
	
	public void removeCommunity(Community community) throws NotFoundCommunityException{
		communityController.removeCommunity(community);
	}
	
	public Community findCommunityId(Integer id) throws InexistentCommunityException{
		return communityController.findCommunityId(id);
	}
	
	public Community findCommunityTitle(String title) throws InexistentCommunityException{
		return communityController.findCommunityTitle(title);
		
	}
	
	
	public Collection<Community> list() throws InexistentCommunityException {
		Collection<Community> listCommunity = communityController.list();
		System.out.println(listCommunity);
		return listCommunity;
	}
	
	
}
