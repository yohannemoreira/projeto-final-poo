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
	//legenda
	public String getSubtitle() {
		return this.subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
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
	//curtidas
	public int getLikeNumber() {
		return this.likeNumber;
	}
	public void getLikeNumber(int likeNumber) {
		this.likeNumber = likeNumber;
	}
	//comentario
	public int getCommentNumber() {
		return this.commentNumber;
	}
	public void setCommentNumber(int commentNumber) {
		this.commentNumber = commentNumber;
	}
	
	//Comments
<<<<<<< HEAD
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
=======
		public List<Comment> getComments(){
			return comments;
>>>>>>> f6982ec7ff9aae200f3103c84a127b0bf86b6cd5
		}

		//Add Comment
		public void addComment(Comment comment){
			comments.add(comment);
	}
		//Remove Comment
		public void removeComment(int id){
			for (int i = 0; i < comments.size(); i++) {
				if ( this.getComments().get(i).getId() == id ){
					comments.remove(i);
				}
			}
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("{COMMENT DELETED}");
			System.out.println("/n");
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
