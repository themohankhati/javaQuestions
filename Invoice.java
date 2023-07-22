package hm.questions;

public class Invoice{
    int id;
    Customer customer = new Customer(12,"Mohan",10);
    double amount;

//    public Invoice(int id, String name, int discount, String customer, double amount) {
//        super(id, name, discount);
//        this.amount=amount;
//    }
//
//
//    @Override
//    public int getId() {
//        return super.id;
//    }
//
//    @Override
//    public void setId(int id) {
//        super.setId(id);
//    }
//
//    @Override
//    public String getName() {
//        return super.getName();
//    }
//
//    @Override
//    public void setName(String name) {
//        super.setName(name);
//    }
//
//    @Override
//    public int getDiscount() {
//        return super.getDiscount();
//    }
//
//    @Override
//    public void setDiscount(int discount) {
//        super.setDiscount(discount);
//    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void details() {
        System.out.println(customer.getName()+customer.getDiscount()+customer.getId());

    }


    public static void main(String args[])
    {
        Invoice invoice= new Invoice();
        invoice.setAmount(2323);
        System.out.println(invoice.getAmount());
        System.out.println();


    }
}
