
import java.util.Scanner;

public class DemoOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[3];
        
        int grades[] = {10, 20, 30, 40, 50};
        String dogs[] = {"Bulldog", "Aspin", "Paul"};

        for(int ctr = 0; ctr < grades.length; ctr++ ) {
            System.out.println("Grades are  [ "+ctr+" ] " + grades[ctr]);
        }
            System.out.println("Display Grades using modified for loop");
            int x = 0;
            for (int g: grades){ 
             System.out.println("Grades are ["+x+"]: " + g);
        } 
        System.out.println("Enter New Grades: ");
        for(int ctr = 0; ctr < grades.length; ctr++ ) {
            grades[ctr] = sc.nextInt();
        }
        System.out.println("Here are the new grades: ");
        for (int ctr = 0; ctr < grades.length; ctr++ ) {
            System.out.println("Grades are: " + grades[ctr]);
        }
        int sum = 0;
        for (int ctr = 0; ctr < grades.length; ctr++ ) {
            sum += grades[ctr];
        }
        double avg = sum / grades.length; 
        System.out.println("Average: " + avg );
    }
}