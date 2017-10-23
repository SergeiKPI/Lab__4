import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickTest {
    Quick quickClass = new Quick();
    @Test
    void quickSort() {
        int[] testArray = {3,6,1,3,2};
        int[] sortedArray = {1,2,3,3,6};
        int min = 0;
        int max = testArray.length-1;

        assertArrayEquals(sortedArray,quickClass.quickSort(quickClass.additionQuick(testArray),min,max));
    }
}