package tues.funwithfileio;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author john
 */
public class TuesFunWithFileIO {

    /**
     * @throws
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        File file = new File("crap.txt");
        Scanner fileContents = new Scanner(file);
        int gradeAggregate = 0;
        int numberOfStudents = 0;

        while (fileContents.hasNext()) {
            String studentName = fileContents.next();
            int studentGrade = fileContents.nextInt();
            fileContents.nextLine();

            gradeAggregate += studentGrade;
            numberOfStudents++;

            System.out.println(
                    "Student: "
                    + studentName
                    + " got "
                    + studentGrade
            );
        }

        System.out.println(
                "\nAverage grade: "
                + gradeAggregate / numberOfStudents
        );
    }

}
