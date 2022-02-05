import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustumer){
        Enumeration rentals = aCustumer.getRentals();
        String result = getCustumerName(aCustumer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += getRentalFigures(each);
        }
        //add footer lines
        result +=  getFooter(aCustumer);
        return result;
    }

    public String getCustumerName(Customer aCustumer){
        return "Rental Record for " + aCustumer.getName() + "\n";
    }
    
    public String getRentalFigures(Rental aRental){
        return "\t" + aRental.getMovie().getTitle()+ "\t" +
            String.valueOf(aRental.getCharge()) + "\n";
    }

    public String getFooter(Customer aCustumer){
        return "Amount owed is " + String.valueOf(aCustumer.getTotalCharge()) + "\n"
        + "You earned " + String.valueOf(aCustumer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
    }
}