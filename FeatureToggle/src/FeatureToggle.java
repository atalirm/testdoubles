/**
 * TODO .
 *
 * @author paolareyes
 */
public class FeatureToggle {
    public static void main(String[] arguments) {
        // Prepare strategies
        BillingStrategy normalStrategy = new NormalStrategy();
        BillingStrategy happyHourStrategy = new HappyHourStrategy();

        CustomerBill firstCustomerBill = new CustomerBill(normalStrategy);

        // Normal billing
        firstCustomerBill.add(100, 1);

        if ((arguments.length > 0) && arguments[0].equals("featToggle")) {
            // Start Happy Hour
            firstCustomerBill.setStrategy(happyHourStrategy);
            firstCustomerBill.add(100, 2);
        }
        // New Customer
        CustomerBill secondCustomerBill = new CustomerBill(happyHourStrategy);
        secondCustomerBill.add(80, 1);
        // The Customer pays
        firstCustomerBill.print();

        // End Happy Hour
        secondCustomerBill.setStrategy(normalStrategy);
        secondCustomerBill.add(130, 2);
        secondCustomerBill.add(250, 1);
        secondCustomerBill.print();
    }
}
