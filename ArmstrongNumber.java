package OperationsOnNumbers;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter a number to check if it is armstrong number : ");
        int no= sc.nextInt();
        int temp=no;
        int r,sum=0;

        while(no>0){
            r=no%10;
            sum=sum+(r*r*r);
            no=no/10;
        }
        System.out.println("The sum of cubes is : "+sum);
        if(sum==temp){
            System.out.println("The Number " +temp+ " is a armstrong number");
        } else{
            System.out.println("It is not a armstrong number");
        }

    }
}
