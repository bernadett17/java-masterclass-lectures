package controlFlow;

public class SwitchStatement {
    public static void main(String[] args) {

    /*  int value = 1;
      if (value == 1){
          System.out.println("Value was 1");
      } else if (value == 2){
          System.out.println("Value was 2");
      } else {
          System.out.println("Was not 1 or 2");
      } */

        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, a 4, or 5");
                System.out.println("Actually was " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        // enhanced switch
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");

            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or 5");
                System.out.println("Actually was " + switchValue);
            }

            default -> {
                System.out.println("Was not 1, 2, 3, 4 or 5");

            }
        }
        ;

        String month = "JUNE";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter of the year.");

        month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter of the year.");

    }

    public static String getQuarter(String month) {

       /*  switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th";
        }
        return "BAD"; */

        //enhanced switch
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;     //yield has to be in a code block
            }
        };
    }

}
