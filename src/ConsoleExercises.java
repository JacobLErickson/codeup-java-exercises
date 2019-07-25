import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//      Java I Console IO Exercise
//        1.
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.\n%n", pi);

//      Explore the Scanner Class
//        1.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        System.out.println("You entered: --> \"" + userInput + "\" <--\n");

//        If the userInput is not an integer, it will cause an error.

//        2.
        System.out.print("Enter three words: ");
        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();

        System.out.println("You entered: --> \"" + userInput1 + "\" <--");
        System.out.println("You entered: --> \"" + userInput2 + "\" <--");
        System.out.println("You entered: --> \"" + userInput3 + "\" <--\n");

//          If the user enters less than 3 words, it just waits until 3 words have been entered. If the user enters more than 3 words, it only prints the first 3.

//        3.
        System.out.print("Enter a sentence: ");
        String userInput4 = scanner.next();

        System.out.printf("You entered: %s\n", userInput4);
//        It only prints the first word.

//        4.
        String userInput5 = scanner.nextLine();

        System.out.printf("You entered: %s\n", userInput5);

//      Calculate the perimeter and area of Codeup's classrooms.
//        1.
        System.out.print("Enter the classroom length(in): ");
        int CodeupL = scanner.nextInt();
        System.out.print("Enter the classroom width(in): ");
        int CodeupW = scanner.nextInt();
        int CodeupArea = CodeupL *CodeupW;
        int CodeupPerimeter = (2 * CodeupL) + (2 * CodeupW);

        System.out.println("The area of the classroom is: " + CodeupArea + "in.\nThe perimeter of the classroom is: " + CodeupPerimeter + "in.\n");

    }
}
