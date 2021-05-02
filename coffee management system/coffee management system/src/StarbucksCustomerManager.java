public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;
    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;

    }
    //dependencies yontemi ile initialize edildi

    @Override
    public void save(Customer customer) {
        if(customerCheckService.IsFakePerson(customer)) {
            System.out.println("Starbucks Manager : Validation successfull.");
            super.save(customer);
        }else {
            System.out.println("Starbucks Manager : Validation Error - Not a valid person.");
        }

    }

}

