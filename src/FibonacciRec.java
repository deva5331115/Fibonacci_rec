import java.util.Scanner;

public class FibonacciRec {
    static int fibonacci(int num){
        if(num==0){
            return 0;
        }
        if (num==1){
            return 1;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int number= scan.nextInt();
        System.out.println(fibonacci(number));
    }
}
