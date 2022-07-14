/**
 * Classe Post Collection.
 *
 * @author Carlos Matheus
 * @version 3.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */

package post;

import java.util.ArrayList;

public class PostCollection implements IPostCollection{
	
	
	private ArrayList<Post> postCollection = new ArrayList();
	

	public void addPost(Post post) {
		postCollection.add(post);
	}
/**
* Recupera uma coleção de post.
* @return A coleção de post.
*/
	public ArrayList<Post> getPostCollection(){
		return postCollection;
	}
/**
* Remove um Post.
* @param id Identificação do post .
*/	
	public void removePost(int id) {
		int indice = -1;
		if(postCollection.size()>0) {
			for(int i = 0; i < postCollection.size();i++) {
				if(postCollection.get(i).getId() == id) {
					indice = i;
				}
			}
			postCollection.remove(postCollection.get(indice));
		}
		else if(postCollection.size()<=0) {
			System.out.println("Sem posts");
		}
	}
/**
* Atualiza um Post.
* @param post Objeto do tipo post .
*/
	public void updatePost(Post post) {
		//fazer
	}
/**
* Procura um Post.
* @param id Identificação do post.
*/
	public Post searchPost(int id) {
		Post procurado = null;
		
		return procurado;
	}
/**
 * Vê se um Post existe.
* @param id Identificação de um post.
* @return Se é verdadeiro.
*/
	public boolean exist(int id) {
		return true;
	}
/**
* Vê o tamanho da coleção.
* @return O tamanho da coleção.
*/
	public int sizeArray () {
		return postCollection.size();
	}
}
