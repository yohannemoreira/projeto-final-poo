/**
* Classe Post Collection.
* @author Carlor Matheus
* @version 2.0
* <br>
* Copyright (C) 2022 Universidade Federal do
Ceará.
 */
package post;

public class PostCollectionController {
	   //Atributos
	    private PostCollection posts;
/**
*Faz controlador da coleção de post.
*/
	    public PostCollectionController() {
		super();
		this.posts = new PostCollection();
	    }
/**
* Recupera os posts da conta.
* @return Os posts da conta.
*/
	    public PostCollection getPosts() {
		return posts;
	    }

	    public void setPosts(PostCollection posts) {
		this.posts = posts;
	    }
/**
* Adiciona um post à uma conta.
* @param post Objeto do tipo post .
*/
	    public void addAccount(Post post){
		posts.addPost(post);
	    }
/**
* Remove um Post.
* @param id Identificação do post .
*/
	    public void removePost(int id) {
		posts.removePost(id);
	    }
/**
* Edita um Post.
* @param post Objeto do tipo post.
 */
	    public void editPost(Post post) {

	    }
/**
* Encontra um post da conta.
* @param id Identificação do post .
*/
	    public Post findAccount(int id){
		return posts.searchPost(id);
	    }
/**
* Vê se um Post existe.
* @param id Identificação de um post.
* @return Se um post existe.
*/
	    public Boolean exist(int id) {
		return posts.exist(id);

	    }
}
