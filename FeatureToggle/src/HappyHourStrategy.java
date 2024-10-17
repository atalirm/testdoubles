/**
 * TODO .
 *
 * @author paolareyes
 */
public class HappyHourStrategy implements BillingStrategy{

    public int getPrice(int price){
        return price/2;
    }
}
