public class Customer {
    private int customerId;
    private String customerName;
    private String customerSurname;
    private String passportId;
    private String birthDate;

    public Customer(){

    }

    public Customer(int id,String name,String surname,String passportId,String birthDate){
        this.setCustomerId(id);
        this.setCustomerName(name);
        this.setCustomerSurname(surname);
        this.setPassportId(passportId);
        this.setBirthDate(birthDate);
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
