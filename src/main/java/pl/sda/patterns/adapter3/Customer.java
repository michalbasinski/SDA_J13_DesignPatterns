package pl.sda.patterns.adapter3;

public class Customer {
    private String customerName;
    private String customerLastName;

    public Customer(String customerName, String customerLastName) {
        this.customerName = customerName;
        this.customerLastName = customerLastName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }
}
