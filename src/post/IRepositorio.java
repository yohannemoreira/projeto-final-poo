package post;

public interface IRepositorio {
	
	public void addPost(Post post);
	public void removePost(int indice);
	public void updatePost(Post post);
	public Post searchPost(String id);
	public boolean exist(String id);
}