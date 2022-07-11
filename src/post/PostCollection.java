package post;

import java.util.ArrayList;

public class PostCollection implements IPostCollection{
	ArrayList<Post> PostCollection;
	public void addPost(Post post) {
		PostCollection.add(post);
	}
	public void removePost(int id) {
		int indice = -1;
		if(PostCollection.size()>0) {
			for(int i = 0; i < PostCollection.size();i++) {
				if(PostCollection.get(i).getId() == id) {
					indice = i;
				}
			}
			PostCollection.remove(PostCollection.get(indice));
		}
		else if(PostCollection.size()<=0) {
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
}
