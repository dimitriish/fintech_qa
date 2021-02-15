import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SorterTest {

    @Test
    public void simpleTest() {
        int[] arr = {1, 5, 3, 4, 7};
        int[] expected = {1, 3, 4, 5, 7};
        arr = Sorter.sort(arr);
        Assertions.assertArrayEquals(expected, arr);
    }


    @Test
    public void zeroTest() {
        int[] arr = {1, 5, 0, 4, 7};
        int[] expected = {0, 1, 4, 5, 7};
        arr = Sorter.sort(arr);
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void ArrayWithOneElementTest() {
        int[] arr = {2};
        int[] expected = {2};
        arr = Sorter.sort(arr);
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void ArrayWithEvenLengthTest() {
        int[] arr = {5, 1, 22, 9};
        int[] expected = {1, 5, 9, 22};
        arr = Sorter.sort(arr);
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void ArrayWithOddLengthTest() {
        int[] arr = {5, 1, 22, 9, 7};
        int[] expected = {1, 5, 7, 9, 22};
        arr = Sorter.sort(arr);
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void ArrayWithSameElementsTest() {
        int[] arr = {4, 4, 4, 4, 4, 4};
        int[] expected = {4, 4, 4, 4, 4, 4};
        arr = Sorter.sort(arr);
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void AlreadySortedTest() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        arr = Sorter.sort(arr);
        Assertions.assertArrayEquals(expected, arr);
    }



}
