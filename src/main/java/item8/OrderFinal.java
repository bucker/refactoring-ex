package item8;

public class OrderFinal {
    double getDiscountedPrice(CustomerFinal customer) {
        return getGrossPrice() * (1 - customer.getDiscount());
    }

    public double getGrossPrice() {
        return 3.14;
    }
}
