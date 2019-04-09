public class CompareLenght {
    public static void main(String[] args) {
        // - Create an array variable named `p1`
        int[] p1 =new int[3];
        //   with the following content: `[1, 2, 3]`
        p1 [0]=1;
        p1 [1]=2;
        p1 [2]=3;
        // Create an array variable named `p2
        int[] p2 =new int[2];
        //   with the following content: `[4, 5]`
        p2 [0]=4;
        p2 [1]=5;
        // - Print if `p2` has more elements than `p1`
        if (p2 != p1)
            System.out.println("p2 has more elements than p1");
    }
}