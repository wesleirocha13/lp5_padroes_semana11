package visitor;

/**
 *
 * @author Weslei
 */
public class Manager implements Person{
    private String name;
    private String cpf;
    private int salary;

    public Manager(String name, String cpf, int salary) {
        this.name = name;
        this.cpf = cpf;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    
    public String getCpf() {
        return cpf;
    }

    public int getSalary() {
        return salary;
    }

    public String accept(Visitor visitor) {
        return visitor.getManagerInformations(this);
    }
}
