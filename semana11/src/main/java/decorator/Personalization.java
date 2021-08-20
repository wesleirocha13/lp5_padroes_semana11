package decorator;

/**
 *
 * @author Weslei
 */
public class Personalization extends ProductDecorator{
    public Personalization(IProduct product) {
        super(product);
    }

    public float getAdditionalValue() {
        return 30.0f;
    }

    public String getAdditionalDescription() {
        return "Personalizacao";
    }
}
