import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//
//  b.
        long x = 2;
        do {
            System.out.println(x);
            x *= x;
        } while (x < 1000000);
    }
}
