public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String quoteHead = quote.substring(0, quote.indexOf("It") + 2);
        String quoteTail = quote.substring(quote.indexOf("you"));

        quote = quoteHead + " always takes longer than " + quoteTail;

        System.out.println(quote);
    }
}
