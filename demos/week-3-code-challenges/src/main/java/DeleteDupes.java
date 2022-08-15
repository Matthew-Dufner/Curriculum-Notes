import java.util.Scanner;

public class DeleteDupes {
    public static void deleteDuplicate(int n, int array[]) {

        //bubble sort
        boolean complete;
        do {
            complete = true;
            for(int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]) {
                    complete = false;
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        } while (!complete);


        //bubble sort complete
        int[] newArray = new int[array.length];
        int cursor = 0;
        newArray[0] = array[0];
        for(int i = 1; i <  array.length; i++) {
            if(array[i] != newArray[cursor]) {
                cursor++;
                newArray[cursor] = array[i];
            }
        }

        System.out.println(++cursor);
        for(int i = 0; i < cursor; i++) {
            System.out.print(newArray[i]);
            if(i < cursor-1) {
                System.out.print(" ");
            }
        }


    }


    public static void main(String[] args) {
        // INPUT [uncomment & modify if required]
        int[] array = new int[]{2,5,5,7};
        int n = array.length;


        // OUTPUT [uncomment & modify if required]
        deleteDuplicate(n,array);
    }
}
