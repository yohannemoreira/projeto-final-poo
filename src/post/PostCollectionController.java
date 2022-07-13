package post;

public class PostCollectionController {

	    private PostCollection posts;

	    public PostCollectionController() {
		super();
		this.posts = new PostCollection();
	    }

	    public PostCollection getPosts() {
		return posts;
	    }

	    public void setPosts(PostCollection posts) {
		this.posts = posts;
	    }

	    public void addAccount(Post post){
		posts.addPost(post);
	    }

	    public void removePost(int id) {
		posts.removePost(id);
	    }

	    public void editPost(Post post) {

	    }

	    public Post findAccount(int id){
		return posts.searchPost(id);
	    }

	    public Boolean exist(int id) {
		return posts.exist(id);

	    }
}
