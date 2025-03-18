import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class FactorForosh {
    private String nameproduct;
    private Date factorforoshData;
    private List<ProductFactor>productFactors;

    public FactorForosh(String nameproduct,Date factorforoshData){
        this.nameproduct = nameproduct;
        this.factorforoshData = factorforoshData;
        ArrayList<ProductFactor> productFactors = new ArrayList<ProductFactor>();
    }
    public void addproduct(ProductFactor productFactor) {
        productFactor.add(productFactor);
    }
    public void removeproduct(System productname) {
        for (ProductFactor productFactors : productFactors) {
            if ((productFactors.getProductName()).equals( productname)) {
                productFactors.remove(productFactors);
                break;
            }
        }
    }
    public double getSubtotal(){
        double subtotal = 0;
        for(ProductFactor productfactor : productFactors){
            subtotal +=productfactor.getPrice();
    }
        return subtotal;
  }
  public double getTax(){//تابع برای  محاسبه مالیات
        double taxRate = 0.05;//5% مالیات بر ارزش افزوده
        return getSubtotal()*taxRate;
    }
    public double getTotal(){
        return getSubtotal()+getTax();
    }
 }

