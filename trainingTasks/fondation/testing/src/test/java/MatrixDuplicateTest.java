import org.junit.Assert;
import org.junit.Test;

public class MatrixDuplicateTest {

    @Test
    public void duplplicateEvenNumbers_AllEven_ReturnAllEven() {

        int[][] matrix = {{2, 2, 6},
                {4, 8, 10},
                {6, 8, 2}};

        int[][] expected = {{4, 4, 12},
                {8, 16, 20},
                {12, 16, 4}};

        int[][] resaultMatrix = MatrixDuplicate.duplicateEvenNumbers(matrix);
        Assert.assertArrayEquals(expected, resaultMatrix);
    }

    @Test
    public void duplicateEvenNumbers_AllZeros_ReturnAllZeros() {
        int[][] matrixZeros = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};

        int[][] expectedZeros = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};

        int[][] resaultMatrix = MatrixDuplicate.duplicateEvenNumbers(matrixZeros);
        Assert.assertArrayEquals(expectedZeros, resaultMatrix);
    }

    @Test
    public void duplicateEvenNumbers_emptyArray_emptyErray() {
        int[][] matrixEmpty = {};
        int[][] expectedEmpty = {};

        int[][] resaultMatrix = MatrixDuplicate.duplicateEvenNumbers(matrixEmpty);
        Assert.assertArrayEquals(expectedEmpty, resaultMatrix);
    }

}
