package visitor;

/**
 *
 * @author Weslei
 */
public interface Person {
    String accept(Visitor visitor);
}
