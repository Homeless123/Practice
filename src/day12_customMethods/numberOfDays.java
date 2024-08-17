package day12_customMethods;

public class numberOfDays {
    /*
     Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
     */
    public static void main(String[] args) {
        numberOfday("jUNe");
        numberOfday("may");
        numberOfday("august");
    }
    public static void numberOfday(String month) {
        month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();
        String result =month + "has";
        switch (month) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                result =("Number of days: 31 " + month);
                result += "\n"+31 + " days";

                break;
                case "February":
                   result=("Number of days: 28 " + month);
                   result +="\n"+28 + " days";
                    break;
            case "April":
            case "June":
            case "September":
            case "November":
                result=("Number of days: 30 " + month);
                result +="\n"+30 + " days";
                break;

            default:
                result=("Invalid month: " + month);
                result =("Invalid month" + month);

        }

        System.out.println(result);



    }

}
