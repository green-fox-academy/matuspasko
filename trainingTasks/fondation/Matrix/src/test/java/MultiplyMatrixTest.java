import org.junit.Assert;
import org.junit.Test;

public class MultiplyMatrixTest {

    @Test
    public void multiplyMatrix_test_is_the_same_input_and_output() {
        int[][] input = {{1, 3, 6, 2},
                {7, 5, 6, 1},
                {3, 3, 1, 5},
                {9, 0, 5, 3}};

        int[][] output = {{1, 3, 12, 4},
                {14, 10, 6, 2},
                {3, 3, 1, 5},
                {18, 0, 10, 6}};

        int[][] resaulttMatrix = MultiplyMatrix.multiplyMatrix(input);
        Assert.assertArrayEquals(output[0], resaulttMatrix[0]);
        Assert.assertArrayEquals(output[1], resaulttMatrix[1]);
        Assert.assertArrayEquals(output[2], resaulttMatrix[2]);
        Assert.assertArrayEquals(output[3], resaulttMatrix[3]);
    }
}

