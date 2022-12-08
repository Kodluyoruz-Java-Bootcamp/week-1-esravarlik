public class Product {

    private int id;
    private String productName;
    private String category;
    private Double price;
    private Integer stock;

    public Product(int id, String productName, String category, Double price, Integer stock) {
        this.id = id;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
