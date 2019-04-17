//Reuse your BlogPost class
//Create a Blog class which can
//store a list of BlogPosts
//add BlogPosts to the list
//delete(int) one item at given index
//update(int, BlogPost) one item at the given index and update it with another BlogPost

import java.util.ArrayList;
import java.util.List;

public class Blog {

    List <BlogPost> blogPosts = new ArrayList<>();

    public void add(BlogPost post){
        blogPosts.add(post);
    }

    public void delete(int i){
        blogPosts.remove(i);
    }

    public void update(int i, BlogPost post){
        blogPosts.set(i, post);
    }

}
