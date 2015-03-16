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

            switch (choice) {
                case 1: {
                    viewPatient(patient);
                }
                case 2: {
                    addPatient(patient);
                }
                case 3: {
                    System.out.println("Goodbye");
                    break running;
                }
            }
        }
    }


    public static void viewPatient(Patient patient) {
        System.out.println(String.format("Name: %s Age: %d BMI: %.2f",patient.getName(), patient.getAge(), patient.getBMI() ) );
    }

    public static void addPatient(Patient patient) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your height (in metres)");
        double height = scanner.nextDouble();
        System.out.println("Enter your weight (in kgs)");

    }
}
