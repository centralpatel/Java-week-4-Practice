package homeworkweek8practice;

import java.util.Scanner;
/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Prog_8_SymbolTriangle {
    public static void symbolTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("@");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbre of rows: ");
        symbolTriangle(scanner.nextInt());
        //closing the scanner object
        scanner.close();
    }
}
