package OperationsOnNumbers;
import java.util.Scanner;


public class DigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a number : ");
        int no=sc.nextInt();
        int remainder,sum=0;

        while (no>0){
            remainder=no%10;
            sum=sum+remainder;
            no=no/10;
        }
        System.out.println(sum);
    }
}
