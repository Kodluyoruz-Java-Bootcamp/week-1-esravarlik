public class Invoice {

    private double totalAmount;

    public Invoice() {
        this.totalAmount = 0;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void addProduct(Product product) {
        this.totalAmount += product.getPrice();
    }

}
