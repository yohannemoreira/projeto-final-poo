package exceptions;

public class NotFoundCommunityException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage(){
		return ("Comunidade nao encontrada.");
	}
}
