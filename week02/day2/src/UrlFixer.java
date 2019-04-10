public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";
        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        url = url.replace("odds","bots");
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
       // url = url.replace("https", "https:");
        // Try to solve it more than once using different String functions!
      String[] split = url.split("/");
      split[0] = "https:";
      int sizeOfSplitArray = split.length;
      split[sizeOfSplitArray - 1] = "nevertellmetheodds";
      String fixed = String.join("/", split);
          System.out.println(fixed);

    }
}
