package OperationsOnNumbers;

public class ReverseNumber {
    public static void main(String[] args) {
        int no=451312;
        int r,sum=0;

        while(no>0){
            r=no%10;
            sum=sum*10+r;
            no=no/10;
        }
        System.out.println(sum);
    }
}
