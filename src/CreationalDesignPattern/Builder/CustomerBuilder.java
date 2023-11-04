//package CreationalDesignPattern.Builder;
//
//public class CustomerBuilder implements ICustomerBuilder{
//
//    private String firstName;
//    private String middleName;
//    private String lastName;
//    private String primaryEmail;
//    private String secondaryEmail;
//    private String primaryMobileNumber;
//    private String secondaryMobileNumber;
//
//
//
//    @Override
//    public ICustomerBuilder setFirstName(String firstName) {
//        this.firstName = firstName;
//        return this;
//    }
//
//    @Override
//    public ICustomerBuilder setLastName(String lastName) {
//        this.lastName = lastName;
//        return this;
//    }
//
//    @Override
//    public ICustomerBuilder setMiddleName(String middleName) {
//        this.middleName = middleName;
//        return this;
//    }
//
//    @Override
//    public ICustomerBuilder setPrimaryEmail(String primaryEmail) {
//        this.primaryEmail = primaryEmail;
//        return this;
//    }
//
//    @Override
//    public ICustomerBuilder setSecondaryEmail(String secondaryEmail) {
//        this.secondaryEmail = secondaryEmail;
//        return this;
//    }
//
//    @Override
//    public ICustomerBuilder setPrimaryMobileNumber(String primaryMobileNumber) {
//        this.primaryMobileNumber = primaryMobileNumber;
//        return this;
//    }
//
//    @Override
//    public ICustomerBuilder setSecondaryMobileNumber(String secondaryMobileNumber) {
//        this.secondaryMobileNumber = secondaryMobileNumber;
//        return this;
//    }
//
//
//    public Customer build(){
//        return new Customer(this);
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getMiddleName() {
//        return middleName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String getPrimaryEmail() {
//        return primaryEmail;
//    }
//
//    public String getSecondaryEmail() {
//        return secondaryEmail;
//    }
//
//    public String getPrimaryMobileNumber() {
//        return primaryMobileNumber;
//    }
//
//    public String getSecondaryMobileNumber() {
//        return secondaryMobileNumber;
//    }
//}
