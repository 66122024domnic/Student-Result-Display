import java.util.Scanner;
public class StudentsResult{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students? ");
        int noOfStudents = scanner.nextInt();
        scanner.nextLine();
        String name[] = new String[noOfStudents];
        int marks[] = new int[noOfStudents];
        int total = 0;
        int highestMark = 0;
        String topStudent = null;

        for (int i = 0; i < noOfStudents; i++) {
            System.out.print("Enter name: ");
            name[i] = scanner.nextLine();
            System.out.print("Enter marks: ");
            marks[i] = scanner.nextInt();
            total += marks[i];

            //highest marks
            if (marks[i] >= highestMark) {
                highestMark = marks[i];
                topStudent = name[i];
            }
            scanner.nextLine();

        }
        double average = (double)total / noOfStudents;

        //display results
        System.out.println("*************RESULTS***********");
        System.out.println("****Student Name****  ****Marks****");
        for (int j = 0; j < noOfStudents; j++) {
            System.out.println("    " + name[j] + "             " + marks[j]);
        }
        System.out.printf("Class Average: %.2f%n", average);
        System.out.println("Highest mark: " + highestMark);
        System.out.println("Top Student: " + topStudent);
        scanner.close();

    }
}