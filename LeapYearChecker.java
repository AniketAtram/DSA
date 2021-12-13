package DSA;

public class LeapYearChecker {

    public static void main(String[] args) {

        boolean leap;
        int year = 2020;

        leap = isLeapYear(year);

        if (leap){
            System.out.println(year+" is a leap year");
        }
        else {
            System.out.println(year+" is not a leap year");
        }

    }

   static boolean isLeapYear(int year){

        if (year % 4 == 0){

            if (year % 100 == 0){

                return year % 400 == 0;

            }

            else {

                return true;
            }
        }
        else {

            return false;
        }
    }
}
