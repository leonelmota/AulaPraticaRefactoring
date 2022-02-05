import java.util.Enumeration;

public class HtmlStatement extends Statement {
    public String value(Customer aCustumer){
        Enumeration rentals = aCustumer.getRentals();
        String result = getCustumerName(aCustumer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += getRentalFigures(each);
        }
        // add footer lines
        result +=  getFooter(aCustumer);
        return result;
    }

    public String getCustumerName(Customer aCustumer){
        return "<H1>Rentals for <EM>" + aCustumer.getName() + "</EM></H1><P>\n";
    }

    public String getRentalFigures(Rental aRental){
        return aRental.getMovie().getTitle() + ": " +
            String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    public String getFooter(Customer aCustumer){
        return "<P>You owe <EM>" + String.valueOf(aCustumer.getTotalCharge()) + "</EM><P>\n"
            + "On this rental you earned <EM>"
            +  String.valueOf(aCustumer.getTotalFrequentRenterPoints())
            +  "</EM> frequent renter points<P>";
    }
}