
public class Switch {
    public static void main(String[] args) {

        int month = 8;
        String monthValues;
        switch (month) {
            case 1:  monthValues = "January";
                     break;
            case 2:  monthValues = "February";
                     break;
            case 3:  monthValues = "March";
                     break;
            case 4:  monthValues = "April";
                     break;
            case 5:  monthValues = "May";
                     break;
            case 6:  monthValues = "June";
                     break;
            case 7:  monthValues = "July";
                     break;
            case 8:  monthValues = "August";
                     break;
            case 9:  monthValues = "September";
                     break;
            case 10: monthValues = "October";
                     break;
            case 11: monthValues = "November";
                     break;
            case 12: monthValues = "December";
                     break;
            default: monthValues = "Not a month";
                     break;
        }
        System.out.println(monthValues);
    }
}