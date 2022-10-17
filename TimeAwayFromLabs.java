import java.time.LocalDate;
import java.time.Period;
public class TimeAwayFromLabs {
        public static void main(String[] args) {
            LocalDate Lab1 = LocalDate.of(2022, 9, 28);
            LocalDate Lab2 = LocalDate.of(2022, 10, 28);
            LocalDate Lab3 = LocalDate.of(2022, 11, 23);
            LocalDate Lab4 = LocalDate.of(2022, 12, 7);
            LocalDate now = LocalDate.now();

            Period df1 = now.until(Lab1);
            Period df2 = now.until(Lab2);
            Period df3 = now.until(Lab3);
            Period df4 = now.until(Lab4);

            Period[] differences = {df1, df2, df3, df4};
            for (Period theDifference : differences) {
                System.out.println(theDifference);
            }
        }
}

