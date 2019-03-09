package pl.sda.patterns.adapter3;

public class OrderV1ToOrderV2Adapter implements OrderV2 {
    private OrderV1 order;

    public OrderV1ToOrderV2Adapter(OrderV1 order) {
        this.order = order;
    }

    @Override
    public Product getProduct() {
        return new Product(this.order.getProductName(), this.order.getProductPrice());
    }

    @Override
    public Customer getCustomer() {
        return new Customer(this.order.getCustomerName(), this.order.getCustomerLastName());
    }
}
