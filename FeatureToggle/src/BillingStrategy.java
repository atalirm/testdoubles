/**
 * TODO .
 *
 * @author paolareyes
 */
public interface BillingStrategy {
    // Use a price in cents to avoid floating point round-off error
    int getPrice(int rawPrice);

}
