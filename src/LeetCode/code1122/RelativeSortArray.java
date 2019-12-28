package LeetCode.code1122;

import java.util.ArrayList;




public class RelativeSortArray {
    public static void main(String[] args) {

        /* Code  number 1122 :Realative Sort Array  */


        int arr1[]  = {2,3,1,3,2,4,6,7,9,2,19};
        int arr2[]  = {2,1,4,3,9,6};

        for(Integer a: relativeSortArray(arr1,arr2)){

            System.out.println(a);
        }

    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {


        int []ar = sort(arr1);





        int count =0;

        int arr3[] = new int[ar.length];


        int c = 0;
        boolean state = false;
        int roundNext = 0;

        for (int j = 0;j<arr2.length;j++){



            for(int i = roundNext ;i<ar.length;i++){

                if(arr2[j]==ar[i]){

                    arr3[c] = ar[i];
                    ar[i] = -1;
                    c++;
                }

                else if(arr2[j]!=ar[i] && state==false){

                    state = true;
                    roundNext = i;

                }


            }


            state = false;
        }
        if(c!=arr1.length){
            for (Integer n : arr1){

                if (n!=-1){
                    arr3[c] = n;
                    c++;
                }

            }
        }


        return arr3;

    }

    public static int[] sort(int array[]){
        int lenArray = array.length;
        int temp;
        for(int i=1;i<lenArray;i++){

            for(int j =i;j>0;j--){

                //this condition can set to ascending and not with sort
                if (array[j]<array[j-1]){

                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }

        }


        return array;


    }







}
