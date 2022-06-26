package community;

import java.util.Collection;

import exceptions.NotFoundCommunityException;
import exceptions.RegisteredCommunityException;

interface CommunityRegistration {
	public void addCommunity(Community community) throws RegisteredCommunityException;
	
	public void removeCommunity(Community community) throws NotFoundCommunityException;
	
	public Community findCommunity(Integer id) throws NotFoundCommunityException;
	
	public Collection<Community> list();
}
