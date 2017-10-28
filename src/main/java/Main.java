import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[10000];
        for (int i = 0; i<array.length; i++){
            array[i] = (int)(Math.random()*100000);
        }

        //Class Array
        defaultSort(array);

        //Class Bubble
        bubbleSort(array);

        //Class Insertion
        insetrionSort(array);

        //Class Quick
        quickSort(array);

        //Class Selection
        selectionSort(array);

        //Class Heap
        heapSort(array);

        //Class Coocktail
        coocktailSort(array);

        //Class Array
        array();

        //Class Matrix
        int[][] matr = {{2,7,4},{7,6,2},{9,1,8}};
        matrix(matr);

    }
    public  static int array(){
        try{
            Array arr = new Array();
            int[] numbersArray = {4,2,7,34,2,-1,4,-10,4,-11,34,2,100};

            arr.mean(numbersArray);

            arr.difference(numbersArray);

            arr.countPos(numbersArray);

            arr.sumNeg(numbersArray);

            arr.sumMult(numbersArray);

            arr.prod(numbersArray);

            return 1;
        }catch (Exception e){return 0;}
    }
    public static int matrix(int[][] matriX){
        try {
            Matrix matrix = new Matrix();


            int[][] matr = matriX;

            System.out.println(matrix.sumElement(matr));


            System.out.println(matrix.sequence(matr));
            return 1;
        }
        catch (Exception e){
            return 0;
        }


    }
    public static int defaultSort(int[] arr){
        try{
            int[] array = arr;
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
            return 1;
        }catch (Exception e){return 0;}
    }
    public static int bubbleSort(int[] arr){
        try{
            int[] array = arr;
            Bubble bubbleClass = new Bubble();
            for(int i = 0; i<3; i++) {
                int beforeBuuble = (int) System.currentTimeMillis();
                bubbleClass.bubbleSort(array);
                int afterBuuble = (int) System.currentTimeMillis();
                System.out.println("Час виконання bubbleSort = " + (afterBuuble - beforeBuuble) + " мс.\n");
            }
            return 1;
        }catch (Exception e){return 0;}
    }
    public static int insetrionSort(int[] arr){
        try{
            int[] array = arr;
            Insertion insertionClass = new Insertion();
            for(int i = 0; i<3; i++) {
                int beforeInsertion = (int) System.currentTimeMillis();
                insertionClass.insertionSort(array);
                int afterInsertion = (int) System.currentTimeMillis();
                System.out.println("Час виконання insertionSort = " + (afterInsertion - beforeInsertion) + " мс.\n");
            }
            return 1;
        }catch (Exception e){return 0;}
    }
    public static int quickSort(int[] arr){
        try{
            int[] array = arr;
            int min = 0;
            int max = array.length-1;
            Quick quickClass = new Quick();
            for(int i = 0; i<3; i++) {
                int beforeQuick = (int) System.currentTimeMillis();
                quickClass.quickSort(quickClass.additionQuick(array),min,max);
                int afterQuick = (int) System.currentTimeMillis();
                System.out.println("Час виконання quickSort = " + (afterQuick - beforeQuick) + " мс.\n");
            }
            return 1;
        }catch (Exception e){return 0;}
    }
    public static int selectionSort(int[] arr){
        try{
            int[] array = arr;
            Selection selectionClass = new Selection();
            for(int i = 0; i<3; i++) {
                int beforeSelection = (int) System.currentTimeMillis();
                selectionClass.selectionSort(array);
                int afterSelection = (int) System.currentTimeMillis();
                System.out.println("Час виконання selectionSort = " + (afterSelection - beforeSelection) + " мс.\n");
            }
            return 1;
        }catch (Exception e){return 0;}
    }
    public static int heapSort(int[] arr){
        try{
            int[] array = arr;
            Heap heapClass = new Heap();
            for(int i = 0; i<3; i++) {
                int beforeHeap = (int) System.currentTimeMillis();
                heapClass.heapSort(array);
                int afterHeap = (int) System.currentTimeMillis();
                System.out.println("Час виконання heapSort = " + (afterHeap - beforeHeap) + " мс.\n");
            }
            return 1;
        }catch (Exception e){return 0;}
    }
    public static int coocktailSort(int[] arr){
        try{
            int[] array = arr;
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
            return 1;
        }catch (Exception e){return 0;}
    }

}

