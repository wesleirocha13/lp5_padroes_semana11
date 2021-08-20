package visitor;

/**
 *
 * @author Weslei
 */
public interface Visitor {    
    String getCustomerInformations(Customer customer);
    String getManagerInformations(Manager manager);
    String getAdministratorInformations(Administrator administrator);
}
