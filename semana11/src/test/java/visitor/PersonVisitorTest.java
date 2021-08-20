package visitor;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class PersonVisitorTest {
    
    @Test
    public void returnCustomerInformations() {
        Customer customer = new Customer("Juca", "111.111.111-11", "juca@juca.com");

        PersonVisitor visitor = new PersonVisitor();
        assertEquals("Cliente{nome=Juca, cpf='111.111.111-11', email=juca@juca.com}", visitor.show(customer));
    }

    @Test
    public void deveExibirProfessor() {
        Manager manager = new Manager("Pedro", "222.222.222-22", 1000);

        PersonVisitor visitor = new PersonVisitor();
        assertEquals("Gestor{nome=Pedro, cpf='222.222.222-22', salario='1000'}", visitor.show(manager));
    }

    @Test
    public void deveExibirFuncionario() {
        Administrator sdministrator = new Administrator("Joao",1);

        PersonVisitor visitor = new PersonVisitor();
        assertEquals("Administrador{nome=Joao, codigo='1'}", visitor.show(sdministrator));
    }
    
}
