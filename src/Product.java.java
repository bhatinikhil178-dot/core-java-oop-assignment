public class Product {
    public static void main(String[] args) {
        Product p1 = new Product(100);
        System.out.println("Price of the product: " + p1.getPrice());
    }
    private int price;

    public Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    
}