
public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new TcValidation());
        Customer customer = new Customer(1,"sarah","wood","444848484",5);
        customerManager.save(customer);
        customerManager.addCoffee(customer);
    }
}
