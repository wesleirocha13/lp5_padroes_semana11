package decorator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class IProductTest {
    
    @Test
    public void returnProductValue() {
        IProduct product = new Product(100.0f, "Mouse");

        assertEquals(100.0f, product.getValue(),0.01);
    }

    @Test
    public void returnProductValueWithPersonalization() {
        IProduct product = new Personalization(new Product(100.0f, "Mouse"));

        assertEquals(130.0f, product.getValue(),0.01);
    }

    @Test
    public void returnProductValueWithGift() {
        IProduct product = new Gift(new Product(100.0f, "Mouse"));

        assertEquals(110.0f, product.getValue(),0.01);
    }

    @Test
    public void returnProductValueWithExtendedWarranty() {
        IProduct product = new ExtendedWarranty(new Product(100.0f, "Mouse"));

        assertEquals(150.0f, product.getValue(),0.01);
    }

    @Test
    public void returnProductValueWithPersonalizationPlusGift() {
        IProduct product = new Personalization(new Gift(new Product(100.0f, "Mouse")));

        assertEquals(140.0f, product.getValue(),0.01);
    }

    @Test
    public void returnProductValueWithPersonalizationPlusExtendedWarranty() {
        IProduct product = new Personalization(new ExtendedWarranty(new Product(100.0f, "Mouse")));

        assertEquals(180.0f, product.getValue(),0.01);
    }

    @Test
    public void returnProductValueWithGiftPlusExtendedWarranty() {
        IProduct product = new Gift(new ExtendedWarranty(new Product(100.0f, "Mouse")));

        assertEquals(160.0f, product.getValue(),0.01);
    }

    @Test
    public void returnProductValueWithPersonalizationPlusGiftPlusExtendedWarranty() {
        IProduct product = new Personalization(new Gift(new ExtendedWarranty(new Product(100.0f, "Mouse"))));

        assertEquals(190.0f, product.getValue(),0.01);
    }

    
    // Restornar Descrição
    
    
    @Test
    public void returnProductDescription() {
        IProduct product = new Product(100.0f, "Mouse");

        assertEquals("Produto Mouse", product.getDescription());
    }

    @Test
    public void returnProductDescriptionWithPersonalization() {
        IProduct product = new Personalization(new Product(100.0f, "Mouse"));
        
        assertEquals("Produto Mouse/Personalizacao", product.getDescription());
    }

    @Test
    public void returnProductDescriptionWithGift() {
        IProduct product = new Gift(new Product(100.0f, "Mouse"));
        
        assertEquals("Produto Mouse/Presente", product.getDescription());
    }

    @Test
    public void returnProductDescriptionWithExtendedWarranty() {
        IProduct product = new ExtendedWarranty(new Product(100.0f, "Mouse"));
        
        assertEquals("Produto Mouse/Garantia extendida", product.getDescription());
    }

    @Test
    public void returnProductDescriptionWithPersonalizationPlusGift() {
        IProduct product = new Personalization(new Gift (new Product(100.0f, "Mouse")));

        assertEquals("Produto Mouse/Presente/Personalizacao", product.getDescription());
    }

    @Test
    public void returnProductDescriptionWithPersonalizationPlusExtendedWarranty() {
        IProduct product = new Personalization(new ExtendedWarranty(new Product(100.0f, "Mouse")));

        assertEquals("Produto Mouse/Garantia extendida/Personalizacao", product.getDescription());
    }

    @Test
    public void returnProductDescriptionWithGiftPlusExtendedWarranty() {
        IProduct product = new Gift(new ExtendedWarranty(new Product(100.0f, "Mouse")));

        assertEquals("Produto Mouse/Garantia extendida/Presente", product.getDescription());
    }

    @Test
    public void returnProductDescriptionWithPersonalizationPlusGiftPlusExtendedWarranty() {
        IProduct product = new Personalization(new Gift(new ExtendedWarranty(new Product(100.0f, "Mouse"))));

        assertEquals("Produto Mouse/Garantia extendida/Presente/Personalizacao", product.getDescription());
    }
    
}
