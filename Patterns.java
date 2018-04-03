package programming.exercises;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
     /*   Java Patterns 1
        *
        * *
        * * *
        * * * *
        ends*/
         System.out.println("Pattern 1 \n");
         for (int i=0;i<4;i++){
             for (int j=0;j<=i;j++){
                 System.out.print("*");
             }
             System.out.print("\n");
         }
    /* Java Patterns 2
          *
        * *
      * * *
    * * * *
           ends*/
    System.out.println("Pattern 2");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println("Enter value n");
    int k = 2*n-2;
        for (int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                System.out.print(" ");
            }
            k=k-2;
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    /*Java Pattern 3
     1
     1 2
     1 2 3
     1 2 3 4
     ends*/
        System.out.println("Java Pattern 3");
        for (int i=1;i<=4;i++){
             for(int j=1;j<=i;j++){
                 System.out.print(j+" ");
             }
             System.out.println();
        }
    /*
    Java Pattern 4
            1
          1 2
        1 2 3
      1 2 3 4
        ends*/
        System.out.println("Java Pattern 4");
        int a = 4;
        int b = a-1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=b;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            b=b-1;
            System.out.println();
        }
        /*Java Pattern 5
            1
           21
          321
         4321
             ends*/
        System.out.println("Java Pattern 5");
        int l = 4;
        int m = l-1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=m;j++){
                System.out.print(" ");
            }
            m=m-1;
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
