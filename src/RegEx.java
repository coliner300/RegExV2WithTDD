import java.util.Scanner;

public class RegEx
{
    Scanner input = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int age;
    private boolean isActive;
    private int stuID;

    public RegEx()
    {
        firstName = "";
        lastName = "";
        age = 0;
        isActive = false;
        stuID = 00000;
    }

    public RegEx(String firstName, String lastName, int age, boolean isActive, int stuID)
    {
        this.firstName = validateFirstName(firstName);
        this.lastName = validateLastName(lastName);
        this.age = age;
        this.isActive = isActive;
        this.stuID = stuID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public int getStuID() {
        return stuID;
    }

    public void setFirstName(String firstName) {
        this.firstName = validateFirstName(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = validateLastName(lastName);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    private String validateFirstName(String firstName)
    {
        while(!firstName.matches("[A-Z][a-zA-z]*"))
        {
            System.out.println("Format incorrect");
            firstName = input.nextLine();
        }
            return firstName;
    }//end validateFirstName with regEx

    private String validateLastName(String lastName)
    {
        while(!lastName.matches("[A-Z][a-zA-Z-]*"))
        {
            System.out.println("Format incorrect");
            lastName = input.nextLine();
        }
        return lastName;
    }//end validateLastname with RegEx

}//end class RegEx
