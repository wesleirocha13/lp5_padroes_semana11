package visitor;

/**
 *
 * @author Weslei
 */
public class Customer implements Person{

    private String name;
    private String cpf;
    private String email;

    public Customer(String name, String cpf, String email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String accept(Visitor visitor) {
        return visitor.getCustomerInformations(this);
    }
}
