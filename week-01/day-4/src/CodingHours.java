public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        int weeks = 17;
        int weekdays = 5;
        int hours_daily = 6;
        int codingHours;

        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        codingHours = hours_daily * weekdays * weeks;
        System.out.println("If you code only on weekdays, on average it's " + codingHours + " hours during a semester");

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        float codingTime;
        float codingHoursFloat = 510.0f;
        codingTime = codingHoursFloat / (52 * weeks) * 100;
        System.out.println("It's about " + codingTime + "% of all the hours there are in a semester");



    }
}
