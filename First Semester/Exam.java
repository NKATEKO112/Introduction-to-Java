import java.util.Random;
import java.util.Scanner;

public class Exam {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 5.3.1 - Declare studentNumber array and initialize with Table 5.1 data
        int[] studentNumber = {2023001, 2023002, 2023003, 2023004, 2023005, 
                                2023006, 2023007, 2023008, 2023009, 2023010};
        
        // Declare four parallel arrays
        int[] attendance = new int[studentNumber.length];
        double[] attendancePercentages = new double[studentNumber.length];
        int[] predicate = new int[studentNumber.length];
        String[] eligibility = new String[studentNumber.length];
        
        // Populate attendance array with random values (0-20)
        populateAttendance(attendance);
        
        // Calculate attendance percentages
        calculateAttendancePercentage(attendance, attendancePercentages);
        
        // Populate predicate marks from user input
        populatePredicate(studentNumber, predicate);
        
        // Display initial attendance information (Figure 5.1)
        System.out.println("\n===== STUDENT ATTENDANCE RECORDS =====");
        displayAttendanceInformation(studentNumber, attendance, attendancePercentages, predicate, eligibility);
        
        // Determine exam eligibility based on criteria
        determineExamEligibility(attendancePercentages, predicate, eligibility);
        
        // Display updated information with eligibility (Figure 5.1)
        System.out.println("\n===== STUDENT EXAM ELIGIBILITY =====");
        displayAttendanceInformation(studentNumber, attendance, attendancePercentages, predicate, eligibility);
        
        // Prompt for student number to search
        System.out.print("\nEnter student number to search: ");
        int searchNum = input.nextInt();
        
        // Search for student
        int index = searchStudent(studentNumber, searchNum);
        
        if (index != -1) {
            System.out.println("\n===== SEARCH RESULT =====");
            System.out.println("Student #: " + studentNumber[index]);
            System.out.println("Attendance Percent: " + attendancePercentages[index] + "%");
            System.out.println("Predicate: " + predicate[index]);
            System.out.println("Eligibility: " + eligibility[index]);
        } else {
            System.out.println("\nStudent number " + searchNum + " not found.");
        }
        
        input.close();
    }
    
    /**
     * 5.3.2 populateAttendance()
     * Populates attendance array with random numbers from 0 to 20
     * @param attendance - array to populate
     */
    public static void populateAttendance(int[] attendance) {
        Random rand = new Random();
        for (int i = 0; i < attendance.length; i++) {
            attendance[i] = rand.nextInt(21); // 0 to 20 inclusive
        }
    }
    
    /**
     * 5.3.3 calculateAttendancePercentage()
     * Calculates attendance percentage for each student
     * @param attendance - array of days attended
     * @param attendancePercentages - array to store percentages
     */
    public static void calculateAttendancePercentage(int[] attendance, double[] attendancePercentages) {
        final int TOTAL_CLASS_DAYS = 20;
        
        for (int i = 0; i < attendance.length; i++) {
            attendancePercentages[i] = (double) attendance[i] / TOTAL_CLASS_DAYS * 100;
        }
    }
    
    /**
     * 5.3.4 populatePredicate()
     * Prompts user for predicate marks (0-100) for each student
     * @param studentNumber - array of student numbers
     * @param predicate - array to store predicate marks
     */
    public static void populatePredicate(int[] studentNumber, int[] predicate) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n===== ENTER PREDICATE MARKS =====");
        
        for (int i = 0; i < studentNumber.length; i++) {
            int mark;
            boolean valid;
            
            do {
                System.out.print("Enter predicate for Student number " + studentNumber[i] + ": ");
                mark = input.nextInt();
                
                if (mark >= 0 && mark <= 100) {
                    valid = true;
                    predicate[i] = mark;
                } else {
                    valid = false;
                    System.out.println("Invalid predicate mark, mark must be from 0 to 100");
                }
                
            } while (!valid);
        }
    }
    
    /**
     * 5.3.5 determineExamEligibility()
     * Determines eligibility based on attendance (≥75%) and predicate (≥40)
     * @param attendancePercentages - array of attendance percentages
     * @param predicate - array of predicate marks
     * @param eligibility - array to store eligibility status
     */
    public static void determineExamEligibility(double[] attendancePercentages, int[] predicate, String[] eligibility) {
        for (int i = 0; i < attendancePercentages.length; i++) {
            if (attendancePercentages[i] >= 75 && predicate[i] >= 40) {
                eligibility[i] = "Eligible to write examination";
            } else {
                eligibility[i] = "Not Eligible to write examination";
            }
        }
    }
    
    /**
     * 5.3.6 searchStudent()
     * Searches for a student number in the array
     * @param studentNumber - array of student numbers
     * @param searchNumber - student number to search for
     * @return index if found, -1 if not found
     */
    public static int searchStudent(int[] studentNumber, int searchNumber) {
        for (int i = 0; i < studentNumber.length; i++) {
            if (studentNumber[i] == searchNumber) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * 5.3.7 displayAttendanceInformation()
     * Displays all student attendance information in a formatted table
     * @param studentNumber - array of student numbers
     * @param attendance - array of days attended
     * @param attendancePercentages - array of percentages
     * @param predicate - array of predicate marks
     * @param eligibility - array of eligibility status
     */
    public static void displayAttendanceInformation(int[] studentNumber, int[] attendance, 
                                                     double[] attendancePercentages, int[] predicate, 
                                                     String[] eligibility) {
        System.out.println("=".repeat(85));
        System.out.printf("%-12s %-10s %-12s %-10s %-35s%n", 
                          "Student #", "Attendance", "Percent (%)", "Predicate", "Eligibility");
        System.out.println("=".repeat(85));
        
        for (int i = 0; i < studentNumber.length; i++) {
            String eligibilityDisplay = (eligibility[i] == null) ? "Pending" : eligibility[i];
            
            System.out.printf("%-12d %-10d %-12.1f %-10d %-35s%n", 
                              studentNumber[i], attendance[i], attendancePercentages[i], 
                              predicate[i], eligibilityDisplay);
        }
        
        System.out.println("=".repeat(85));
        System.out.println("Criteria: Attendance ≥ 75% AND Predicate ≥ 40 to be eligible.");
    }
}