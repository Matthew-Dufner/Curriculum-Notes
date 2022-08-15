import java.util.Scanner;

public class CheckRange {
    public static int favorite(int l, int r, int n, int array[]){
        //we need a count for all the numbers we find that are in the array, this is our solution
        //we need to loop through the array checking each element to find if it is within the range
        //if it is within range, add 1 to our count

        int count = 0;

        if(l > r) {
            int temp = l;
            l = r;
            r = temp;
        }


        for(int i = 0; i < array.length; i++) {
            if(array[i] >= l && array[i] <= r) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        // INPUT [uncomment & modify if required]
        Scanner sc = new Scanner(System.in);
        int l = 20;
        int r = 60;

        int[] array = new int[]{1,99,100,2,3,4,5,6,7,8,9,11,5,5,12,13,13,13,14,14,15,16,5,30,30,40,55,66};


        // OUTPUT [uncomment & modify if required]
        System.out.print(favorite(l,r, array.length, array));
        sc.close();

    }

}
