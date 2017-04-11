package CountWorkingDays;

import javax.swing.text.DateFormatter;
import java.io.Console;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CountWorkingDays {
//    public static void main(String[] args)  throws ParseException {
//        Scanner console = new Scanner(System.in);
//
//       // String input = console.nextLine();
//        //String input = args.length == 0 ? console.nextLine() : args[0];
//        //String input = "11-04-2016";
//        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
//        Date startDate = format.parse(console.nextLine());
//        Date endDate = format.parse(console.nextLine());
//
//        Calendar calendar = Calendar.getInstance();
//        //Date endDate = DateTime.ParseExact(Console.ReadLine(), "dd-MM-yyyy", CultureInfo.InvariantCulture);
//
//        int count = 0;
//        for (Date i = startDate; i <= endDate; i = i.AddDays(1))
//        {
//            Date currentDate = i;
//            Date[] officialHolidays = new Date[]
//                    {
//                            new Date(currentDate.Year,1,1),
//                            new Date(currentDate.Year,3,3),
//                            new DateTime(currentDate.Year,5,1),
//                            new DateTime(currentDate.Year,5,6),
//                            new DateTime(currentDate.Year,5,24),
//                            new DateTime(currentDate.Year,9,6),
//                            new DateTime(currentDate.Year,9,22),
//                            new DateTime(currentDate.Year,11,1),
//                            new DateTime(currentDate.Year,12,24),
//                            new DateTime(currentDate.Year,12,25),
//                            new DateTime(currentDate.Year,12,26)
//                    };
//
//            if (i.DayOfWeek != DayOfWeek.Saturday && i.DayOfWeek != DayOfWeek.Sunday && !officialHolidays.Contains(i))
//            {
//                count += 1;
//            }
//        }
//        System.out.println(count);
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate startDate = LocalDate.parse(scanner.nextLine(), df);
        LocalDate endDate = LocalDate.parse(scanner.nextLine(), df);

//        int[][] holidays = new int[][]{
//                new int[]{1, 1},
//                new int[]{3, 3},
//                new int[]{1, 5},
//                new int[]{6, 5},
//                new int[]{24, 5},
//                new int[]{6, 9},
//                new int[]{22, 9},
//                new int[]{1, 11},
//                new int[]{24, 12},
//                new int[]{25, 12},
//                new int[]{26, 12},
//        };



        int workingDaysCount = 0;

        LocalDate endingDatePlusOne = endDate.plusDays(1);
        for (LocalDate currentDate = startDate; !currentDate.isEqual(endingDatePlusOne); currentDate = currentDate.plusDays(1)) {
            LocalDate[] holidays = new LocalDate[] {
                    LocalDate.of(currentDate.getYear(), 1, 1),
                    LocalDate.of(currentDate.getYear(), 3, 3),
                    LocalDate.of(currentDate.getYear(), 5, 1),
                    LocalDate.of(currentDate.getYear(), 5, 6),
                    LocalDate.of(currentDate.getYear(), 5, 24),
                    LocalDate.of(currentDate.getYear(), 9, 6),
                    LocalDate.of(currentDate.getYear(), 9, 22),
                    LocalDate.of(currentDate.getYear(), 11, 1),
                    LocalDate.of(currentDate.getYear(), 12, 24),
                    LocalDate.of(currentDate.getYear(), 12, 25),
                    LocalDate.of(currentDate.getYear(), 12, 26),
            };

            boolean isWeekend = currentDate.getDayOfWeek() == DayOfWeek.SATURDAY ||
                    currentDate.getDayOfWeek() == DayOfWeek.SUNDAY;

            boolean isHoliday = false;
            for (LocalDate holiday : holidays) {
                boolean dayEqual = currentDate.getDayOfMonth() == holiday.getDayOfMonth();
                boolean monthEqual = currentDate.getMonthValue() == holiday.getMonthValue();

                if (dayEqual && monthEqual) {
                    isHoliday = true;
                    break;
                }
            }

            if (!isWeekend && !isHoliday) {
                workingDaysCount++;
            }
        }

        System.out.println(workingDaysCount);
    }
}
