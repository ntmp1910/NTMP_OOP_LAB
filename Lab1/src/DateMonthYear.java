import java.util.Scanner;

public class DateMonthYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;
        String monthInput;
        int year;

        while (true) {
            System.out.print("Enter the month : ");
            monthInput = scanner.nextLine().toLowerCase();

            if (monthInput.matches("jan(uary)?|1")) {
                monthNumber = 1;
                break;
            } else if (monthInput.matches("feb(ruary)?|2")) {
                monthNumber = 2;
                break;
            } else if (monthInput.matches("mar(ch)?|3")) {
                monthNumber = 3;
                break;
            } else if (monthInput.matches("apr(il)?|4")) {
                monthNumber = 4;
                break;
            } else if (monthInput.matches("may|5")) {
                monthNumber = 5;
                break;
            } else if (monthInput.matches("jun(e)?|6")) {
                monthNumber = 6;
                break;
            } else if (monthInput.matches("jul(y)?|7")) {
                monthNumber = 7;
                break;
            } else if (monthInput.matches("aug(ust)?|8")) {
                monthNumber = 8;
                break;
            } else if (monthInput.matches("sep(t(ember)?)?|9")) {
                monthNumber = 9;
                break;
            } else if (monthInput.matches("oct(ober)?|10")) {
                monthNumber = 10;
                break;
            } else if (monthInput.matches("nov(ember)?|11")) {
                monthNumber = 11;
                break;
            } else if (monthInput.matches("dec(ember)?|12")) {
                monthNumber = 12;
                break;
            } else {
                System.out.println("Invalid month input. Please try again.");
            }
        }

        while (true) {
            System.out.print("Enter the year (non-negative number): ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year >= 0) {
                    break;
                }
            }
            scanner.nextLine(); // clear input buffer
            System.out.println("Invalid year input. Please enter a non-negative number.");
        }

        int daysInMonth = getDaysInMonth(monthNumber, year);
        System.out.println("Number of days in " + getMonthName(monthNumber) + " " + year + " is: " + daysInMonth);
    }

    private static int getDaysInMonth(int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid Month";
        }
    }
}
//ntmp
