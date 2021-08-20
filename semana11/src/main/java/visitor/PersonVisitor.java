package visitor;

/**
 *
 * @author Weslei
 */
public class PersonVisitor implements Visitor{
    public String show(Person person) {
        return person.accept(this);
    }

    @Override
    public String getCustomerInformations(Customer customer) {
        return "Cliente{" +
                "nome=" + customer.getName()+
                ", cpf='" + customer.getCpf()+ '\'' +
                ", email=" + customer.getEmail()+
                '}';
    }

    @Override
    public String getManagerInformations(Manager manager) {
        return "Gestor{" +
                "nome=" + manager.getName()+
                ", cpf='" + manager.getCpf()+ '\'' +
                ", salario='" + manager.getSalary() + '\'' +
                '}';
    }

    @Override
    public String getAdministratorInformations(Administrator administrator) {
        return "Administrador{" +
                "nome=" + administrator.getName()+
                ", codigo='" + administrator.getId()+ '\'' +
                '}';
    }
}
