package CreationalDesignPattern.Builder;

import java.util.Locale;

public class Customer {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String primaryEmail;
    private final String secondaryEmail;
    private final String primaryMobileNumber;
    private final String secondaryMobileNumber;

    private Customer(CustomerBuilder customerBuilder) {
        this.firstName = customerBuilder.getFirstName();
        this.middleName = customerBuilder.getMiddleName();
        this.lastName = customerBuilder.getLastName();
        this.primaryEmail = customerBuilder.getPrimaryEmail();
        this.secondaryEmail = customerBuilder.getSecondaryEmail();
        this.primaryMobileNumber = customerBuilder.getPrimaryMobileNumber();
        this.secondaryMobileNumber = customerBuilder.getSecondaryMobileNumber();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public String getPrimaryMobileNumber() {
        return primaryMobileNumber;
    }

    public String getSecondaryMobileNumber() {
        return secondaryMobileNumber;
    }

    public static CustomerBuilder getBuilder(){
        return new CustomerBuilder();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", primaryEmail='" + primaryEmail + '\'' +
                ", secondaryEmail='" + secondaryEmail + '\'' +
                ", primaryMobileNumber='" + primaryMobileNumber + '\'' +
                ", secondaryMobileNumber='" + secondaryMobileNumber + '\'' +
                '}';
    }


    public static class CustomerBuilder implements ICustomerBuilder{

        private String firstName;
        private String middleName;
        private String lastName;
        private String primaryEmail;
        private String secondaryEmail;
        private String primaryMobileNumber;
        private String secondaryMobileNumber;



        @Override
        public ICustomerBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        @Override
        public ICustomerBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @Override
        public ICustomerBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        @Override
        public ICustomerBuilder setPrimaryEmail(String primaryEmail) {
            this.primaryEmail = primaryEmail;
            return this;
        }

        @Override
        public ICustomerBuilder setSecondaryEmail(String secondaryEmail) {
            this.secondaryEmail = secondaryEmail;
            return this;
        }

        @Override
        public ICustomerBuilder setPrimaryMobileNumber(String primaryMobileNumber) {
            this.primaryMobileNumber = primaryMobileNumber;
            return this;
        }

        @Override
        public ICustomerBuilder setSecondaryMobileNumber(String secondaryMobileNumber) {
            this.secondaryMobileNumber = secondaryMobileNumber;
            return this;
        }


        public Customer build(){
            return new Customer(this);
        }

        public String getFirstName() {
            return firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getPrimaryEmail() {
            return primaryEmail;
        }

        public String getSecondaryEmail() {
            return secondaryEmail;
        }

        public String getPrimaryMobileNumber() {
            return primaryMobileNumber;
        }

        public String getSecondaryMobileNumber() {
            return secondaryMobileNumber;
        }
    }

}
