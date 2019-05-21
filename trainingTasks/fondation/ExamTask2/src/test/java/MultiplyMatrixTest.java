import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class MultiplyMatrixTest {

    @Test
    public void test_Multiply_Matrix_fixed_numbers() {
        int[][] inputMatrix = {{1, 3, 6, 2},
                {7, 5, 6, 1},
                {3, 3, 1, 5},
                {9, 0, 5, 3}};

        int[][] expectedMatrix = {{1, 3, 12, 4},
                {14, 10, 6, 2},
                {3, 3, 1, 5},
                {18, 0, 10, 6}};

        int[][] resultMatrix = MultiplyMatrix.multiply(inputMatrix);
        Assert.assertArrayEquals(expectedMatrix[0], resultMatrix[0]);
        Assert.assertArrayEquals(expectedMatrix[1], resultMatrix[1]);
        Assert.assertArrayEquals(expectedMatrix[2], resultMatrix[2]);
        Assert.assertArrayEquals(expectedMatrix[3], resultMatrix[3]);
    }

    @Test
    public void testMultiply_matrixWithZeros_matrixWithZeros() {
        int[][] inputMatrix = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        int[][] expectedMatrix = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        int[][] resultMatrix = MultiplyMatrix.multiply(inputMatrix);
        Assert.assertArrayEquals(expectedMatrix[0], resultMatrix[0]);
        Assert.assertArrayEquals(expectedMatrix[1], resultMatrix[1]);
        Assert.assertArrayEquals(expectedMatrix[2], resultMatrix[2]);
        Assert.assertArrayEquals(expectedMatrix[3], resultMatrix[3]);


//        boolean areMatrixesEqual = Arrays.deepEquals(expectedMatrix, resultMatrix); // metoda na porovnanie ale lepsie je pouzit jednoduchsiu ako je nad tymto
//        Assert.assertEquals(areMatrixesEqual, true);

    }
}
