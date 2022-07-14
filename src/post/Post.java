/**
 * Classe Post.
 *
 * @author Bruna e Carlos Matheus
 * @version 2.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */
package post;

import java.util.List;

public class Post {
// atributos
	private String subtitle;
	private int id;
	private int likeNumber;
	private int commentNumber;
	private String localization;
	private List<Comment> comments;
/**
* Cria um Post.
* @param subtitle Legenda do Post.
*/
	public Post(String subtitle) {
		this.subtitle = subtitle;
		this.id = this.hashCode();
	}

/**
* Recupera a legenda do post.
* @return A legenda do post.
*/
	public String getSubtitle() {
		return this.subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	    /**
* Recupera a identificação do post.
* @return A identificação do post.
*/
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
/**
* Recupera a localização do post.
* @return A localização do post.
*/
	public String getlocalization() {
		return this.localization;
	}
	public void setLocalization(String localization) {
		this.localization = localization;
	}
/**
* Recupera o número de curtidas do post.
* @return O número de curtidas do post.
*/
	//curtidas
	public int getLikeNumber() {
		return this.likeNumber;
	}
	public void setLikeNumber(int likeNumber) {
		this.likeNumber = likeNumber;
	}
/**
* Recupera o número de comentários do post.
* @return O número do comentário do post.
*/
	//comentario
	public int getCommentNumber() {
		return this.commentNumber;
	}
	public void setCommentNumber(int commentNumber) {
		this.commentNumber = commentNumber;
	}
/**
* Recupera a lista de comentário.
* @return a lista de comentário.
*/
	//Comments
	public List<Comment> getComments(){
		return comments;
	}
/**
* Adiciona um comentário.
* @param id Identificação do comentário.
* @param author Autor do comentário.
* @param text Texto do comentário.
* @param date Data do comentário.
*/
	public void addComment(int id, String author, String text, String date){
			comments.add(new Comment(id, author, text, date));
	}

/**
* Remove um comentário.
* @param id Identificação do comentário.
*/	
	public void removeComment(int id){
		for (int i = 0; i < comments.size(); i++) {
			if (comments.get(i).getId() == id){
				comments.remove(i);
			}
		}
		}

/**
* Mostra comentários.
*/
		public void showComments(){
			for (int i = 0; i < comments.size(); i++) {
				System.out.println(" Comment " + this.getComments().get(i).getId() + " by " + comments.get(i).getAuthor() + " on " + comments.get(i).getDate());
				System.out.println("/n" + comments.get(i).getText());
				System.out.println("/n");
			}
		}
}
