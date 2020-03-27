import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class Assignment2
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        String fileName;
        int numStud = 0;
        String fName;
        int length;
        String lName;
        String psid;
        double gradeOne = 0.0;
        double gradeTwo = 0.0;
        double gradeThree = 0.0;
        double gradePointsOne = 0.0;
        double gradePointsTwo = 0.0;
        double gradePointsThree = 0.0;
        double gradePointsEarned = 0.0;
        double GPA = 0.0;
        int semesterHours = 3;
        String rounding;

        System.out.print("Enter the name of the file to contain output (include .txt at the end of name): ");
        fileName = in.nextLine();
        PrintWriter outWriter = new PrintWriter(fileName);
        System.out.println("\n");
        System.out.print("How many students shall we consider? ");
        numStud = in.nextInt();
        in.nextLine();

        for(int i = 0;i<numStud;i++)
        {
            System.out.println("\n");
            System.out.print("Enter the student's first name: ");
            fName = in.nextLine();
            length = fName.length();
            for(int j = 0;j<length;j++)    //Validity check for fName; should only be letters.
            {
                if(Character.isLetter(fName.charAt(j)) == false)
                {
                    System.out.println("Not a valid first name. Please enter a first name containing only letters.");
                    System.out.print("Enter the student's first name: ");
                    fName = in.nextLine();
                    length = fName.length();
                    j = -1;
                }
            }
            outWriter.print(fName);
            outWriter.print("\t");
            System.out.println("\n");
            System.out.print("Enter the student's last name: ");
            lName = in.nextLine();
            for(int l = 0;l<lName.length();l++)    //Validity check for lName; should only be letters.
            {
                if(Character.isLetter(fName.charAt(l)) == false)
                {
                    System.out.println("Not a valid last name. Please enter a last name containing only letters.");
                    System.out.print("Enter the student's last name: ");
                    lName = in.nextLine();
                    l = -1;
                }
            }
            outWriter.print(lName);
            outWriter.print("\t");
            System.out.println("\n");
            System.out.print("Enter the student's PSID: ");
            psid = in.nextLine();
            for(int k = 0; k<psid.length();k++)     //Validity check for PSID; should be 10 digits long and consist of only numbers.
            {
                if(psid.length() > 10)
                {
                    System.out.println("PSID too long. Please enter a PSID containing only ten numeric digits.");
                    System.out.print("Enter the student's PSID: ");
                    psid = in.nextLine();
                    k = -1;
                }
                if(Character.isDigit(fName.charAt(k)) == false)
                {
                    System.out.println("Not a valid PSID. Please enter a PSID containing only ten numeric digits.");
                    System.out.print("Enter the student's PSID: ");
                    psid = in.nextLine();
                    k = -1;
                }
            }
            outWriter.print(psid); //Need to add validity check on this.
            outWriter.print("\t");
            System.out.println("\n");
            System.out.print("Enter the student's grade in the first class: ");
            gradeOne = in.nextDouble();
            outWriter.print(gradeOne);
            outWriter.print("\t");
            System.out.println("\n");
            System.out.print("Enter the student's grade in the second class: ");
            gradeTwo = in.nextDouble();
            outWriter.print(gradeTwo);
            outWriter.print("\t");
            System.out.println("\n");
            System.out.print("Enter the student's grade in the third class: ");
            gradeThree = in.nextDouble();
            outWriter.print(gradeThree + "\t");

            if(gradeOne <= 100 && gradeOne >= 90)
            {
                gradePointsOne = 4.00;
            }
            else if(gradeOne >= 87 && gradeOne <= 89)
            {
                gradePointsOne = 3.33;
            }
            else if(gradeOne >= 83 && gradeOne <= 86)
            {
                gradePointsOne = 3.00;
            }
            else if(gradeOne >= 80 && gradeOne <= 82)
            {
                gradePointsOne = 2.67;
            }
            else if(gradeOne >= 77 && gradeOne <= 79)
            {
                gradePointsOne = 2.33;
            }
            else if(gradeOne >= 73 && gradeOne <= 76)
            {
                gradePointsOne = 2.00;
            }
            else if(gradeOne >= 70 && gradeOne <= 72)
            {
                gradePointsOne = 1.67;
            }
            else if(gradeOne >= 67 && gradeOne <= 69)
            {
                gradePointsOne = 1.33;
            }
            else if(gradeOne >= 63 && gradeOne <= 66)
            {
                gradePointsOne = 1.00;
            }
            else if(gradeOne >= 60 && gradeOne <= 62)
            {
                gradePointsOne = 0.67;
            }
            else if(gradeOne < 60)
            {
                gradePointsOne = 0.00;
            }
            if(gradeTwo <= 100 && gradeTwo >= 90)
            {
                gradePointsTwo = 4.00;
            }
            else if(gradeTwo >= 87 && gradeTwo <= 89)
            {
                gradePointsTwo = 3.33;
            }
            else if(gradeTwo >= 83 && gradeTwo <= 86)
            {
                gradePointsTwo = 3.00;
            }
            else if(gradeTwo >= 80 && gradeTwo <= 82)
            {
                gradePointsTwo = 2.67;
            }
            else if(gradeTwo >= 77 && gradeTwo <= 79)
            {
                gradePointsTwo = 2.33;
            }
            else if(gradeTwo >= 73 && gradeTwo <= 76)
            {
                gradePointsTwo = 2.00;
            }
            else if(gradeTwo >= 70 && gradeTwo <= 72)
            {
                gradePointsTwo = 1.67;
            }
            else if(gradeTwo >= 67 && gradeTwo <= 69)
            {
                gradePointsTwo = 1.33;
            }
            else if(gradeTwo >= 63 && gradeTwo <= 66)
            {
                gradePointsTwo = 1.00;
            }
            else if(gradeTwo >= 60 && gradeTwo <= 62)
            {
                gradePointsTwo = 0.67;
            }
            else if(gradeTwo < 60)
            {
                gradePointsTwo = 0.00;
            }
            if(gradeThree <= 100 && gradeThree >= 90)
            {
                gradePointsThree = 4.00;
            }
            else if(gradeThree >= 87 && gradeThree <= 89)
            {
                gradePointsThree = 3.33;
            }
            else if(gradeThree >= 83 && gradeThree <= 86)
            {
                gradePointsThree = 3.00;
            }
            else if(gradeThree >= 80 && gradeThree <= 82)
            {
                gradePointsThree = 2.67;
            }
            else if(gradeThree >= 77 && gradeThree <= 79)
            {
                gradePointsThree = 2.33;
            }
            else if(gradeThree >= 73 && gradeThree <= 76)
            {
                gradePointsThree = 2.00;
            }
            else if(gradeThree >= 70 && gradeThree <= 72)
            {
                gradePointsThree = 1.67;
            }
            else if(gradeThree >= 67 && gradeThree <= 69)
            {
                gradePointsThree = 1.33;
            }
            else if(gradeThree >= 63 && gradeThree <= 66)
            {
                gradePointsThree = 1.00;
            }
            else if(gradeThree >= 60 && gradeThree <= 62)
            {
                gradePointsThree = 0.67;
            }
            else if(gradeThree < 60)
            {
                gradePointsThree = 0.00;
            }

            outWriter.print(gradePointsOne + "\t");
            outWriter.print(gradePointsTwo + "\t");
            outWriter.print(gradePointsThree + "\t");

            gradePointsEarned = (semesterHours * gradePointsOne) + (semesterHours * gradePointsTwo) + (semesterHours * gradePointsThree);
            //outWriter.print(gradePointsEarned + "\t");
            GPA = gradePointsEarned / 9.0;
            rounding = String.format("%.2f",GPA);
            outWriter.print(rounding);
            outWriter.print("\n");

            System.out.println("\n");
        }
        outWriter.close();
    }
}