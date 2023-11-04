package CreationalDesignPattern.Builder;

public interface ICustomerBuilder {
    ICustomerBuilder setFirstName(String firstName);
    ICustomerBuilder setLastName(String lastName);
    ICustomerBuilder setMiddleName(String middleName);
    ICustomerBuilder setPrimaryEmail(String primaryEmail);
    ICustomerBuilder setSecondaryEmail(String secondaryEmail);
    ICustomerBuilder setPrimaryMobileNumber(String primaryMobileNumber);
    ICustomerBuilder setSecondaryMobileNumber(String secondaryMobileNumber);

    Customer build();
}
