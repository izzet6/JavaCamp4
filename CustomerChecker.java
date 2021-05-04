public class CustomerChecker implements Checker {
    private Customer customer;
    public CustomerChecker(Customer customer){
        this.customer=customer;
    }


    @Override
    public void check(String message) {

        if (customer.getCustomerName()!=null&&customer.getCustomerSurname()!=null&&customer.getBirthDate()!=null&&customer.getPassportId()!=null){
            System.out.println("Musteri dogrulanmisdir:"+message);
        }else{
            System.out.println("Musteri dogrulanmadi");
        }
    }
}
