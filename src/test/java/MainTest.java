import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    Main main = new Main();
    int[][] matr = {{2,7,4},{7,6,2},{9,1,8}};
    int[] array = {4,9,3,33,6,4,2,9,2};
    @Test
    public void array() {
        assertEquals(1,main.array());
    }

    @Test
    public void matrix() {
        assertEquals(1,main.matrix(matr));
    }

    @Test
    public void defaultSort() {
        assertEquals(1,main.defaultSort(array));
    }

    @Test
    public void bubbleSort() {
        assertEquals(1,main.bubbleSort(array));
    }

    @Test
    public void insetrionSort() {
        assertEquals(1,main.insetrionSort(array));
    }

    @Test
    public void quickSort() {
        assertEquals(1,main.quickSort(array));
    }

    @Test
    public void selectionSort() {
        assertEquals(1,main.selectionSort(array));
    }

    @Test
    public void heapSort() {
        assertEquals(1,main.heapSort(array));
    }

    @Test
    public void coocktailSort() {
        assertEquals(1,main.coocktailSort(array));
    }

}