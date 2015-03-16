import java.util.Scanner;

/**
 * Created by jc228962 on 16/03/15.
 */
public class BMIManager {
    public static void main(String[] args) {
        System.out.println("BMI Manager");
        Patient patient = new Patient();
        running: while (true) {
            System.out.println("Please select from the menu" +
                    "following menu options:\n" +
                    "\t1. Add new patient\n" +
                    "\t2. View patient\n" +
                    "\t3. Exit\n");

            System.out.println("Enter choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            public static void viewPatient(Patient patient) {

            }
            public static void addPatient(Patient patient) {

            }


            switch (choice) {
                case 1: {
                    viewPatient
                }
                case 2: {
                    addPatient
                }
                case 3: {
                    System.out.println("Goodbye");
                    break running;
                }
            }
        }
    }
}
