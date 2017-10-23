import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class CoocktailTest {
    Coocktail coocktailClass = new Coocktail();
    @Test
    void cocktailSort() {
        int[] testArray = {3,6,1,3,2};
        int[] sortedArray = {1,2,3,3,6};

        coocktailClass.cocktailSort(testArray);
        Assert.assertArrayEquals(sortedArray, testArray);
    }

}