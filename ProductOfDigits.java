package OperationsOnNumbers;

public class ProductOfDigits {
    public static void main(String[] args) {
        int no=1528;
        int product=1,r;

        while(no!=0){
            r=no%10;
            product=product*r;
            no=no/10;
        }
        System.out.println("The product of digits is : "+product);
    }
}
