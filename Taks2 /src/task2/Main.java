package task2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //System.out.println(getUserAge("Please enter name "));
        getUserName();
        getUserAge();
        //yearsToRetirement();
    }

    static Scanner scan = new Scanner(System.in);

    public static String getUserName()
    {
        // Prompt the user for their age.
        //message from system to user.
        System.out.println("Please Enter your name: ");

        //prompts user for answer.
        String name = scan.nextLine();

        System.out.println("Hello " + name);

        return name;
    }

    public static int getUserAge()
    {
        // prompt the user with message for their age
        System.out.println("Please enter your age: ");

        //get next int input from user
        int age = scan.nextInt();
        System.out.println("your age is " + age);

        System.out.println("Since you are " + age + " you have " + (67 - age) + " years left until you can retire, at 67 years old");

        return age;

    }

}


    //below problem could not be solved as a method as getUserAge could not be stored in a variable without asking for age again and again.
    /*
    public static int yearsToRetirement()
    {

        int  yearsToPension = 67 - get;

        System.out.println("Since you are " + getUserAge() + "you have " + yearsToPension + " years left until you can retire, at 67 years old");

        return yearsToPension;
    }
}
*/

