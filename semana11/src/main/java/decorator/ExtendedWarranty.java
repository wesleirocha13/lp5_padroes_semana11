package decorator;

/**
 *
 * @author Weslei
 */
public class ExtendedWarranty extends ProductDecorator{
    public ExtendedWarranty(IProduct product) {
        super(product);
    }

    public float getAdditionalValue() {
        return 50.0f;
    }

    public String getAdditionalDescription() {
        return "Garantia extendida";
    }
}
