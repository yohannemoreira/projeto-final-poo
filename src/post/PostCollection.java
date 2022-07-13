package post;

import java.util.ArrayList;

public class PostCollection implements IPostCollection{
	private ArrayList<Post> postCollection;
	public void addPost(Post post) {
		postCollection.add(post);
	}
	public ArrayList<Post> getPostCollection(){
		return postCollection;
	}
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
	public void updatePost(Post post) {
		//fazer
	}
	public Post searchPost(int id) {
		Post procurado = null;
		
		return procurado;
	}
	public boolean exist(int id) {
		return true;
	}
	public int sizeArray () {
		return postCollection.size();
	}
}
