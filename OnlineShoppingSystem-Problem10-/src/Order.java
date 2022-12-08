import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> products;
    private Invoice invoice;

    public Order() {
        this.products = new ArrayList<>();
        this.invoice = new Invoice();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

}
