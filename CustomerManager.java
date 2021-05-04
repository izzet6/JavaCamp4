public class CustomerManager implements ICustomerManager {
    private CustomerChecker customerChecker;
    public CustomerManager(CustomerChecker customerChecker){
        this.customerChecker=customerChecker;
    }

    public CustomerManager() {

    }

    @Override
    public void add(Customer customer) {
        System.out.println("Musteri eklendi");
        Utils.runChecker(customerChecker,customer.getCustomerName());

    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Musteri silindi");

    }

    @Override
    public void update(Customer customer) {
        System.out.println("Musteri bilgileri guncellendi");

    }
}
