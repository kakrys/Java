import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //problem1("abbbcnffff");
        int[] arr1 = new int[] {45,221,341,4241};
        int[] arr2 = new int[] {-10,-9,-7,1,22,41,42,43};
        //problem2(arr1,arr2);
        //problem3(arr2);
        int[][] arr = new int[][] {{1,2,3,4},
                                   {5,6,7,8},
                                   {9,10,11,12},
        } ;
        //problem4(arr);
        //problem5(arr2,63);
        //problem6(arr);
        //problem7(arr);
        //problem8(arr);
    }
    public static void problem1(String str){  // Реализация п.1 лабораторной работы;
        int StrLength = 0;
        StrLength = str.length();
        String Symbols = "";
        char[] CurSymbols = new char[StrLength];
        int i= 0;
        int j=0;
        int result=0;
        for (int k = 0; k < StrLength; k++) CurSymbols[k] = str.charAt(k);

        while (j < StrLength && i < StrLength) {
            if (Symbols.indexOf(CurSymbols[j]) == -1){
                Symbols+=CurSymbols[j];
                j++;
                result = Math.max(result,j-i);
            }
            else {
                Symbols=Symbols.replace(CurSymbols[i],' ');
                i++;
            }
        }
        System.out.println(result);
    }
    public static void problem2(int[] arr1,int[] arr2) { // Реализация п.2 лабораторной работы
       int size1 = arr1.length;
       int size2 = arr2.length;
       int[] arr3 = new int[size1+size2];
       for (int i = 0;i<size1;i++) arr3[i] = arr1[i];
       int k=0;
       for (int j=size1;j<size1+size2;j++) {
           arr3[j] = arr2[k];
           k++;
       }
        Arrays.sort(arr3);
        for (int i=0;i<size1+size2;i++) System.out.println(arr3[i]);

    }
    public static void problem3(int[] arr) { // Реализация п.3 лабораторной работы (Алгоритм Кадане)
        int result=0;
        int CurrMax=0;
        int MaxNumber;
        for (int i=0;i<arr.length;i++){
            CurrMax = CurrMax + arr[i];
            CurrMax = Math.max(CurrMax,0);
            result = Math.max(result,CurrMax);
        }
        MaxNumber = Arrays.stream(arr).max().getAsInt();
        if (MaxNumber<0) result = MaxNumber;
        System.out.println(result);
    }
    public static void problem4(int[][] arr) { // Реализация п.4 лабораторной работы
        int[][] RotatedArr = new int[arr[0].length][arr.length];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                RotatedArr[j][arr.length - i - 1] = arr[i][j];
            }
        }
        for (int i=0;i<RotatedArr.length;i++){
            for (int j=0;j<RotatedArr[i].length;j++){
                System.out.print(RotatedArr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void problem5(int[] arr,int target) { // Реализация п.5 лабораторной работы
        int index1 =-1 ;
        int index2 = 0;
        for (int i=0;i<arr.length;i++){
            for (int j =0;j<arr.length;j++){
                if (arr[i]+arr[j] == target) {index1=i;index2=j;}
            }
        }
        if (index1>-1) System.out.println(arr[index1] + " " + arr[index2]);
        else System.out.println("Null");
    }
    public static void problem6(int[][] arr){ // Реализация п.6 лабораторной работы
        int sum=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++) {
               sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
    public static void problem7(int[][] arr) { // Реализация п.7 лабораторной работы
        int[] max = new int[arr[1].length];
        for (int k=0;k<max.length;k++) max[k] = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++) {
                if (arr[i][j] > max[i]) max[i] = arr[i][j];
            }
            System.out.println(max[i]);
        }
    }
    public static void problem8(int[][] arr) { // Реализация п.8 лабораторной работы
        int[][] RotatedArr = new int[arr[0].length][arr.length];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                RotatedArr[j][i] = arr[i][arr[0].length - j - 1];
            }
        }
        for (int i=0;i<RotatedArr.length;i++){
            for (int j=0;j<RotatedArr[i].length;j++){
                System.out.print(RotatedArr[i][j]+ " ");
            }
            System.out.println();
        }
    }

}