import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10000];
        for (int i = 0; i<array.length; i++){
            array[i] = (int)(Math.random()*100000);
        }


        for(int i = 0; i<3; i++) {
            int[] arrSort = new int[array.length];
            for (int s = 0; s<arrSort.length; s++){
                arrSort[s] = array[s];
            }

            int before = (int) System.currentTimeMillis();
            Arrays.sort(arrSort);
            int after = (int) System.currentTimeMillis();
            System.out.println("Час виконання arrSort = " + (after - before) + " мс.\n");
        }


        int min = 0;
        int max = array.length-1;

        Bubble bubbleClass = new Bubble();
        for(int i = 0; i<3; i++) {
            int beforeBuuble = (int) System.currentTimeMillis();
            bubbleClass.bubbleSort(array);
            int afterBuuble = (int) System.currentTimeMillis();
            System.out.println("Час виконання bubbleSort = " + (afterBuuble - beforeBuuble) + " мс.\n");
        }

        Insertion insertionClass = new Insertion();
        for(int i = 0; i<3; i++) {
            int beforeInsertion = (int) System.currentTimeMillis();
            insertionClass.insertionSort(array);
            int afterInsertion = (int) System.currentTimeMillis();
            System.out.println("Час виконання insertionSort = " + (afterInsertion - beforeInsertion) + " мс.\n");
        }


        Quick quickClass = new Quick();
        for(int i = 0; i<3; i++) {
            int beforeQuick = (int) System.currentTimeMillis();
            quickClass.quickSort(quickClass.additionQuick(array),min,max);
            int afterQuick = (int) System.currentTimeMillis();
            System.out.println("Час виконання quickSort = " + (afterQuick - beforeQuick) + " мс.\n");
        }


        Selection selectionClass = new Selection();
        for(int i = 0; i<3; i++) {
            int beforeSelection = (int) System.currentTimeMillis();
            selectionClass.selectionSort(array);
            int afterSelection = (int) System.currentTimeMillis();
            System.out.println("Час виконання selectionSort = " + (afterSelection - beforeSelection) + " мс.\n");
        }


        Heap heapClass = new Heap();
        for(int i = 0; i<3; i++) {
            int beforeHeap = (int) System.currentTimeMillis();
            heapClass.heapSort(array);
            int afterHeap = (int) System.currentTimeMillis();
            System.out.println("Час виконання heapSort = " + (afterHeap - beforeHeap) + " мс.\n");
        }
        Coocktail coocktailClass = new Coocktail();
        for(int i = 0; i<3; i++) {
            int[] arrcocktailSort = new int[array.length];
            for (int s = 0; s<arrcocktailSort.length; s++){
                arrcocktailSort[s] = array[s];
            }

            int before = (int) System.currentTimeMillis();
            coocktailClass.cocktailSort(arrcocktailSort);
            int after = (int) System.currentTimeMillis();
            System.out.println("Час виконання cocktailSort = " + (after - before) + " мс.\n");
        }

        //------------------------------------------------------------------------
        //------------------------------------------------------------------------
        //------------------------------------------------------------------------

        //Class Array
        Array arr = new Array();
        int[] numbersArray = arr.array();

        arr.mean(numbersArray);

        arr.difference(numbersArray);

        arr.countPos(numbersArray);

        arr.sumNeg(numbersArray);

        arr.sumMult(numbersArray);

        arr.prod(numbersArray);

        //------------------------------------------------------------------------
        //------------------------------------------------------------------------
        //------------------------------------------------------------------------

        //Class Matrix
        Matrix matrix = new Matrix();


        int[][] matr = {{2,7,4},{7,6,2},{9,1,8}};

        System.out.println(matrix.sumElement(matr));


        System.out.println(matrix.sequence(matr));

    }
}

