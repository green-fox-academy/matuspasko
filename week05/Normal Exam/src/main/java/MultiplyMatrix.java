class MultiplyMatrix {


    public static void main(String[] args) {
        int m = 4, n = 4;

        int array[][] = {{1, 3, 6, 2}, {7, 5, 6, 1}, {3, 3, 1, 5}, {9, 0, 5, 3}};

//        freq(array, m, n);

        for (int counter = 0; counter < array.length ; counter++) {
            // even numbers and multiply by 2
            if ((counter % 2) == 0) {
                counter = counter * 2;
            }else {
                counter = counter * 2;
            }
            System.out.println(array);

        }
    }

}
// This code is contributed by Anant Agarwal.
