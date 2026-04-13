public class ProductBilling {
    void bill(int price1) {
        System.out.println("Total Bill: " + price1);
    }

    void bill(int price1, int price2) {
        System.out.println("Total Bill: " + (price1 + price2));
    }

    void bill(int price1, int price2, int price3) {
        System.out.println("Total Bill: " + (price1 + price2 + price3));
    }

    public static void main(String[] args) {
        ProductBilling pb = new ProductBilling();
        pb.bill(100);
        pb.bill(100, 200);
        pb.bill(100, 200, 300);
    }

}
