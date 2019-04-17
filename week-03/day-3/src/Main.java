import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //create postIts
        PostIt postIt1 = new PostIt("orange", "Idea 1", "blue");
        PostIt postIt2 = new PostIt("pink", "Awesome!", "black");
        PostIt postIt3 = new PostIt("yellow", "Superb!", "green");

        //create BlogPosts
        BlogPost first = new BlogPost();
        first.authorName = "John Doe";
        first.title = "Lorem Ipsum";
        first.text = "Lorem ipsum dolor sit amet.";
        first.publicationDate = "2000.05.04.";

        BlogPost second = new BlogPost();
        second.authorName = "Tim Urban";
        second.title = "Wait but why";
        second.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        second.publicationDate = "2010.10.10.";

        BlogPost third = new BlogPost();
        third.authorName = "William Turton";
        third.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        third.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.\n" +
                "When I asked to take his picture outside one of IBM’s New York City offices,\n" +
                "he told me that he wasn’t really into the whole organizer profile thing.";
        third.publicationDate = "2017.03.28.";

        Animal tortoise = new Animal();


        Blog myBlog = new Blog();
        myBlog.add(first);
        myBlog.add(second);

        myBlog.delete(1);
        myBlog.update(0, third);

        System.out.println(myBlog.blogPosts.size());


    }
}
