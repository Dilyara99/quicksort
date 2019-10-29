package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int []{89, 3, 0, 98, 22, 81, 90, 1};
        array = sortArray(array);
        printArray(array);
    }
    public  static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public  static int[] sortArray(int[] array){
        for(int i = 0; i < array.length; i ++){
            int min = array[i];
            int min1 = i;

            for(int j = i + 1; j < array.length; j++){
                if( array[j] < min ){
                    min = array[j];
                    min1 = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[min1] = temp;

        }


        return array;
    }

}
