import java.time.LocalDate;
import java.time.Period;
public class TimeAway {
    public static LocalDate Lab1 = LocalDate.of(2022, 9, 28);
    public static LocalDate Lab2 = LocalDate.of(2022, 10, 28);
    public static LocalDate Lab3 = LocalDate.of(2022, 11, 23);
    public static LocalDate Lab4 = LocalDate.of(2022, 12, 7);
    public static LocalDate quiz1 = LocalDate.of();
    public static LocalDate quiz2 = LocalDate.of();
    public static LocalDate quiz3 = LocalDate.of();
    public static LocalDate quiz4 = LocalDate.of();

    public static void main(String[] args) {

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
