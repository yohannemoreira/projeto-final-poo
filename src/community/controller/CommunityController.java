package controller;

import java.util.Collection;

import community.Community;
import exceptions.InexistentCommunityException;
import exceptions.NotFoundCommunityException;
import exceptions.RegisteredCommunityException;
import repository.ICommunityRepository;

public class CommunityController {
		//Attributes
		private ICommunityRepository repCommunity;
		
		//Constructor
		public CommunityController(ICommunityRepository repCommunity) {
			super();
			this.repCommunity = repCommunity;
		}
		
		//Add new community
		public void addCommunity(Community community) throws RegisteredCommunityException{
			Community a = null;
			//Check the id
			try {
				a = findCommunityId(community.getId());
			} catch(InexistentCommunityException error) {
				
			}
			Community b = null;
			//Check the title
			try {
				b = findCommunityTitle(community.getTitle());
			} catch(InexistentCommunityException error) {
				
			}
			
			//add community
			if((a == null) && (b == null)) {
				repCommunity.addCommunity(community);
			}
			//community exists
			else {
				throw new RegisteredCommunityException();
			}
		}
		
		//Remove community
		public void removeCommunity(Community community) throws NotFoundCommunityException{
			try {
				findCommunityId(community.getId());
				repCommunity.removeCommunity(community);
				
			} catch(InexistentCommunityException erro) {
				throw new NotFoundCommunityException();
			}
		}
		
		//Checks community id
		public Community findCommunityId(Integer id) throws InexistentCommunityException{
			Community search = repCommunity.findCommunityId(id);
			if(search == null) {
				throw new InexistentCommunityException();
			}
			return search;
		}
		
		//Checks community title
		public Community findCommunityTitle(String title) throws InexistentCommunityException{
			Community search = repCommunity.findCommunityTitle(title);
			if(search == null) {
				throw new InexistentCommunityException();
			}
			return search;
			
		}
		
		//Community list
		public Collection<Community> list() throws InexistentCommunityException{
			Collection<Community> list = repCommunity.list();
			if((list == null) || (list.size() == 0)) {
				throw new InexistentCommunityException();
			}
			return list;
		}

		
		
}
