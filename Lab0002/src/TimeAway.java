import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class TimeAway {
    public static LocalDate Lab1 = LocalDate.of(2022, 9, 28);
    public static LocalDate Lab2 = LocalDate.of(2022, 10, 28);
    public static LocalDate Lab3 = LocalDate.of(2022, 11, 23);
    public static LocalDate Lab4 = LocalDate.of(2022, 12, 7);
    public static LocalDate quiz1 = LocalDate.of(2022,9,9);
    public static LocalDate quiz2 = LocalDate.of(2022,9,28);
    public static LocalDate quiz3 = LocalDate.of(2022,10,26);
    public static LocalDate quiz4 = LocalDate.of(2022,11,7);
    public static LocalDate quiz5 = LocalDate.of(2022,12,7);
    public static LocalDate userDate = LocalDate.of(0001,01,01);
    public static LocalDate mockDate;
    public static LocalDate[] dateList = {Lab1, Lab2, Lab3, Lab4, quiz1, quiz2, quiz3, quiz4, quiz5};

    public static void printMenu()
    {
        System.out.println("Hello user what would you like to do?");
        System.out.println("1.View Saved Dates" );
        System.out.println("2.Create your own Date? Please enter in the format of MM/DD/YYYY include slashes." );
        System.out.println("3.Compare your date to another date? Input the number of the date you want to compare." );
        System.out.println("4.Create your own Date?" );
    }

    public static void printDates()
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
    public static void setCustomDate(String uD)
    {
     String[] partOfDate = uD.split("/");
     int month = Integer.parseInt(partOfDate[0]);
     int day = Integer.parseInt(partOfDate[1]);
     int year = Integer.parseInt(partOfDate[2]);
     userDate = LocalDate.of(year, month, day);
    }
     public static int dateBetweenDates(LocalDate a, LocalDate b)
     {
         Period df1 = a.until(b);
         return df1.getDays();
     }

    public static void main(String[] args) {

        printMenu();
        Scanner input = new Scanner(System.in);


        while(input.hasNext())
        {

            int choice = input.nextInt();
            switch(choice)
            {
                case 1:
                    printDates();
                    printMenu();
                    break;
                case 2:
                    String date = input.next();
                    setCustomDate(date);
                    printMenu();
                case 3:

                case 4:



            }
        }


        }
    }
