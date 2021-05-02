public abstract class BaseCustomerManager implements CustomerService {

    @Override
    public void save(Customer customer) {
        System.out.println("Customer has successfully saved to db: " + customer.getFirstName());

    }

    @Override
    public int addCoffee(Customer customer) {
        int coffee = customer.getCoffeeCount();
        System.out.println(coffee);
        if (coffee > 0) {
            System.out.println("You earned" + customer.getCoffeeCount() + "stars. 10% discount for every 10 stars awaits you");
            return 1;
        } else {
            System.out.println("Click to place your first order, earn special stars for the first order and benefit from advantageous prices");
            return 0;
        }
    }
}
