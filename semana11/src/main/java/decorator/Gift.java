package decorator;

/**
 *
 * @author Weslei
 */
public class Gift extends ProductDecorator{
    public Gift(IProduct product) {
        super(product);
    }

    public float getAdditionalValue() {
        return 10.0f;
    }

    public String getAdditionalDescription() {
        return "Presente";
    }
}
