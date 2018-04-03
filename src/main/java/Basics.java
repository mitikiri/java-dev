package programming.exercises;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        int i,j;
        System.out.println("Hello");
        System.out.println(5 + 15 / 3 * 2 - 8 % 3 );
        //Inputting from keyboard
        Scanner in = new Scanner(System.in);
        System.out.println("Enter inputs for i \n");
        i = in.nextInt();
        System.out.println("Enter inputs for j \n");
        j = in.nextInt();
        //Product of 2 numbers
        System.out.println("The results is " +i*j);
        //Remainder of 2 numbers
        System.out.println("The results is " +i%j);
    }
}
