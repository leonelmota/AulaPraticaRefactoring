import java.util.Enumeration;

public class TextStatement extends Statement {
    
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