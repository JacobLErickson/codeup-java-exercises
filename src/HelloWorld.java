public class HelloWorld {
    public static void main(String[] args) {
//        byte first  = 7;
//        short second = 8;
//        int third = 9;
//        long fourth = 10;
//
//        float fifth = 11.0f;
//        double sixth = 12.1d;


//        System.out.println("HelloWorld");
//        System.out.print(++first);

//        Syntax, Types, and Variables
//        Exercise
//        1.
        int myFavoriteNumber = 144000;
        System.out.println(myFavoriteNumber);

//        2.
        String myString = "Hello There!";
        System.out.println(myString);

//        3.
//        It wants to change the variable type to char.

//        4.
//        Incompatible types. It wants to change the type to double.

//        5.
        long myNumber = 123;
        System.out.println(myNumber);
//        Error:(32, 25) java: illegal start of expression

//        6.
//        Error:(32, 25) java: incompatible types: possible lossy conversion from double to long

//        7.
//        It prints 123.

//        8.
//        Because 3.14 is not an integer. Long type only accept integers.

//        9.
//        Error:(32, 26) java: incompatible types: possible lossy conversion from double to float
//        We could either change the type to double or change the value to an integer or explicitly say this is a float by adding "f" after 3.14.

//        10.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

//        I believe that the code is adding on to the variable at a time dependent on where the ++ are placed. If they are before the variable, it adds to the variable and prints it out. If they are after, it prints the variable and adds after.
//        Daniel recommends using "x++" instead to have clear code.

//        11.
//        long class = 77;
//        It doesn't recognize "class" as a identifier.

//        12.
//        It will crash because a sttring is not an integer
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        The

//        int three = (int) "three";


    }
}
