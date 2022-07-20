class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        //arrays length N, first element index 0, last element at index n-1



        for(int i = 0; i < (s.length() / 2); i++) {
            if(s.charAt(i) != s.charAt(s.length() - (i + 1))) {
                return false;
            }
        }

        //We could also write this as the equivalent while loop:
        //        int j = 0;
        //        while(j < s.length() / 2) {
        //            if(s.charAt(j) != s.charAt(s.length() - (j + 1))) {
        //                return false;
        //            }
        //            j++;
        //        }


        return true;
    }
}