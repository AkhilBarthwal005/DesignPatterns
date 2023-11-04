package CreationalDesignPattern.Builder;

public class Client {
    public static void main(String[] args) {
        Customer customer = Customer.getBuilder()
                .setFirstName("Tony")
                .setLastName("Stark")
                .setPrimaryEmail("tonystark@abc.com")
                .setPrimaryMobileNumber("1234567890")
                .build();
        System.out.println(customer);
    }
}
