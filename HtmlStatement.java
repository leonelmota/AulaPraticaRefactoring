import java.util.Enumeration;

public class HtmlStatement extends Statement {
    public String value(Customer aCustumer){
        Enumeration rentals = aCustumer.getRentals();
        String result = "<H1>Rentals for <EM>" + aCustumer.getName() + "</EM></H1><P>\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for each rental
            result += each.getMovie().getTitle()+ ": " +
                    String.valueOf(each.getCharge()) + "<BR>\n";
        }
        
        // add footer lines
        result +=  "<P>You owe <EM>" + String.valueOf(aCustumer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                String.valueOf(aCustumer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
        return result;
    }
}