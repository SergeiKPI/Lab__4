import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionTest {
    Insertion insert = new Insertion();
    @Test
    void insertionSort() {
        int[] testArray = {3,6,1,3,2};
        int[] sortedArray = {1,2,3,3,6};
        assertArrayEquals(sortedArray, insert.insertionSort(testArray));
    }

}