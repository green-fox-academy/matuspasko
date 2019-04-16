package PostIt;

public class main {

    public static void main(String[] args) {

        PostIt firstPost = new PostIt("orange", "Idea 1", "blue");
        PostIt secondPost = new PostIt("pink", "Awesome", "black");
        PostIt thirdPost = new PostIt("yellow", "Superb!", "green");

        firstPost.print();
    }
}