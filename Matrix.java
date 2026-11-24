
import java.util.Scanner;
public class Matrix {
   public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
       char again;
       
       System.out.println("==== Matrix Program ====");
       // Repeat the program if answer is y
       do {
           int[][] m = new int[3][3];
           int[] r = new int[3];
           int[] c = new int[3];
           int d1 = 0;
           int d2 = 0;
          
           // input 9 numbers
           System.out.println("Enter 9 elements (0-9):");
           for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                   System.out.print("Enter number: ");
                   int n = sc.nextInt();
                   // Check if the number is valid
                   if (n < 0 || n > 9) {
                       System.out.println("Invalid! Enter 0-9 only.");
                       j--;
                       continue;
                   }
                   // Saving the number
                   m[i][j] = n;
                   // Getting the row and column sum
                   r[i] += n;
                   c[j] += n;
               }
           }
           
           // Displaying numbers, row and sum
           System.out.println("Numbers:");
           System.out.println("================================");
           System.out.println("\t\t\tRow Sum");
           int totalRowSum = 0;
           for (int i = 0; i < 3; i++) {
               totalRowSum += r[i];
               for (int j = 0; j < 3; j++) {
                   System.out.print(m[i][j] + "\t");
               }
               System.out.println("--> " + r[i]);
           }
           System.out.println("Total Row Sum:\t\t--> " + totalRowSum);
           System.out.println("================================");
           // Displaying column sum
           System.out.println("Column Sum:");
           int totalColumnSum = 0;
           for (int j = 0; j < 3; j++) {
               System.out.print(c[j] + "\t");
               totalColumnSum += c[j];
           }
           System.out.println("--> " + totalColumnSum);
           // Getting diagonal sum
           for (int i = 0; i < 3; i++) {
               d1 += m[i][i];
               d2 += m[i][2 - i];
           }
           System.out.println("================================");
           // Displaying diagonal sum
           System.out.println("Diagonal Sum 1: " + d1);
           System.out.println("Diagonal Sum 2: " + d2);
           System.out.println("================================");
           // Ask if the user wants to repeat
           System.out.print("Try Again [y/n]: ");
           again = sc.next().charAt(0);
       } while (again == 'y' || again == 'Y');
       // End of program
       System.out.println("Program Ended.");
       sc.close();
   }
}