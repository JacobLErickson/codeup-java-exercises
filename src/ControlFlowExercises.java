import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//  3.
        Scanner scanner = new Scanner(System.in);

        System.out.print("What number would you like to go up to? \n");

        long x = scanner.nextInt();

        System.out.println("Here is your table!\n");
        System.out.println("number | squared | cubed ");
        System.out.println("------ | ------- | ----- ");
        for(long i = 1; i <= x; i++) {
            long i2 = i *= i;
            long i3 = i *= i *= i;
            System.out.printf("%d     | %d      | %d    \n", i, i2, i3);
        }
    }
}