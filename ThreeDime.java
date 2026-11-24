import java.util.Scanner;
public class ThreeDime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        //For the 3D array, we have 2 sections, 3 students per section, and 3 subjects This is the declaration of a 3D array to store the grades of students in different sections and subjects.
        int grades[][][] = new int[2][3][3];
        String[] subjects = {"Java", "Database", "Networking"};
        // Nested loops to input grades for each student in each section for each subject
        for (int s = 0; s < 2; s++) {
            for (int st = 0; st < 3; st++) {
                for (int sub = 0; sub < 3; sub++) {
                    System.out.print("Section " + ( s + 1) + " student " + (st + 1) + " - Enter grade for subject " + (sub + 1) + " (Java, Database, Networking): ");
                    grades[s][st][sub] = sc.nextInt();
                }
            }
        }
        // Closing the scanner to prevent resource Leaks that might cause memory issues or unexpected behavior in the program. 
        sc.close();

        // This section of code calculates and display the average grades for each student and section, and determines if the student is passed or failed.
        for (int s = 0; s < 2; s++) {
            double sectionTotal = 0;
            System.out.println("\nSECTION " + (s+1));

            System.out.println("==========================================");
            // Loop through each student in the section
            for (int st = 0; st < 3 ; st++) {
                double studentTotal = 0;
                System.out.println("Student " + (st + 1));
                for (int sub = 0; sub < 3; sub++) {
                    int grade = grades[s][st][sub];
                    studentTotal += grade;
                    sectionTotal += grade;
                    System.out.printf("%-12s %d%n", subjects[sub], grade);
                }
                // calculation of average grade for each student. Displays the average and determines if the student has passed or failed based on the average grade.
                double studentAverage = studentTotal / 3;
                System.out.printf("Student Average: %.2f%n", studentAverage);
                if (studentAverage >= 75) {
                    System.out.println("Status: Passed\n");
                } else {
                    System.out.println("Status: Failed\n");
                }

                System.out.println("==========================================");
            }
            // calculation of average grade for each section. Displays the average for the section.
            System.out.printf("Section Average: %.2f%n", sectionTotal / 9);
        }
    }
}