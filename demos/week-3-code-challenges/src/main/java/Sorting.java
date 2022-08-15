import java.util.*;

public class Sorting {
    public static int rearrangeTheDigits(int n){
        int result = -404;

        //convert to string - so that we can re-arrange the digits
            //String.valueOf();
        //once a string, we can simply sort in desc order it with an existing method. But im going to sort manually.
            //use a loop to iterate through the entire string, each pair of elements gets swapped if needed to be in correct order
                //if a < b then swap:
                //int temp = a
                //int a = b
                //int b = temp
            //repeat this process until no swaps are needed
                //at the beginning of every iteration through the loop, set some boolean value to false.
                //at any time during the loop, if a swap occurs, set bool to true
                //at the end of the loop, if the bool is true, we need to keep going
                //if the bool is still false, then we know there were no swaps during this iteration
        //once we have it sorted we are done solving the problem
        //we just need to convert back into an int in order to return our result.
            //Integer.parseInt(str)

        char[] numBuffer = String.valueOf(n).toCharArray();

        boolean swapFound;
        do {
            swapFound = false;
            for (int i = 0; i < numBuffer.length - 1; i++) {
                //iterating through the string
                if(numBuffer[i] < numBuffer[i+1]) {
                    swapFound = true;
                    char temp = numBuffer[i];
                    numBuffer[i] = numBuffer[i+1];
                    numBuffer[i+1] = temp;
                }
            }
        }while(swapFound);

        return Integer.parseInt(String.valueOf(numBuffer));


    }


    public static void main(String[] args) {
        // INPUT [uncomment & modify if required]
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // OUTPUT [uncomment & modify if required]
        System.out.print(rearrangeTheDigits(n));
        sc.close();

    }
}
