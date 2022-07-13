package post;

import java.util.List;

public class Post {
	private String subtitle;
	private int id;
	private int likeNumber;
	private int commentNumber;
	private String localization;
	private List<Comment> comments;

	public Post(String subtitle) {
		this.subtitle = subtitle;
		this.id = this.hashCode();
	}
	
	//metodos de acesso controlado
	   
	/**
* Recupera a legenda do post.
* @return A legenda do post.
*/
	//legenda
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
	//id
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//localizacao
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
* @return O número de comentário do post.
*/
	//comentario
	public int getCommentNumber() {
		return this.commentNumber;
	}
	public void setCommentNumber(int commentNumber) {
		this.commentNumber = commentNumber;
	}
	    /**
* Recupera uma lista de comentário.
* @return Uma lista de comentário.
*/
	//Comments
	public List<Comment> getComments(){
		return comments;
	}

	//Add Comment
	public void addComment(int id, String author, String text, String date){
			comments.add(new Comment(id, author, text, date));
	}

	//Remove Comment
	public void removeComment(int id){
		for (int i = 0; i < comments.size(); i++) {
			if (comments.get(i).getId() == id){
				comments.remove(i);
			}
		}
		}

		//Show Comments
		public void showComments(){
			for (int i = 0; i < comments.size(); i++) {
				System.out.println(" Comment " + this.getComments().get(i).getId() + " by " + comments.get(i).getAuthor() + " on " + comments.get(i).getDate());
				System.out.println("/n" + comments.get(i).getText());
				System.out.println("/n");
			}
		}
}
