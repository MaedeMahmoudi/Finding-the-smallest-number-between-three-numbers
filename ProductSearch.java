import java.util.ArrayList;

public class ProductSearch {

        private ArrayList<Product> products; // لیستی از محصولات

        public ProductSearch() {
            // ساختن یک لیست پیش‌فرض محصولات
            this.products = getDefaultProducts();
        }

        public ArrayList<Product> searchProducts(String keyword) {
            ArrayList<Product> matchingProducts = new ArrayList<Product>();
            // جستجوی محصولات با استفاده از رشته جستجو
            for (Product product : products) {
                if (product.getName().contains(keyword)) {
                    matchingProducts.add(product);
                }
            }
            return matchingProducts;
        }

        private ArrayList<Product> getDefaultProducts() {
            // بازگرداندن یک لیست پیش‌فرض از محصولات
            ArrayList<Product> defaultProducts = new ArrayList<Product>();
            defaultProducts.add(new Product("tayd", 10000));
            defaultProducts.add(new Product("rika",15000 ));
            defaultProducts.add(new Product("mayee zarfshoyee",21000 ));
            defaultProducts.add(new Product("vaytex",32000 ));
            defaultProducts.add(new Product("shampoo",55000 ));
            defaultProducts.add(new Product("saboon",13000 ));
            defaultProducts.add(new Product("body splash",80000 ));
            defaultProducts.add(new Product("lif",20000 ));
            defaultProducts.add(new Product("makarony",20000 ));
            defaultProducts.add(new Product("reshte-soop",16000 ));
            defaultProducts.add(new Product("reshte-ash",18000 ));
            defaultProducts.add(new Product("rob",90000 ));
            defaultProducts.add(new Product("ab-porteghal",25000 ));
            defaultProducts.add(new Product("ab-havij",28000 ));
            defaultProducts.add(new Product("ab-anar",40000 ));
            defaultProducts.add(new Product("ab-sib",30000 ));
            defaultProducts.add(new Product("morgh",100000 ));
            defaultProducts.add(new Product("gosfandi",200000 ));
            defaultProducts.add(new Product("gav",180000 ));
            defaultProducts.add(new Product("goosale",170000 ));
            defaultProducts.add(new Product("reyhoon",12000 ));
            defaultProducts.add(new Product("jafari",9000 ));
            defaultProducts.add(new Product("piazche",10000 ));
            defaultProducts.add(new Product("nanu",14000 ));
            defaultProducts.add(new Product("avishan",11000 ));
            defaultProducts.add(new Product("sib",21000 ));
            defaultProducts.add(new Product("porteghal",18000 ));
            defaultProducts.add(new Product("hooloo",25000 ));
            defaultProducts.add(new Product("zardaloo",30000 ));
            defaultProducts.add(new Product("mooz",45000 ));
            defaultProducts.add(new Product("hendooneh",20000 ));
            defaultProducts.add(new Product("gilas",50000 ));
            return defaultProducts;
        }

            }
    class Product {
        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }

