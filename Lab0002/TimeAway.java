// Imports API's to fulfill program function
import java.time.LocalDate;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.DAYS;

public class TimeAway {
    //Constant Saved Data
    public static LocalDate Lab1 = LocalDate.of(2022, 9, 27);
    public static LocalDate Lab2 = LocalDate.of(2022, 10, 26);
    public static LocalDate Lab3 = LocalDate.of(2022, 11, 23);
    public static LocalDate Lab4 = LocalDate.of(2022, 12, 7);
    public static LocalDate quiz1 = LocalDate.of(2022,9,9);
    public static LocalDate quiz2 = LocalDate.of(2022,9,28);
    public static LocalDate quiz3 = LocalDate.of(2022,10,26);
    public static LocalDate quiz4 = LocalDate.of(2022,11,11);
    public static LocalDate quiz5 = LocalDate.of(2022,12,7);
    public static LocalDate[] dateList = {Lab1, Lab2, Lab3, Lab4, quiz1, quiz2, quiz3, quiz4, quiz5};
    // Mutable Data
    public static LocalDate userDate = LocalDate.now();
    public static LocalDate mockDate;


    //Splits the user's entries by the "/"'s they used when they entered it and added it to the array.
    // Constructs a LocalDate from the parts of the array that respectively represent the month, day and year
    // Prints out the user date to let them know what it has been set too.
    public static void setUserDate(String uD)
    {
        String[] partOfDate = uD.split("/");
        int month = Integer.parseInt(partOfDate[0]);
        int day = Integer.parseInt(partOfDate[1]);
        int year = Integer.parseInt(partOfDate[2]);
        userDate = LocalDate.of(year, month, day);
        System.out.println("Your date has been set as " +userDate);
    }
    //Splits the user's entries by the "/"'s they used when they entered it and added it to the array.
    // Constructs a LocalDate from the parts of the array that respectively represent the month, day and year
    // Prints out the mock date to let them know what it has been set too.
    public static void setMockDate(String uD)
    {
        String[] partOfDate = uD.split("/");
        int month = Integer.parseInt(partOfDate[0]);
        int day = Integer.parseInt(partOfDate[1]);
        int year = Integer.parseInt(partOfDate[2]);
        mockDate = LocalDate.of(year, month, day);
        System.out.println("Your mock date has been set as " + mockDate);
    }
    // Calculates the day between dates
    public static long daysBetweenDates(LocalDate a, LocalDate b)
    {
        return a.until(b, DAYS);
    }

    //prints out the list of Saved Dates
    public static void printSavedDates()
    {
        for ( int i = 1; i < dateList.length + 1; i++)
        {
            if(i <= 4)
            {
                System.out.println(i + ":" + "Lab" + i + " " + dateList[i - 1]);
            }
            if (i > 4)
            {
            System.out.println( i + ":" + "Quiz" + (i-4) + " " + dateList[i-1]  );
            }
        }
    }
    //prints out the menu options
    public static void printMenu()
    {
        System.out.println("Hello user what would you like to do?");
        System.out.println("1.View Saved Dates" );
        System.out.println("2.Create your own Date? Please enter in the format of MM/DD/YYYY include slashes." );
        System.out.println("3.Compare your date to Saved Date?" );
        System.out.println("4.Compare your date to another date?" );
        System.out.println("5.End program" );
    }
// main function that constantly reads user input.
    public static void main(String[] args) {

        printMenu();
        Scanner input = new Scanner(System.in);


        while(input.hasNext())
        {
            int choice = input.nextInt();
            switch(choice)
            {
                case 1:
                    printSavedDates();
                    printMenu();
                    break;
                case 2:
                    System.out.println("Enter your date:");
                    String date = input.next();
                    setUserDate(date);
                    printMenu();
                    break;
                case 3:
                    System.out.println("Input the number of the from Saved Dates you want to compare.");
                    int sD = input.nextInt();
                    if (userDate != null) {
                        System.out.println("The amount of days between "+ userDate + " " + dateList[sD-1] + " is " + daysBetweenDates(userDate , dateList[sD-1]));
                        printMenu();
                        break;
                    }
                case 4:
                    System.out.println("Set your mock date in the format MM/DD/YYYY");
                    String mD = input.next();
                    setMockDate(mD);
                    System.out.println("The amount of days between your first date "+ userDate + " and your " + mockDate + " is " + daysBetweenDates(userDate ,mockDate));
                    printMenu();
                    break;
                case 5:
                    System.out.println("Thank you");
                    try {
                        input.close();
                    }
                        catch(IllegalStateException e)
                        {
                           System.out.println("Program Closed");
                        }
                    break;




            }
        }


        }
    }
