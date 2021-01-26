import java.util.Scanner;

public class RegExDriver
{
    public static void main(String[] args)
    {
        RegEx check1 = new RegEx();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first name");
        check1.setFirstName(input.nextLine());

        System.out.println("First Name is: " + check1.getFirstName());

        System.out.println("Enter a last name");
        check1.setLastName(input.nextLine());

        System.out.println("Last Name is: " + check1.getLastName());
    }
}
