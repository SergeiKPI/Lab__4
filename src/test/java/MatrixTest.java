import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MatrixTest {
    Matrix matrix = new Matrix();
    int[][] mat= {{1,5},{4,7}};



    @Test
    void sequence() {
        String str = matrix.sequence(mat);
        String result = "1111";
        assertEquals(result,str);
    }

    @Test
    void sumElement() {
        int count = matrix.sumElement(mat);
        assertEquals(33, count);
    }
}