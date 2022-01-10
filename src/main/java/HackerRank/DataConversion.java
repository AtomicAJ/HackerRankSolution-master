package HackerRank;

public class DataConversion {

    public static void main(String[] args) {
        String s = "04:59:59AM";
        String timeOfDay = s.substring(8, 10);
        String newDate;
        if (timeOfDay.equals("AM")) {
            int twentyFourFormatHour = (Integer.valueOf(s.substring(0, 2)) < 12) ? Integer.valueOf(s.substring(0, 2))
                                            : Integer.valueOf(s.substring(0, 2)) - 12;
            ;
            if (String.valueOf(twentyFourFormatHour).length() == 1) {
                newDate = "0" + String.valueOf(twentyFourFormatHour) + s.substring(2, 8);
            }
            else {
            newDate = String.valueOf(twentyFourFormatHour) + s.substring(2, 8);
            }

        }
        else {
            int twentyFourFormatHour = (Integer.valueOf(s.substring(0, 2)) == 12) ? Integer.valueOf(s.substring(0, 2))
                                            : Integer.valueOf(s.substring(0, 2)) + 12;
            newDate = String.valueOf(twentyFourFormatHour) + s.substring(2, 8);
        }
        System.out.println(newDate);
        // System.out.println(parseFormat.format(date) + " = " +
        // displayFormat.format(date));

    }

}
