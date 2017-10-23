import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class BubbleTest {
    Bubble bubble = new Bubble();
    @Test
    void bubbleSort() {
        int[] testArray = {3,6,1,3,2};
        int[] sortedArray = {1,2,3,3,6};
        assertArrayEquals(sortedArray, bubble.bubbleSort(testArray));
    }
}