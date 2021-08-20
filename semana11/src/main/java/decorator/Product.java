package decorator;

/**
 *
 * @author Weslei
 */
public class Product implements IProduct{
   public float value;
   public String name;

    public Product() {
    }

    public Product(float value, String name) {
        this.value = value;
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public String getDescription() {
        return "Produto " + name;
    } 
}
