import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionTest {
    Selection selectionClass = new Selection();
    @Test
    void selectionSort() {
        int[] testArray = {3,6,1,3,2};
        int[] sortedArray = {1,2,3,3,6};
        assertArrayEquals(sortedArray,selectionClass.selectionSort(testArray));
    }

}