package OperationsOnNumbers;

public class BiggestSmallestDigit {
    public static void main(String[] args) {
        int no=153;
        int r, templargest =0,tempSmallest=9;

        while(no>0) {
            r = no % 10;
            if (r > templargest) {
                templargest = r;
            }
            if (r < tempSmallest) {
                tempSmallest = r;
            }
            no = no / 10;
        }
        System.out.println("The largest Digit is : " + templargest);
        System.out.println("The Smallest Digit is : " + tempSmallest);
    }
}
