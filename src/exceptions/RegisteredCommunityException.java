package exceptions;

public class RegisteredCommunityException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage(){
		return ("Comunidade já adicionada.");
	}
}
