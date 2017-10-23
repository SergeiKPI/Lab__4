import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ArrayTest {
    Array array = new Array();
    int[] arr = {2,1,5,7};
    @Test
    void mean() {
        assertEquals(2,array.mean(arr));
    }

    @Test
    void difference() {
        assertEquals(15,array.difference(arr));
    }

    @Test
    void countPos() {
        assertEquals(4,array.countPos(arr));
    }

    @Test
    void sumNeg() {
        assertEquals(0,array.sumNeg(arr));
    }

    @Test
    void sumMult() {
        assertEquals(7,array.sumMult(arr));
    }

    @Test
    void prod() {
        assertEquals(5,array.prod(arr));
    }

}