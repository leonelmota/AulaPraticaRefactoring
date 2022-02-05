import java.util.Enumeration;

public abstract class Statement{

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

    public abstract String getCustumerName(Customer aCustumer);

    public abstract String getRentalFigures(Rental aRental);

    public abstract String getFooter(Customer aCustumer);
}