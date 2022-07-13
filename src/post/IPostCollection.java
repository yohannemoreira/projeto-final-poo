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
	
	public void addPost(Post post);
	public void removePost(int id);
	public void updatePost(Post post);
	public Post searchPost(int id);
	public boolean exist(int id);
}
