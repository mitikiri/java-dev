package programming.exercises;

public class Fibonacci {
    public static void main(String[] args) {
        /* Fibonacci Series - 0 1 1 2 3 5 8 13 21 ...*/
        int a=0;
        int b=1;
        System.out.print("0 1 ");
        for(int i=0;i<10;i++){
            int temp = a+b;
            System.out.print(temp+" ");
            a = b;
            b = temp;
        }
    }
}
