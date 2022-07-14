/**
 * Classe Interface Post.
 *
 * @author Carlos Matheus
 * @version 1.0
 * <br>
 * Copyright (C) 2022 Universidade Federal do
Ceará.
 */

package post;

public interface IPostCollection {
/**
* Adiciona um Post.
* @param post Objeto do tipo post .
*/
	public void addPost(Post post);
/**
* Remove um Post.
* @param id Identificação do post .
*/
	public void removePost(int id);
/**
* Atualiza um Post.
* @param post Objeto do tipo post.
*/
	public void updatePost(Post post);
/**
* Procura um Post.
* @param id Identificação do post.
*/
	public Post searchPost(int id);
/**
* Vê se um Post existe.
* @param id Identificação de um post .
*/
	publi
	public boolean exist(int id);
}
