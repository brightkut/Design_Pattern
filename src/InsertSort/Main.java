package InsertSort;

public class Main {

    public static void main(String[] args) {

        int []numberArray = {5,2,3,7,1};

        printArray(sort(numberArray));

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
    public static int[] sort2(int array2[]){

        int lenArray2 = array2.length;
        int tmp;
        for(int i=1;i<lenArray2;i++){

            int keys = array2[i];

            int j=i-1;
            while (j>=0 && keys<array2[j]){
                array2[j+1] = array2[j];
                j-=1;

            }

            array2[j+1] = keys;





        }
        return null;

    }


    public static void printArray(int array[]){

        for(Integer i : array){

            System.out.print(i+" ");
        }

    }
}
