import java.util.Scanner;

public class PrintInitials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter middle name: ");
        String middleName = input.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        String initials = "" + firstName.charAt(0) + middleName.charAt(0) + lastName.charAt(0);
        initials = initials.toUpperCase();
        System.out.println("initials = " + initials);
    }
}
