package OperationsOnNumbers;

public class PalindromeNumbers {
    public static void main(String[] args) {
            int no=121;
            int r,sum=0,temp=no;

            while(no>0) {
                r=no%10;
                sum=(sum*10)+r;
                no=no/10;
            }
        if(temp==sum){
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
