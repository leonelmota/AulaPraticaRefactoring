import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustumer){
        Enumeration rentals = aCustumer.getRentals();
        String result = "Rental Record for " + aCustumer.getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" +
                String.valueOf(each.getCharge()) + "\n";

        }
        //add footer lines
        result +=  "Amount owed is " + String.valueOf(aCustumer.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(aCustumer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
        return result;
    }
}