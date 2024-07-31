package OperationsOnNumbers;

import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a number : ");
        int no=sc.nextInt();
        int remainder,sum=0;
        int singleDigit=0;

        while (no>0){
            remainder=no%10;
            sum=sum+remainder;
            no=no/10;
        }
        System.out.println(sum);
        if(sum>9) {
            while (sum > 0) {
                int r = sum % 10;
                singleDigit = singleDigit + r;
                sum = sum / 10;
            }
        }
        System.out.println(singleDigit);
    }
}
