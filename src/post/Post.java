package post;

import java.util.List;
import org.w3c.dom.Comment;

public class Post {
	String legenda;
	String id;
	int numeroCurtida;
	int numeroComentario;
	String localizacao;

	private List<Comment> comments;

	public Post(String legenda) {
		this.legenda = legenda;
	}

	//metodos de acesso controlado
	//legenda
	public String getLegenda() {
		return this.legenda;
	}

	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}

	//id
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	//localizacao
	public String getLocalizacao() {
		return this.localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	//curtidas
	public int getNumeroCurtida() {
		return this.numeroCurtida;
	}

	public void getNumeroCurtida(int numeroCurtida) {
		this.numeroCurtida = numeroCurtida;
	}

	//comentario
	public int getNumeroComentario() {
		return this.numeroComentario;
	}

	public void getNumeroComentario(int numeroComentario) {
		this.numeroComentario = numeroComentario;
	}
<<<<<<< Updated upstream

=======
<<<<<<< HEAD
	
=======

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1d8e78d65643cb0561110fa64c3a214133dd0678
=======
>>>>>>> 1642173a97d6267bb5ad21b4d91c36f74683b638
=======
>>>>>>> 1642173a97d6267bb5ad21b4d91c36f74683b638
>>>>>>> Stashed changes
	
	//Comments
	public List<Comment> getComments(){
		return comments;
	}

	//Add Comment
	public void addComment(int id, String author, String text, String date){
			comments.add(new Comment(id, author, text, date) {});
	}

	//Remove Comment
	public void removeComment(int id){
		for (int i = 0; i < comments.size(); i++) {
			if (comments.get(i).getId() == id){
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
			System.out.println(" Comment " + comments.get(i).getId() + " by " + comments.get(i).getAuthor() + " on " + comments.get(i).getDate());
			System.out.println("/n" + comments.get(i).getText());
			System.out.println("/n");
		}
	}


}