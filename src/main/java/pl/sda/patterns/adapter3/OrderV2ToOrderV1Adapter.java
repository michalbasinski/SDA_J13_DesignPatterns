package pl.sda.patterns.adapter3;

public class OrderV2ToOrderV1Adapter implements OrderV1 {
    private OrderV2 order;

    public OrderV2ToOrderV1Adapter(OrderV2 order) {
        this.order = order;
    }

    @Override
    public String getCustomerName() {
        return this.order.getCustomer().getCustomerName();
    }

    @Override
    public String getCustomerLastName() {
        return this.order.getCustomer().getCustomerLastName();
    }

    @Override
    public String getProductName() {
        return this.order.getProduct().getProductName();
    }

    @Override
    public Double getProductPrice() {
        return this.order.getProduct().getProductPrice();
    }
}
