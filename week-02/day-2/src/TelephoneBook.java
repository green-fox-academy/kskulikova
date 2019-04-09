import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        Map<String, String> phoneBook = Map.of("William A. Lathan", "405-709-1865",
                "John K. Miller","402-247-8568",
                "Hortensia E. Foster","606-481-6467",
                "Amanda D. Newland", "319-243-5613",
                "Brooke P. Askew", "307-687-2982");

        phoneBook = new HashMap<>(phoneBook);

        System.out.println("John K. Miller's phone number: " + phoneBook.get("John K. Miller"));

        String whoseNumber = "";
        for (String key : phoneBook.keySet()) {
            String value = phoneBook.get(key);
            if (value == "307-687-2982") {
                whoseNumber = key;
            }
        }

        System.out.println("307-687-2982 is " + whoseNumber+ "'s phone number");

        if(phoneBook.containsKey("Chris E. Myers")){
            System.out.println("We have Chris E. Myers' phone number");
        } else {
            System.out.println("We don't have Chris E. Myers' phone number");
        }
    }
}
