<<<<<<< Updated upstream
package facade;

import java.util.Collection;

import community.Community;
import controller.CommunityController;
import exceptions.InexistentCommunityException;
import exceptions.NotFoundCommunityException;
import exceptions.RegisteredCommunityException;
import repository.CommunityRepository;
import repository.ICommunityRepository;

public class CommunityFacade {
	//Attributes
	private CommunityController communityController;
	
	//Pattern singleton
	static private CommunityFacade instance = null;
	
	public static CommunityFacade getInstance() {
		if(instance == null) {
			instance = new CommunityFacade();
		}
		return instance;
	}
	
	//Private constructor
	private CommunityFacade() {
		ICommunityRepository repCommunity = new CommunityRepository();
		this.communityController = new CommunityController(repCommunity);
	}
	
	
	//Methods
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
		return listCommunity;
	}
	
	
}

=======
<<<<<<< HEAD
<<<<<<< HEAD
package facade;

import java.util.Collection;

import community.Community;
import controller.CommunityController;
import exceptions.InexistentCommunityException;
import exceptions.NotFoundCommunityException;
import exceptions.RegisteredCommunityException;
import repository.CommunityRepository;
import repository.ICommunityRepository;

public class CommunityFacade {
	//Attributes
	private CommunityController communityController;
	
	//Pattern singleton
	static private CommunityFacade instance = null;
	
	public static CommunityFacade getInstance() {
		if(instance == null) {
			instance = new CommunityFacade();
		}
		return instance;
	}
	
	//Private constructor
	private CommunityFacade() {
		ICommunityRepository repCommunity = new CommunityRepository();
		this.communityController = new CommunityController(repCommunity);
	}
	
	
	//Methods
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
		return listCommunity;
	}
	
	
}

=======
package facade;

import java.util.Collection;

import community.Community;
import controller.CommunityController;
import exceptions.InexistentCommunityException;
import exceptions.NotFoundCommunityException;
import exceptions.RegisteredCommunityException;
import repository.CommunityRepository;
import repository.ICommunityRepository;

public class CommunityFacade {
	//Attributes
	private CommunityController communityController;
	
	//Pattern singleton
	static private CommunityFacade instance = null;
	
	public static CommunityFacade getInstance() {
		if(instance == null) {
			instance = new CommunityFacade();
		}
		return instance;
	}
	
	//Private constructor
	private CommunityFacade() {
		ICommunityRepository repCommunity = new CommunityRepository();
		this.communityController = new CommunityController(repCommunity);
	}
	
	
	//Methods
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
		return listCommunity;
	}
	
	
}

>>>>>>> 1642173a97d6267bb5ad21b4d91c36f74683b638
=======
package facade;

import java.util.Collection;

import community.Community;
import controller.CommunityController;
import exceptions.InexistentCommunityException;
import exceptions.NotFoundCommunityException;
import exceptions.RegisteredCommunityException;
import repository.CommunityRepository;
import repository.ICommunityRepository;

public class CommunityFacade {
	//Attributes
	private CommunityController communityController;
	
	//Pattern singleton
	static private CommunityFacade instance = null;
	
	public static CommunityFacade getInstance() {
		if(instance == null) {
			instance = new CommunityFacade();
		}
		return instance;
	}
	
	//Private constructor
	private CommunityFacade() {
		ICommunityRepository repCommunity = new CommunityRepository();
		this.communityController = new CommunityController(repCommunity);
	}
	
	
	//Methods
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
		return listCommunity;
	}
	
	
}

>>>>>>> 1642173a97d6267bb5ad21b4d91c36f74683b638
>>>>>>> Stashed changes
