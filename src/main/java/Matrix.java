import java.lang.String;

import java.util.Scanner;


public class Matrix {

    public static int readInteger(){
        try{
            Scanner vvid = new Scanner(System.in);
            return vvid.nextInt();}
        catch(Exception ex){
            return readInteger();
        }
    }
    public static String sequence(int[][] matriX){
        int[][] matrixB = matriX;
        int count = matriX.length;

        boolean bool = false;
        String str  = "";

        for (int p = 0; p<count; p++){
            for (int u = 0; u<count-1; u++){
                if(matrixB[p][u]<matrixB[p][u+1]){
                    bool = true;
                }else{
                    bool = false;
                    break;
                }
            }
            if(bool){
                for(int y = 0; y<count; y++){
                    str = str + 1;
                }
            }
            else {
                for(int y = 0; y<count; y++){
                    str = str + 0;
                }
            }
        }
        return str;
    }
    public static int sumElement(int[][] matrix){
        int sum = 0;

        for(int r = 0, t = matrix.length-1; r<matrix.length; r++, t--){
            sum = sum + (matrix[r][r]*matrix[r][t]);
        }
        return sum;
    }
//    public static int[][] matriX(int countM){
//        int[][] matrix = new int[countM][countM];
//
//        for(int i = 0; i<countM;i++){
//            for(int k = 0; k<countM;k++){
//                matrix[i][k] = (int)(Math.random()*100);
//            }
//        }
//        return matrix;
//    }

}
