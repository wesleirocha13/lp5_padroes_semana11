package decorator;

/**
 *
 * @author Weslei
 */
public abstract class ProductDecorator implements IProduct{
    
    private IProduct product;
    public String description;

    public ProductDecorator(IProduct product) {
        this.product = product;
    }

    public IProduct getProduct() {
        return product;
    }

    public void setProduct(IProduct product) {
        this.product = product;
    }

    public abstract float getAdditionalValue();

    public float getValue() {
        return this.product.getValue() + this.getAdditionalValue();
    }

    public abstract String getAdditionalDescription();

    public String getDescription() {
        return this.product.getDescription() + "/" + this.getAdditionalDescription();
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
