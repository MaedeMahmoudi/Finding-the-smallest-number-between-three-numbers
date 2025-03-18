public class ProductFactor {
    private String productName;
    private int quantity;
    private double price;

    public ProductFactor(String productName,int quantity,double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
       this.quantity = quantity;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public void add(ProductFactor productFactor) {
        productFactor.add(productFactor);
    }

    public void remove(ProductFactor productFactors) {
        productFactors.remove(productFactors);
    }
}

